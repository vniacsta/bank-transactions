package org.academiadecodigo.asynctomatics.banktransactions;

public enum Bank {

    BEST_BANK(380, 1234);

    private int balance;
    private int secretPin;

    Bank(int balance, int secretPin) {
        this.balance = balance;
        this.secretPin = secretPin;
    }

    public void depositMoney(String name, int needToDeposit) {
        if (Person.getPin() == secretPin) {
            balance += needToDeposit;
            System.Balaout.println("Hello " + name + "! Deposit confirmed.");
            displaynce();
        }
    }

    public void withdrawMoney(String name, int needToWithdraw) {
        if (Person.getPin() == secretPin) {
            if (balance > 1) {
                balance -= needToWithdraw;
                System.out.println("Hello " + name + "! Amount of " + needToWithdraw +
                        " EUR successfully withdrawn.");
            } else {
                System.out.println("Sorry " + name + "" + "! No funds of that amount. Check your " +
                        "balance.");
            }
            displayBalance();
        }
    }

    public void transferMoney(String name, int needToTransfer) {
        if (Person.getPin() == secretPin) {
            if (balance > 1) {
                balance -= needToTransfer;
                System.out.println("Hello " + name + "! Amount of " + needToTransfer +
                        " EUR successfully transferred.");
            } else {
                System.out.println("Sorry " + name + "" + "! No funds to transfer that amount. " +
                        "Check your balance.");
            }
            displayBalance();
        }
    }

    public void displayBalance() {
        if (Person.getPin() == secretPin) {
            System.out.println("Your current balance is " + balance + ".");
        } else {
            System.out.println("Please provide a valid pin to access your account.");
        }
    }
}

