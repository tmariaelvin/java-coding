package main.sample;

public class TestAccount {
        public static void main(String[] args) {
            //creating instance of Account class
            Acc acc=new Acc();
            //setting values through setter methods
            acc.setAcc_no(7560504000L);
            acc.setName("Sonoo Jaiswal");
            acc.setEmail("sonoojaiswal@javatpoint.com");
            acc.setAmount(500000f);
            //getting values through getter methods
            System.out.println(acc.getAcc_no()+"\n "+acc.getName()+"\n "+acc.getEmail()+"\n "+acc.getAmount());
        }
    }