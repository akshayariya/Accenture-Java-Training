package Polymorhism;

class Payment {

    int balance;

    // //constructor can be overload not override
    // public void Payment(){
    // System.out.println("Constructor wihtout Parameter");
    // }

    // public void Payment(int a){
    // System.out.println(" Constructor with paramenter to overload: "+a);
    // }

    public void payment() {
        System.out.println("Enter option");
        System.out.println("Paytm");
        System.out.println("Phone Pay");
        System.out.println("Google zPay");

    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

}

class PhonePay extends Payment {

    @Override
    public void payment() {
        System.out.println("Payment using PhonePay: " + balance);
    }
}

class Paytm extends Payment {
    @Override
    public void payment() {
        System.out.println("Payment using Paytm: " + balance);
    }

}

class GooglePay extends Payment {
    @Override
    public void payment() {
        System.out.println("Payment using Google Pay: " + balance);
    }

}

public class PaymentApp {
    public static void main(String[] args) {
        Payment b = new PhonePay();
        b.setBalance(500);
        b.payment();
        // b.Payment(5);
        // b.Payment();
    }
}

// dynammic method dispatch
