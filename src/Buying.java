import java.util.Scanner;

public class Buying {
    private Scanner scan;
    private Inventory inv;
    private int lemons;
    private int cups;
    private int ice;
    private int sugar;
    private double currentMoney;

//    public Buying(){
//        lemons = 0;
//        cups = 0;
//        ice = 0;
//        sugar = 0;
//        currentMoney = 20;
//    }

    public Buying(Inventory inv) {
        this.inv = inv;
//        lemons = inv.getLemons();
//        cups = inv.getCups();
//        ice = inv.getIce();
//        sugar = inv.getSugar();
//        currentMoney = inv.getCurrentMoney();
    }
    //contructor(no params): set everything to 0 and money to 20
    //overloaded constructor(all params-5): allow input params
    //getter methods for all items


    public void printInventory() {
        System.out.println(inv.getCurrentMoney());
        System.out.println(inv.getCups());
        System.out.println(inv.getLemons());
        System.out.println(inv.getSugar());
        System.out.println(inv.getIce());
    }

    public void printCurrentAdjustments(){
        System.out.println("Total money " +inv.getCurrentMoney());
        System.out.println("1. cup price $" +inv.getCupPrice());
        System.out.println("2. lemons per cup " +inv.getLemonAdjustment());
        System.out.println("3. sugar per cup " +inv.getSugarAdjustment());
        System.out.println("4. ice per cup " +inv.getIceAdjustment());

    }
/*
offer info: num item, cost,

 */

    private void buyItem(int numItem, double cost, String item) {
        boolean offerAgain1 = true;
        int offerVal = 0;
        double totalPrice = 0;
        while (offerAgain1) {
            System.out.println("This offer for " + item + " is " + numItem + " for " + cost + ". How many of this offer would you like to purchase?");
            scan = new Scanner(System.in);
            offerVal = scan.nextInt();
            totalPrice = cost * 5;
            if (totalPrice > inv.getCurrentMoney()) {
                offerVal = 0;
                System.out.println("You don't have enough money! \n Do you want to purchase a smaller amount of this offer?(y/n)");
                scan.nextLine();
                String purchaseAgain = scan.nextLine();
                if (purchaseAgain.equals("y")) {
                    offerAgain1 = true;
                } else {
                    offerAgain1 = false;
                }
            }

        }
        int itemsBought = offerVal * numItem;
        if (item.equals("cups")) {
            inv.incrementCups(itemsBought);
        }
        if (item.equals("lemons")) {
            inv.incrementLemons(itemsBought);
        }
        if (item.equals("ice")) {
            inv.incrementIce(itemsBought);
        }
        if (item.equals("sugar")) {
            inv.incrementSugar(itemsBought);
        }
        currentMoney -= totalPrice;
        System.out.println("You've purchased " + (itemsBought) + item + "!");//prints total?
    }

    public void cupsOffer() {
        System.out.println("There are 2 offers to choose from: \n1) 5 cups for $5 \n2) 10 cups for $9 \n Which would you like?(type 1 or 2)");
        String offerChoice = scan.nextLine();
        if (offerChoice.equals("1")) {
            buyItem(5, 5, "cups");

        } else {
            buyItem(20, 9, "cups");
        }

    }

    public void lemonsOffer() {
        System.out.println("There are 2 offers to choose from: \n1) 5 lemons for $3\n2) 10 lemons for $5 \n Which would you like?(type 1 or 2)");
        String offerChoice = scan.nextLine();
        if (offerChoice.equals("1")) {
            buyItem(5, 3, "lemons");
        } else {
            buyItem(10, 5, "lemons");
        }

    }

    public void iceOffer() {
        System.out.println("There are 2 offers to choose from: \n1) 10 cubes of ice for $2\n2) 20 cubes of ice for $3 \nWhich would you like?(type 1 or 2)");
        String offerChoice = scan.nextLine();
        if (offerChoice.equals("1")) {
            buyItem(10, 2, "ice");
        } else {
            buyItem(20, 3, "ice");
        }
    }

    public void sugarOffer(){
        System.out.println("There are 2 offers to choose from: \n1) 2 cups of sugar for $3\n2) 5 cups of sugar for $4 \nWhich would you like?(type 1 or 2)");
        String offerChoice = scan.nextLine();
        if (offerChoice.equals("1")) {
            buyItem(2, 3, "sugar");
        } else {
            buyItem(5, 4, "sugar");

        }
        //item(): 2-3 offers, display offers, which offer do you want?, how many times do you want to buy this offer?
    }
}