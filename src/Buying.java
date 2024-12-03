import java.util.Scanner;

public class Buying {
    private Scanner scan;
    private Inventory inv;



    public Buying(Inventory inv) {
        this.inv = inv;
        scan = new Scanner(System.in);
    }


    public void printInventory() {
        System.out.println("Money: " + inv.getCurrentMoney());
        System.out.println("Cups: " + inv.getCups());
        System.out.println("Lemons: " + inv.getLemons());
        System.out.println("Sugar: " + inv.getSugar());
        System.out.println("Ice: " + inv.getIce());
    }

    public void printInventory(double money, int cups, int lemons, int sugar, int ice) {
        System.out.println("Money: " + money);
        System.out.println("Cups: " + cups);
        System.out.println("Lemons: " +lemons);
        System.out.println("Sugar: " +sugar);
        System.out.println("Ice: " +ice);
    }

    public void printCurrentAdjustments(){
        System.out.println("Total money " +inv.getCurrentMoney());
        System.out.println("1. cup price $" +inv.getCupPrice());
        System.out.println("2. lemons per cup " +inv.getLemonAdjustment());
        System.out.println("3. sugar per cup " +inv.getSugarAdjustment());
        System.out.println("4. ice per cup " +inv.getIceAdjustment());

    }

    public void cupsOffer() {
        System.out.println("There are 2 offers to choose from: \n1) 5 cups for $5 \n2) 10 cups for $9 \n Which would you like?(type 1 or 2)");
        String offerChoice = scan.nextLine();
        if (offerChoice.equals("1")) {
            buyItem(5, 5, "cups");

        } else {
            buyItem(10, 9, "cups");
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

    }

    private void buyItem(int numItem, double cost, String item) {
        boolean offerAgain1 = true;
        boolean bought = false;
        int offerVal = 0;
        double totalPrice = 0;
        while (offerAgain1) {
            System.out.println("This offer for " + item + " is " + numItem + " for " + cost + ". How many of this offer would you like to purchase?");
            scan = new Scanner(System.in);
            offerVal = scan.nextInt();
            scan.nextLine();
            totalPrice = cost * offerVal;
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
            }else{
                offerAgain1 = false;
                bought = true;
            }

        }
        if (bought){
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
            inv.incrementCurrentMoney(-1*totalPrice);
            inv.incrementAllExpenses(totalPrice);
            System.out.println("You've purchased " + (itemsBought) + item + "!");
        }

    }
}