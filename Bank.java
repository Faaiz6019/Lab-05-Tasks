
    class Account {
        private int accountNumber;
        private double balance;

        private static int totalAccounts = 0;
        private static double totalBankBalance = 0;

        public Account(int accountNumber, double balance) {
            this.accountNumber = accountNumber;
            this.balance = balance;

            totalAccounts++;
            totalBankBalance += balance;
        }

        public void displayAccount() {
            System.out.println("Account Number: " + accountNumber + ", Balance: " + balance);
        }

        public static void displayBankSummary() {
            System.out.println("Total Accounts: " + totalAccounts);
            System.out.println("Total Bank Balance: " + totalBankBalance);
        }
    }

    public class Bank {
        public static void main(String[] args) {

            Account acc1 = new Account(101, 5000);
            Account acc2 = new Account(102, 12000);
            Account acc3 = new Account(103, 3000);
            Account acc4 = new Account(104, 8000);

            acc1.displayAccount();
            acc2.displayAccount();
            acc3.displayAccount();
            acc4.displayAccount();

            Account.displayBankSummary();
        }
    }

