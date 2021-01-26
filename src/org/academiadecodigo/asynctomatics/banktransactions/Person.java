package org.academiadecodigo.asynctomatics.banktransactions;

public class Person {

    private String name;
    private static int pin;

    // creating the constructor
    public Person(String name, int pin) {
        this.name = name;
        Person.pin = pin;
    }

    public static int getPin() {
        return pin;
    }

    // methods to communicate to the bank
    public void checkBalance() {
        Bank.BEST_BANK.displayBalance(name);
    }

    public void depositMoney(int needToDeposit) {
        Bank.BEST_BANK.depositMoney(name, needToDeposit);
    }

    public void withdrawMoney(int needToWithdraw) {
        Bank.BEST_BANK.withdrawMoney(name, needToWithdraw);
    }

    public void transferMoney(int needToTransfer) {
        Bank.BEST_BANK.transferMoney(name, needToTransfer);
    }
}
