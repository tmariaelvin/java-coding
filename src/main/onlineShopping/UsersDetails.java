package main.onlineShopping;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class UsersDetails {
    Scanner sc = new Scanner(System.in);
    private static int nextId = 1;
    int id;
    String name;
    String email;
    String mobileNumber;
    String password;
    Wallet wallet;
    List<OrdersHistory> ordersHistory = new ArrayList<>();

    Privilege privilege;

    Cart cart;


    @Override
    public String toString() {
        return "UsersDetails" +
                "\nid = " + id +
                ", \nname = '" + name + '\'' +
                ", \nemail = '" + email + '\'' +
                ", \nmobileNumber = '" + mobileNumber + '\'' +
                ", \npassword = ' " + password + '\'' +
                ", \nwallet = " + wallet +
                ", \nprivilege = " + privilege +
                "\n++++++-------+++++++++---------++++++++\n";
    }

    UsersDetails(String name, String email, String mobileNumber, String password, Privilege privilege) {
        this.id = nextId++;
        this.name = name;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.password = this.encryptedPassword(password);
        this.privilege = privilege;
        this.createCustomerWalletData();
    }

    public void createCustomerWalletData() {
        if (this.privilege == Privilege.CUSTOMER) {
            wallet = new Wallet(this.id, 1000L, 100L, "1234");
        }
    }


    public String getName() {
        return name;
    }

    public Privilege getPrivilege() {
        return privilege;
    }

    public void setPrivilege(Privilege privilege) {
        this.privilege = privilege;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String encryptedPassword(String password) {
        char[] charPassword = new char[password.length()];
        for (int i = 0; i < password.length(); i++) {
            charPassword[i] = password.charAt(i);
        }
        for (int i = 0; i < charPassword.length; i++) {
            if (charPassword[i] == 'z' || charPassword[i] == 'Z') {
                charPassword[i] -= 25;
            } else if (charPassword[i] == '9') {
                charPassword[i] -= 9;
            } else {
                charPassword[i] += 1;
            }
        }
        return new String(charPassword);
    }


    public void changeUserPassword() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Old password");
        String oldPassword = sc.nextLine();
        if (this.password.equals(this.encryptedPassword(oldPassword))) {
            System.out.println("Enter the new password");
            String newPassword = sc.nextLine();
            this.setPassword(this.encryptedPassword(newPassword));
            System.out.println(this.toString());
        } else {
            System.out.println("Enter the valid password");
            this.changeUserPassword();
        }
    }

    public int getId() {
        return id;
    }

    public void updateUserProfile() {
        System.out.println("Do you want to change the name");
        if (this.isConfirm()) {
            System.out.println("Enter the new name");
            String newName = sc.nextLine();
            this.setName(newName);
        }
        System.out.println("Do you want to change the Email");
        if (this.isConfirm()) {
            System.out.println("Enter the new Email");
            String newEmail = sc.nextLine();
            this.setEmail(newEmail);
        }
        System.out.println("Do you want to change the mobile Number");
        if (this.isConfirm()) {
            System.out.println("Enter the new mobile Number");
            String newMobileNumber = sc.nextLine();
            this.setMobileNumber(newMobileNumber);
        }

    }

    public Boolean isConfirm() {
        System.out.println("Are you sure : yes or no");
        String select = sc.nextLine();
        return select.equals("yes");
    }

    public void addToCart(ProductDetails productDetail, int quantity) {
        cart = new Cart(productDetail, quantity, wallet.getBalance());
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }

    public void setOrderHistory(List<OrdersHistory> ordersHistory) {
        this.ordersHistory = ordersHistory;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public void createOrderHistory() {
        this.ordersHistory = ordersHistory;
    }

    public void cancelOrder() {
        String orderId = sc.nextLine();
        this.findOrder(orderId);
    }

    public void findOrder(String orderId) {
        for (OrdersHistory ordersHistory : ordersHistory)
            if (ordersHistory.getOrderStatus() == State.PROGRESS && ordersHistory.getOrderId().equals(orderId)) {
                ordersHistory.setOrderStatus(State.CANCEL);
            }
    }

    public void viewPurchaseHistory() {
        System.out.println("Show ALL Order History OR CANCEL / COMPLETE");
        System.out.println("Chooses any one Like : \n1.ALL\n2.CANCEL\n3.COMPLETE");

        switch (sc.nextInt()) {
            case 1 -> this.showALlOrderHistory();
            case 2 -> this.showSelectedOrder(State.CANCEL);
            case 3 -> this.showSelectedOrder(State.COMPLETE);
            case 4 -> {
                System.out.println("Sorry, Choose correct Order status");
                this.viewPurchaseHistory();
            }
        }

    }

    public void showALlOrderHistory() {
        for (OrdersHistory ordersHistory : ordersHistory)
            System.out.println(ordersHistory.toString());
    }

    public void showSelectedOrder(State orderStatus) {
        for (OrdersHistory ordersHistory : ordersHistory)
            if (ordersHistory.orderStatus.equals(orderStatus))
                System.out.println(ordersHistory.toString());
    }

    public void addCustomerWalet(double amount) {
        this.wallet.addWalletAmount(amount);
    }

    public void viewWalletBalance() {
        System.out.println(this.wallet.toString());
    }

    public void redeemRewardPoints() {
        this.wallet.convertRewardPointToRs();
    }

}

