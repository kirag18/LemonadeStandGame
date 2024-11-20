import java.util.Scanner;

public class Buying {
    private Scanner scan;
    private int lemons;
    private int cups;
    private int ice;
    private int sugar;
    private int currentMoney;

    public Buying(){
        lemons = 0;
        cups = 0;
        ice = 0;
        sugar = 0;
        currentMoney = 20;
    }

    public Buying(int lemons,int cups, int ice, int sugar, int currentMoney){
        this.lemons = lemons;
        this.cups = cups;
        this.ice = ice;
        this.sugar = sugar;
        this.currentMoney = currentMoney;
    }
    //contructor(no params): set everything to 0 and money to 20
    //overloaded constructor(all params-5): allow input params
    //getter methods for all items

    public int getLemons(){
        return lemons;
    }

    public int getCups(){
        return cups;
    }

    public int getIce(){
        return ice;
    }

    public int getSugar(){
        return sugar;
    }

    public int getCurrentMoney(){
        return currentMoney;
    }

    public void printInventory(){
        System.out.println(currentMoney);
        System.out.println(cups);
        System.out.println(lemons);
        System.out.println(sugar);
        System.out.println(ice);
    }

    public void cupsOffer(){
        System.out.println("There are 2 offers to choose from: \n5 cups for $5 and 10 cups for $9 \nWhich would you like?(type offer word for word)");
        String offerChoice = scan.nextLine();
        if(offerChoice.equals("5 cups for $5")){
            boolean offerAgain1 = true;
            while(offerAgain1){
                System.out.println("This offer for cups is 5 cups for $5.\n How many of this offer would you like to purchase?");
                scan = new Scanner(System.in);
                int offerVal = scan.nextInt();
                int moneyCups = offerVal * 5;
                if(moneyCups > currentMoney){
                    offerVal = 0;
                    System.out.println("You don't have enough money! \n Do you want to purchase a smaller amount of this offer?(y/n)");
                    scan.nextLine();
                    String purchaseAgain = scan.nextLine();
                    if(purchaseAgain.equals("y")){
                        offerAgain1 = true;
                    } else {
                        offerAgain1 = false;
                    }
                }
                cups += 5 * offerVal;
                currentMoney -=moneyCups;
            }
            System.out.println("You've purchased " + cups + "!");
        } else {
            boolean offerAgain2 = true;
            while(offerAgain2){
                System.out.println("This offer for cups is 10 cups for $9.\n How many of this offer would you like to purchase?");
                scan = new Scanner(System.in);
                int offerVal = scan.nextInt();
                int moneyCups = offerVal * 9;
                if(moneyCups > currentMoney){
                    offerVal = 0;
                    System.out.println("You don't have enough money! \n Do you want to purchase a smaller amount of this offer?(y/n)");
                    scan.nextLine();
                    String purchaseAgain = scan.nextLine();
                    if(purchaseAgain.equals("y")){
                        offerAgain2 = true;
                    } else {
                        offerAgain2 = false;
                    }
                }
                cups += 10 * offerVal;
                currentMoney -= moneyCups;
            }
            System.out.println("You've purchased " + cups + "!");
        }

    }

    public void lemonsOffer(){
        System.out.println("There are 2 offers to choose from: \n5 lemons for $3 and 10 lemons for $5 \nWhich would you like?(type offer word for word)");
        String offerChoice = scan.nextLine();
        if(offerChoice.equals("5 lemons for $3")){
            boolean offerAgain1 = true;
            while(offerAgain1){
                System.out.println("This offer for cups is 5 lemons for $3.\n How many of this offer would you like to purchase?");
                scan = new Scanner(System.in);
                int offerVal = scan.nextInt();
                int moneyLemons = offerVal * 3;
                if(moneyLemons > currentMoney){
                    offerVal = 0;
                    System.out.println("You don't have enough money! \n Do you want to purchase a smaller amount of this offer?(y/n)");
                    scan.nextLine();
                    String purchaseAgain = scan.nextLine();
                    if(purchaseAgain.equals("y")){
                        offerAgain1 = true;
                    } else {
                        offerAgain1 = false;
                    }
                }
                lemons += 5 * offerVal;
                currentMoney -=moneyLemons;
            }
            System.out.println("You've purchased " + lemons + "!");
        } else {
            boolean offerAgain2 = true;
            while(offerAgain2){
                System.out.println("This offer for lemons is 10 lemons for $5.\n How many of this offer would you like to purchase?");
                scan = new Scanner(System.in);
                int offerVal = scan.nextInt();
                int moneyLemons = offerVal * 5;
                if(moneyLemons > currentMoney){
                    offerVal = 0;
                    System.out.println("You don't have enough money! \n Do you want to purchase a smaller amount of this offer?(y/n)");
                    scan.nextLine();
                    String purchase = scan.nextLine();
                    if(purchase.equals("y")){
                        offerAgain2 = true;
                    } else {
                        offerAgain2 = false;
                    }
                }
                lemons += 10 * offerVal;
                currentMoney -= moneyLemons;
            }
            System.out.println("You've purchased " + lemons + "!");
        }

    }

    public void iceOffer(){
        System.out.println("There are 2 offers to choose from: \n10 cubes of ice for $2 and 20 cubes of ice for $3 \nWhich would you like?(type offer word for word)");
        String offerChoice = scan.nextLine();
        if(offerChoice.equals("10 cubes of ice for $2")){
            boolean offerAgain1 = true;
            while(offerAgain1){
                System.out.println("This offer for cups is 10 cubes of ice for $2.\n How many of this offer would you like to purchase?");
                scan = new Scanner(System.in);
                int offerVal = scan.nextInt();
                int moneyIce = offerVal * 2;
                if(moneyIce > currentMoney){
                    offerVal = 0;
                    System.out.println("You don't have enough money! \n Do you want to purchase a smaller amount of this offer?(y/n)");
                    scan.nextLine();
                    String purchaseAgain = scan.nextLine();
                    if(purchaseAgain.equals("y")){
                        offerAgain1 = true;
                    } else {
                        offerAgain1 = false;
                    }
                }
                ice += 10 * offerVal;
                currentMoney -= moneyIce;
            }
            System.out.println("You've purchased " + ice + "!");
        } else {
            boolean offerAgain2 = true;
            while(offerAgain2){
                System.out.println("This offer for ice is 20 cubes of ice for $3.\n How many of this offer would you like to purchase?");
                scan = new Scanner(System.in);
                int offerVal = scan.nextInt();
                int moneyIce = offerVal * 5;
                if(moneyLemons > currentMoney){
                    offerVal = 0;
                    System.out.println("You don't have enough money! \n Do you want to purchase a smaller amount of this offer?(y/n)");
                    scan.nextLine();
                    String purchase = scan.nextLine();
                    if(purchase.equals("y")){
                        offerAgain2 = true;
                    } else {
                        offerAgain2 = false;
                    }
                }
                lemons += 10 * offerVal;
                currentMoney -= moneyLemons;
            }
            System.out.println("You've purchased " + lemons + "!");
        }
    }

    public void sugarOffer(){
        boolean offerAgain = true;
        while(offerAgain){
            System.out.println("The offer for sugar is .\n How many of this offer would you like to purchase?");
            scan = new Scanner(System.in);
            int offerVal = scan.nextInt();
            int moneyIce = offerVal * 4;
            if(moneyIce > currentMoney){
                System.out.println("You don't have enough money! \n Do you want to purchase a smaller amount of this offer?(y/n)");
                scan.nextLine();
                String purchaseIce = scan.nextLine();
                if(purchaseIce.equals("y")){
                    offerAgain = true;
                } else {
                    offerAgain = false;
                }
            }
            ice += 10 * offerVal;
        }
        System.out.println("You've purchased " + ice + "!");
    }


    //item(): 2-3 offers, display offers, which offer do you want?, how many times do you want to buy this offer?
}
