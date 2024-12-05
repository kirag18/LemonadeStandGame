import java.util.Scanner;

public class Buying {
    private Scanner scan;
    private Inventory inv;



    public Buying(Inventory inv) {
        this.inv = inv;
        scan = new Scanner(System.in);
    }


    public void printInventory() {
        System.out.println("-----------------------------");
        System.out.println("Money: $" + inv.getCurrentMoney());
        System.out.println("Cups: " + inv.getCups());
        System.out.println("Lemons: " + inv.getLemons());
        System.out.println("Sugar: " + inv.getSugar());
        System.out.println("Ice: " + inv.getIce());
        System.out.println("-----------------------------");
    }

    public void printInventory(double money, int cups, int lemons, int sugar, int ice) {
        System.out.println("-----------------------------");
        System.out.println("Money: $" + money);
        System.out.println("Cups: " + cups);
        System.out.println("Lemons: " +lemons);
        System.out.println("Sugar: " +sugar);
        System.out.println("Ice: " +ice);
        System.out.println("-----------------------------");
    }

    public void printCurrentAdjustments(){
        System.out.println("-----------------------------");
        System.out.println("Total money $" +inv.getCurrentMoney());
        System.out.println("1. cup price $" +inv.getCupPrice());
        System.out.println("2. lemons per cup " +inv.getLemonAdjustment());
        System.out.println("3. sugar per cup " +inv.getSugarAdjustment());
        System.out.println("4. ice per cup " +inv.getIceAdjustment());
        System.out.println("-----------------------------");
        System.out.println("Pro tip: don't make the cup price too high or else people won't buy the lemonade");
        System.out.println("Also, customers like lots of ice, sugar and lemons per cup!!");
        System.out.println("-----------------------------");


    }

    public void cupsOffer() {
        System.out.print("There are 2 offers to choose from: \n1) 25 cups for $0.98 \n2) 100 cups for $3 \n Which would you like?(type 1 or 2) ");
        String offerChoice = scan.nextLine();
        if (offerChoice.equals("1")) {
            buyItem(25, 0.98, "cups");

        } else {
            buyItem(100, 3, "cups");
        }

    }

    public void lemonsOffer() {
        System.out.print("There are 2 offers to choose from: \n1) 60 lemons for $2.23\n2) 150 lemons for $4.05 \n Which would you like?(type 1 or 2) ");
        String offerChoice = scan.nextLine();

        if (offerChoice.equals("1")) {
            buyItem(60, 2.23, "lemons");
        } else {
            buyItem(150, 4.05, "lemons");
        }

    }

    public void iceOffer() {
        System.out.print("There are 2 offers to choose from: \n1) 200 cubes of ice for $2\n2) 500 cubes of ice for $3.75 \nWhich would you like?(type 1 or 2) ");
        String offerChoice = scan.nextLine();

        if (offerChoice.equals("1")) {
            buyItem(200,  2, "ice");
        } else {
            buyItem(500, 3.75, "ice");
        }
    }

    public void sugarOffer(){
        System.out.print("There are 2 offers to choose from: \n1) 20 cups of sugar for $0.63\n2) 100 cups of sugar for $3.26\nWhich would you like?(type 1 or 2) ");
        String offerChoice = scan.nextLine();
        if (offerChoice.equals("1")) {
            buyItem(20, 0.63, "sugar");
        } else {
            buyItem(100, 3.26, "sugar");

        }

    }

    private void buyItem(int numItem, double cost, String item) {
        boolean offerAgain1 = true;
        boolean bought = false;
        int offerVal = 0;
        double totalPrice = 0;
        while (offerAgain1) {
            System.out.print("This offer for " + item + " is " + numItem + " for " + cost + ". How many of this offer would you like to purchase? ");
            //scan = new Scanner(System.in);
            offerVal = scan.nextInt();
            scan.nextLine();
            totalPrice = cost * offerVal;
            if (totalPrice > inv.getCurrentMoney()) {
                offerVal = 0;
                System.out.print("You don't have enough money! \n Do you want to purchase a smaller amount of this offer?(y/n) ");
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
            System.out.println("You've purchased " + (itemsBought) +" "+ item + "!");
        }

    }
}