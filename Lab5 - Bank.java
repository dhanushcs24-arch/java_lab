import java.util.Scanner;

class account {
    String customername;
    int accNumber;
    String accType;
    double balance;

    account(String name, int accNo, String type, double bal) {
        this.customername = name;
        this.accNumber = accNo;
        this.accType = type;
        this.balance = bal;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited : " + amount);
        } else {
            System.out.println("Invalid amount entered");
        }
    }

    void displayBal() {
        System.out.println("Account Holder : " + customername);
        System.out.println("Account No. : " + accNumber);
        System.out.println("Account Type : " + accType);
        System.out.println("Balance : " + balance);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Money Withdrawn : " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

class SavAcc extends account {
    double intRate;

    SavAcc(String name, int accNo, double bal, double intRate) {
        super(name, accNo, "Savings", bal);
        this.intRate = intRate;
    }

    void computeAnddepositInt(int years) {
        double interest = balance * Math.pow((1 + intRate), years) - balance; // CI formula
        balance += interest;
        System.out.println("Interest for " + years + " years added : " + interest);
    }

    @Override
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Money Withdrawn : " + amount);
            System.out.println("Updated Balance : " + balance);
        } else {
            System.out.println("Insufficient Balance");
        }
    }
}

class currAcc extends account {
    double minBal = 1000;
    double penalty = 100;

    currAcc(String name, int accNo, double bal) {
        super(name, accNo, "Current", bal);
    }

    void checkMinBal() {
        if (balance < minBal) {
            balance -= penalty;
            System.out.println("Balance below minimum! Penalty of " + penalty + " imposed.");
        }
    }

    @Override
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Money Withdrawn : " + amount);
            System.out.println("Updated Balance : " + balance);
            checkMinBal();
        } else {
            System.out.println("Insufficient Balance");
        }
    }
}

public class Lab5 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        // Savings Account
        SavAcc sav = new SavAcc("Harsh", 27417410, 3000, 0.05);
        sav.displayBal();

        System.out.println("Enter number of years to check compound interest : ");
        int years = inp.nextInt();
        sav.computeAnddepositInt(years);

        // withdrawing
        sav.withdraw(2000);

        System.out.print("\n");

        // Current Account
        currAcc cur = new currAcc("Ram", 1253812, 2500);

        cur.displayBal();  // fixed: showing current account balance
        cur.withdraw(1501);
        cur.displayBal();

        inp.close();
    }
}
