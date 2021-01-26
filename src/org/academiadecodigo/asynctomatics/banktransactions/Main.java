package org.academiadecodigo.asynctomatics.banktransactions;

public class Main {

    public static void main(String[] args) {

        // creating a new instance person
        Person person = new Person("Elsa", 1234);

        // call several methods depending on what you want to do
        person.checkBalance();
        person.depositMoney(1300);
        person.withdrawMoney(270);
        person.withdrawMoney(430);
        person.transferMoney(250);
    }
}
