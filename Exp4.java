class Account {

    String name = "Thangam";
    String accountNo = "123456789";

    void display() {
        System.out.println("Account Holder Name: " + name);
        System.out.println("Account Number: " + accountNo);
    }
}

class SavingsAccount extends Account {

    @Override
    void display() {
        super.display();
        System.out.println("Savings Account");
    }
}

class CurrentAccount extends Account {

    @Override
    void display() {
        super.display();
        System.out.println("Current Account");
    }
}

class PremiumSavingsAccount extends SavingsAccount {

    @Override
    void display() {
        super.display();
        System.out.println("Premium Savings Account");
    }
}

class Main {

    public static void main(String[] args) {

        System.out.println("Savings Account");

        SavingsAccount saving = new SavingsAccount();
        saving.display();

        System.out.println("\nCurrent Account");

        CurrentAccount current = new CurrentAccount();
        current.display();

        System.out.println("\nPremium Account");

        PremiumSavingsAccount premium = new PremiumSavingsAccount();
        premium.display();
    }
}