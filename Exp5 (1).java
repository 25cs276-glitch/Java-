class Payment {

    // Method 1 - Overloading
    public void makePayment(double amount) {
        System.out.println(
            "Payment was successfully paid of rupees " + amount
        );
    }

    // Method 2 - Overloading
    public void makePayment(double amount, String type) {
        System.out.println(
            "Payment was successfully paid of rupees " + amount
        );
        System.out.println(
            "Payment was done by using the " + type
        );
    }
}

class UpiPayment extends Payment {

    // Method overriding
    @Override
    public void makePayment(double amount) {
        System.out.println(
            "UPI Payment was successfully paid of rupees " + amount
        );
    }
}

class Main {

    public static void main(String[] args) {

        System.out.println("Method Overloading Example");

        Payment p = new Payment();

        p.makePayment(10000);
        p.makePayment(15000, "Cash");

        System.out.println("\nExample Method Overriding");

        UpiPayment up = new UpiPayment();

        up.makePayment(20000);
    }
}