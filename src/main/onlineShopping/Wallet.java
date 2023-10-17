package main.onlineShopping;

import java.util.Scanner;

public class Wallet {
    private static int nextWalletId = 1000;
    int walletId;
    int customerId;
    double balance;
    double rewardPoint;
    String pin;

    @Override
    public String toString() {
        return "Wallet :" +
                "\nwalletId=" + walletId +
                ",\ncustomerId=" + customerId +
                ",\nbalance=" + balance +
                ",\nrewardPoint=" + rewardPoint +
                ",\npin='" + pin;
    }


    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getRewardPoint() {
        return rewardPoint;
    }

    public void setRewardPoint(double rewardPoint) {
        this.rewardPoint = rewardPoint;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    Wallet(int customerId, Long balance, Long rewardPoint, String pin) {
        this.walletId = nextWalletId++;
        this.customerId = customerId;
        this.balance = balance;
        this.rewardPoint = rewardPoint;
        this.pin = pin;
    }

    public void convertRewardPointToRs() {
        if (10 >= this.rewardPoint) {
            this.balance += this.rewardPoint / 10;
            this.rewardPoint += this.rewardPoint % 10;
        }
    }

    public void addWalletAmount(double amount){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Wallet pin");
        String  pin = sc.nextLine();
        if(this.pin.equals(pin)){
            this.setBalance( this.balance+amount);
        }else {
            System.out.println("Sorry, Enter the correct PIN");
            addWalletAmount(amount);
        }
    }


}
