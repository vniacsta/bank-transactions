package org.academiadecodigo.asynctomatics.banktransactions;

public enum Bank {

    BEST_BANK(380);

    private int balance;

    Bank(int balance) {
        this.balance = balance;
    }

    public void depositMoney(String name, int needToDeposit) {
        balance += needToDeposit;
        System.out.println("Hello " + name + "! Deposit confirmed.");
        displayBalance(name);
    }

    public void withdrawMoney(String name, int needToWithdraw) {
        if (balance > 1) {
            balance -= needToWithdraw;
            System.out.println("Hello " + name + "! Amount of " + needToWithdraw +
                    " EUR successfully withdrawn.");
            displayBalance(name);
        } else {
            System.out.println("Sorry " + name + "" + "! No funds of that amount. Check your " +
                    "balance.");
            displayBalance(name);
        }
    }

    public void transferMoney(String name, int needToTransfer) {
        if (balance > 1) {
            balance -= needToTransfer;
            System.out.println("Hello " + name + "! Amount of " + needToTransfer +
                    " EUR successfully transferred.");
            displayBalance(name);
        } else {
            System.out.println("Sorry " + name + "" + "! No funds to transfer that amount. " +
                    "Check your balance.");
            displayBalance(name);
        }
    }

    public void displayBalance(String name) {
        System.out.println("Your current balance is " + balance + ".");
    }
}

