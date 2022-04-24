package InterfaceAbstraction;
// interface and class level inheritance
// form Interface to class we need to use "implements" keyword
// used initial abstract word because we did not implement ATM and moneytransfer method
abstract public class Hsbc implements Bank {
    public void withdrawal() {
        System.out.println("This is Withdrawal Method form /Bank/ interface class");
    }
    public void loan() {
        System.out.println("This is Loan Method form /Bank/ interface class");
    }
    public void balance() {
        System.out.println("This is Balance Method form /Bank/ interface class");
    }
    public abstract void ATM(); // form Bank interface i didn't implement this method
    public abstract void moneyTransfer(); // form Bank interface i didn't implement this method

    public static void main(String[] args) {
        Hsbc hsbc = new Hsbc() {
            @Override
            public void ATM() {
            }

            @Override
            public void moneyTransfer() {
            }
        };
        hsbc.withdrawal();
        hsbc.balance();
        hsbc.loan();
    }
}
