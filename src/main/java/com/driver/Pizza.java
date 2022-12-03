package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int[] CheeseToppingsBagBill = new int[4];

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        for(int i=0;i<4;i++) {this.CheeseToppingsBagBill[i] = 0;}
        if(this.isVeg) this.price = 300;
        else this.price = 400;
        this.bill = "Base Price Of The Pizza: "+this.price+"\n";
    }

    public int getPrice(){
        if(CheeseToppingsBagBill[0]!=0) {
            this.price += 80;
        }
        if(CheeseToppingsBagBill[1]!=0) {
            if (this.isVeg) {
                this.price += 70;
            } else {
                this.price += 120*CheeseToppingsBagBill[1];
            }
        }
        if(CheeseToppingsBagBill[2]!=0) {
            this.price += 20;
        }
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        this.CheeseToppingsBagBill[0]++;
    }

    public void addExtraToppings(){
        // your code goes here
        this.CheeseToppingsBagBill[1]++;
    }

    public void addTakeaway(){
        // your code goes here
        this.CheeseToppingsBagBill[2]++;
    }

    public String getBill(){
        // your code goes here
        if(CheeseToppingsBagBill[0]!=0) {
            this.bill += "Extra Cheese Added: 80\n";
        }
        if(CheeseToppingsBagBill[1]!=0) {
            if (this.isVeg) {
                this.bill += "Extra Toppings Added: 70\n";
            } else {
                this.bill += "Extra Toppings Added: 120\n";
            }
        }
        if(CheeseToppingsBagBill[2]!=0) {
            this.bill += "Paperbag Added: 20\n";
        }
        if(CheeseToppingsBagBill[3]==0) {
            this.bill += "Total Price: " + getPrice() + "\n";
            CheeseToppingsBagBill[3]++;
            return this.bill;
        }else return "";
    }
}