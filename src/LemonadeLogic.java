import java.util.Scanner;
public class LemonadeLogic {
    private int currentDay;//Kinda Useless for now
    private int totalDays;
    private Scanner scan;
    private String name;
    private Buying buy;

    private Simulation player;
    private Inventory inv;



    public LemonadeLogic(){
        scan = new Scanner(System.in);
        currentDay = 1;
        totalDays = 0;
        name = "";
        inv = new Inventory();
        buy = new Buying (inv);
        player = new Simulation(inv);


    }


    public void start(){
        welcome();
        for (int i = 1; i<=totalDays; i++){
            System.out.println("Today is day "+ currentDay);
            buying();
            adjustProportions();
            int numCustomers = player.peoplePerDay();

            boolean soldOut = false;
            int x = 1;
            while (!soldOut && x < numCustomers){
                player.simulate();
                if (inv.getLemons()<=0 || inv.getCups()<= 0 || inv.getIce()<=0 ||inv.getSugar()<=0){
                    soldOut = true;
                    System.out.println("You ran out of some items. you are sold out for the day");
                }
                x++;
            }
            System.out.println("----------------------------");
            System.out.println("day "+currentDay+" complete");
            System.out.println("----------------------------");
            if (inv.getIce() >= 0 && Math.random()>0.49){
                System.out.println("All of your remaining ice melted. It was a very hot day!!");
                inv.incrementIce(-1* inv.getIce());
            }
            currentDay++;

        }
        player.overallAnalytics();
    }
    public void welcome(){
        System.out.println("Welcome to the Lemonade Stand Game!!!");
        System.out.print("Enter your name: ");
        name = scan.nextLine();
        if (name.toLowerCase().indexOf("l")>=0){
            System.out.println("Congrats!! since you have an \"L\" in your name you get a free lemon");
            inv.incrementLemons(1);
        }
        while (totalDays<1 || totalDays>7){
            System.out.print("How many days do you want to play for(1-7)? ");
            totalDays = scan.nextInt();
            scan.nextLine();
            if (totalDays<1 || totalDays>7){
                System.out.println("Try again. Enter a new value that is between 1 & 7.");
            }
        }





    }
    public void buying(){
        boolean isBuying = true;
        while (isBuying){
            buy.printInventory();
            System.out.print("Which item do you want to buy(n for none)? ");
            String item = scan.nextLine();
            if (item.equals("n")){
                isBuying = false;
            }else if (item.equals("cups")){
                buy.cupsOffer();
            }else if (item.equals("lemons")){
                buy.lemonsOffer();
            }else if(item.equals("ice")){
                buy.iceOffer();
            }else if (item.equals("sugar")){
                buy.sugarOffer();
            }else{
                System.out.println("Not a valid item");
            }
        }
    }
    public void adjustProportions(){
        boolean isAdjusting = true;
        while (isAdjusting){
            buy.printCurrentAdjustments();
            System.out.print("Which item proportion do you want to adjust(n for none)(enter an int)? ");
            String item = scan.nextLine();

            if (item.equals("n")){
                isAdjusting = false;
            }else if (item.equals("1")){
                System.out.print("What new value do you want per cup? ");
                double c = scan.nextDouble();
                if (c>10){
                    System.out.println("too high. try again");
                }else if (c<= 0){
                    System.out.println("too low. try again");
                }else{
                    inv.setCupPrice(c);
                }
                scan.nextLine();
            }else if (item.equals("2")){
                System.out.print("What new value do you want for lemons per cup? ");
                int l = scan.nextInt();
                if (l<= 0){
                    System.out.println("too low. try again");
                }else{
                    inv.setLemonAdjustment(l);
                }
                scan.nextLine();
            }else if(item.equals("3")){
                System.out.print("What new value do you want for sugar per cup? ");
                int s = scan.nextInt();
                if (s<= 0){
                    System.out.println("too low. try again");
                }else{
                    inv.setSugarAdjustment(s);
                }
                scan.nextLine();
            }else if (item.equals("4")){
                System.out.print("What new value do you want for ice per cup? ");
                int ice = scan.nextInt();
                if (ice<= 0){
                    System.out.println("too low. try again");
                }else{
                    inv.setIceAdjustment(ice);
                }
                scan.nextLine();
            }

            System.out.println();
        }
    }



}
