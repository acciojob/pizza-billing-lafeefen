package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean[] CheeseToppingsBagBill = new boolean[4];

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        for(int i=0;i<4;i++) {this.CheeseToppingsBagBill[i] = false;}
        if(isVeg) this.price = 300;
        else this.price = 400;
        this.bill = "Base Price Of The Pizza: "+this.price+"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!CheeseToppingsBagBill[0]) {
            this.price += 80;
            this.bill += "Extra Cheese Added: 80\n";
        }
        CheeseToppingsBagBill[0] = true;
    }

    public void addExtraToppings(){
        // your code goes here
        if(!CheeseToppingsBagBill[1]) {
            if (isVeg) {
                this.price += 70;
                this.bill += "Extra Toppings Added: 70\n";
            } else {
                this.price += 120;
                this.bill += "Extra Toppings Added: 120\n";
            }
        }
        CheeseToppingsBagBill[1] = true;
    }

    public void addTakeaway(){
        // your code goes here
        if(!CheeseToppingsBagBill[2]) {
            this.price += 20;
            this.bill += "Paperbag Added: 20\n";
        }
        CheeseToppingsBagBill[2] = true;
    }

    public String getBill(){
        // your code goes here
        if(!CheeseToppingsBagBill[3]) {
            this.bill += "Total Price: " + this.price + "\n";
            CheeseToppingsBagBill[3] = true;
            return this.bill;
        }
        return "";
    }
}