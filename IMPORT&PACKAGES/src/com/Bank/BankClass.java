package com.Bank;

public class BankClass {
    private int accNo;

    private String accHolderName;

    private double accbalance;

    public BankClass(int accNo, String accHolderName, double accbalance){
        this.accNo = accNo;
        this.accHolderName = accHolderName;
        this.accbalance = accbalance;
    }

    public void deposit(int amount){
        this.accbalance += amount;
    }

    public void withdraw(int amount){
        if(amount > this.accbalance || amount > 100000){
            System.out.println("Transaction Failed");
            System.out.println("The" + amount + " can't be withdraw");
        }else{
            this.accbalance -= amount;
            System.out.println("The Amount has been Withdraw");
        }
    }

    public double showbalance(){
        return this.accbalance;
    }
}
