package L3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Code1 {
    static List<Customer> customerList = new ArrayList<>();

    static List<AccountStatement> accountStatement = new ArrayList<>();

    static int selected ;
    static int transid = 1;
    static Customer currentCustomer = null;
    static Scanner sc =new Scanner(System.in);
    public static void main(String[] args){

        Customer customer1 = new Customer(11,101,"elvin",1000,"ABC2134");
        Customer customer2 = new Customer(22,102,"arun",1000,"ABC1234");
        Customer customer3 = new Customer(33,103,"alag",1000,"ABC2534");
        Customer customer4 = new Customer(44,104,"isac",1000,"ABC2734");
        customerList.add(customer1);
        customerList.add(customer2);
        customerList.add(customer3);
        customerList.add(customer4);

     selected =  intialization();


        switch (selected) {

            case 1 :
                getAllCustomerDetail(customerList);
                intialization();
            case 2 :
                createCustomerList();
                intialization();
            case 3 :
                loginCustomer();
            case 4 :
                getCustomerDetails(currentCustomer);
                userLogIn();
            case 5 :
                getBasicOperation(currentCustomer);
                userLogIn();
            case 6 :
                showHistory();
                userLogIn();
            case 7 :
                logOut();
        }

    }

    public static void showHistory() {
        System.out.println(" transId ------  amount ------   balance" );
        for (AccountStatement statement : accountStatement) {
            System.out.println(statement);
        }

    }

    public static void getBasicOperation (Customer currentCustomer) {
        System.out.println("Select any One ");
        System.out.println("1 => Atm Withdraw");
        System.out.println("2 => Cash deposit");
        System.out.println("3 => Account transfer");
        System.out.println("4 => exit");


        int select = sc.nextInt();


        switch (select) {
            case 1 :
                System.out.println("enter the Withdraw Ammount");
                int withDraw  = sc.nextInt();
                currentCustomer.balance = currentCustomer.balance - withDraw ;
                currentCustomer.setBalance(currentCustomer.balance);
               transid++;
              String atmWithdraw = "Atm WithDraw" ;
              long balance = currentCustomer.getBalance();
                AccountStatement accountStatement1= new AccountStatement(transid,atmWithdraw,withDraw,balance);
                accountStatement.add(accountStatement1);
                getBasicOperation(currentCustomer);
            case 2 :
                System.out.println("enter the deposit Ammount");
                int depositAmmount = sc.nextInt();
                currentCustomer.balance = currentCustomer.balance + depositAmmount;
                currentCustomer.setBalance(currentCustomer.balance);
                transid++;
                String deposit = "Cash deposit" ;
                long balances = currentCustomer.getBalance();
                AccountStatement accountStatement2 = new AccountStatement(transid,deposit,depositAmmount,balances);
                accountStatement.add(accountStatement2);
                getBasicOperation(currentCustomer);
            case 3 :
                System.out.println("enter the Account Transfer Ammount");
                long ammount = sc.nextInt();
                System.out.println("select another account ");
                showAnotherAccount(ammount);



        }


    }

    public static void showAnotherAccount(long ammount) {
        System.out.println("Select Account id : ");
        for(int i =0 ; i<customerList.size();i++) {
            System.out.println(i + "  => "+ customerList.get(i).accountNo);
        }
        int selectedAccount = sc.nextInt();
        checkSelectedAccount(selectedAccount,ammount);
    }

public static void checkSelectedAccount(long selectedAccount,Long ammount) {

    for (Customer customer : customerList) {
        if (customer.accountNo == selectedAccount) {
            long current = customer.getBalance() + ammount;
            customer.setBalance(current);
            transid++;
            String transfer = "transfer";
            Long balances1 = currentCustomer.getBalance();
            AccountStatement accountStatement3 = new AccountStatement(transid, transfer, ammount, balances1 - ammount);
            accountStatement.add(accountStatement3);
        }
    }
}

    public static void loginCustomer() {
        System.out.println("Enter User name : ");
        String name = sc.nextLine();
        System.out.println("enter Password :");
        String password = sc.nextLine();
        String decryptionPass = passwordDecryption(password);
        int flag = 0;
        for (Customer customer : customerList) {
            String checkName = customer.name;
            String checkPassword = customer.encryptPassword;
            if (checkName.equals(name) && checkPassword.equals(decryptionPass)) {
                flag = 1;
                userLogIn();
                currentCustomer = customer;
            }

        }
 if(flag == 0) {
     loginfaild();
 }
    }

    public static void loginfaild() {
        System.out.println(" Please enter currect Password ");
        intialization();
    }


public static void getCustomerDetails (Customer customer) {
    System.out.println(customer);
}

    public static String passwordDecryption(String password) {
        String results ;
        int len = password.length();
        char[] chars = new char[len];
        for(int i=0;i<len;i++){
            chars[i] = password.charAt(i);
        }
        for(int i=0;i<len;i++) {
            if(chars[i] >= 'a' && chars[i] <= 'z' || chars[i] >= 'A' && chars[i] <= 'B' ) {
                if(chars[i] == 'a' || chars[i] =='A'){
                    chars[i] = (char) (chars[i] + 26);
                }
                chars[i] = (char) (chars[i] +1);
            }
            else if(chars[i] >= '0' && chars[i] <= '9' ) {
                if(chars[i] == '0'){
                    chars[i] = '9';
                }
                chars[i] = (char) (chars[i] - 1);
            }
        }
        results = String.valueOf(chars);
        return results;
    }

    public static void userLogIn() {
        System.out.println("SuccessFully Login");
        System.out.println("4 => Show Customer Data");
        System.out.println("5 => Show Basic Operation");
        System.out.println("6 => show history");
        System.out.println("7 => logOut");
        selected = sc.nextInt();
    }

    public static void logOut(){
        intialization();
    }

    public static void createCustomerList() {
        Customer customer;
        Scanner sc =new Scanner(System.in);
        System.out.println("enter name : ");
        String name = sc.nextLine();
        System.out.println("enter  Password : ");
        String password = sc.nextLine();
        System.out.println("enter  re-type Password : ");
        String rePassword = sc.nextLine();
        if(password.compareTo(rePassword) == 0 ){
            String encryptionPassword  = passwordEncryption(password) ;
            System.out.println(encryptionPassword);
          customer = new Customer(55,1006,name,1000,encryptionPassword);
          customerList.add(customer);
        }
    }

    public static String passwordEncryption(String password) {
        String results ;
        int len = password.length();
        char[] chars = new char[len];
        for(int i=0;i<len;i++){
            chars[i] = password.charAt(i);
        }
        for(int i=0;i<len;i++) {
            if(chars[i] >= 'a' && chars[i] <= 'z' || chars[i] >= 'A' && chars[i] <= 'B' ) {
                if(chars[i] == 'z' || chars[i] =='Z'){
                    chars[i] = (char) (chars[i]+ 25);
                }
                chars[i] = (char) (chars[i] + 1);
            }
            else if(chars[i] >= '0' && chars[i] <= '9' ) {
                if(chars[i] == '9'){
                    chars[i] = '0';
                }
                chars[i] = (char) (chars[i] + 1);
            }
        }
        results = String.valueOf(chars);
        return results;
    }
    public static void getAllCustomerDetail(List<Customer> customerList) {
        for (Customer customer : customerList) {
            System.out.println(customer);
        }
    }

    public static int intialization() {

        System.out.println("Select any One");
        System.out.println("1 => Show All Customer");
        System.out.println("2 => Create Customer");
        System.out.println("3 => LogIn");
        return  selected = sc.nextInt();
    }
}



class Customer {
    int custId;
    long accountNo;
    String name;
    long balance;
    String encryptPassword;

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public long getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(long accountNo) {
        this.accountNo = accountNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "custId=" + custId +
                ", accountNo=" + accountNo +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                ", encryptPassword='" + encryptPassword + '\'' +
                '}';
    }

    public String getEncryptPassword() {
        return encryptPassword;
    }

    public void setEncryptPassword(String encryptPassword) {
        this.encryptPassword = encryptPassword;
    }



    Customer(int custId,long accountNo,String name, long balance,String encryptPassword ){
        this.custId = custId;
        this.accountNo = accountNo;
        this.name = name;
        this.balance = balance ;
        this.encryptPassword = encryptPassword;
    }
}


class AccountStatement {

    int transId ;
    String transType;

    @Override
    public String toString() {
        return "AccountStatement{" +
                "transId=" + transId +
                ", transType='" + transType + '\'' +
                ", amount=" + amount +
                ", balance=" + balance +
                '}';
    }

    long amount;
    long balance;

    public int getTransId() {
        return transId;
    }

    public void setTransId(int transId) {
        this.transId = transId;
    }

    public String getTransType() {
        return transType;
    }

    public void setTransType(String transType) {
        this.transType = transType;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public AccountStatement(int transId, String transType, long amount, long balance) {
        this.transId = transId;
        this.transType = transType;
        this.amount = amount;
        this.balance = balance;
    }
}
