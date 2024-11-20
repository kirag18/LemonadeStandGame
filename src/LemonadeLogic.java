import java.util.Scanner;
public class LemonadeLogic {
    private int currentDay;//Kinda Useless for now
    private int totalDays;
    private Scanner scan;
    private String name;
    private Buying buy;
    private Simulation player;



    public LemonadeLogic(){
        scan = new Scanner(System.in);
        currentDay = 1;
        totalDays = 0;
        name = "";
        buy = new Buying ();
        player = new Simulation(buy.getCups(), buy.getSugar(), buy.getIce(), buy.getCurrentMoney(), buy.getLemons());


    }


    public void start(){
        welcome();
        for (int i = 1; i<=totalDays; i++){
            buying();
            adjustProportions();
//            player.setCups(buy.getCups());
//            player.setSugar(buy.getSugar());
//            player.setIce(buy.getIce());
//            player.setLemons(buy.getLemons());
//            player.setCurrentMoney(buy.getCurrentMoney());
            player = new Simulation(buy.getLemons(), buy.getCups(), buy.getIce(), buy.getSugar(), buy.getCurrentMoney(), adjustment.getLemonAdjustment(), adjustment.getCupPrice(), adjustment.getIceAdjustment(), adjustment.getSugarAdjustment());

            player.simulate();
            buy = new Buying(player.getLemons(),player.getCups(), player.getIce(), player.getSugar(), player.CurrentMoney());

            buy.setCups(player.getCups());
            buy.setSugar(player.getSugar());
            buy.setIce(player.getIce());
            buy.setLemons(player.getLemons());

        }
        overallAnalytics();
    }
    public void welcome(){
        System.out.println("Welcome to the Lemonade Stand Game!!!");
        System.out.println("Enter your name: ");
        name = scan.nextLine();
        while (totalDays<1 || totalDays>7){
            System.out.println("How many days do you want to play for(1-7)? ");
            totalDays = scan.nextInt();
            if (totalDays<1 || totalDays>7){
                System.out.println("Try again. Enter a new value that is between 1 & 7.");
            }
        }
//        while (startingMoney>30 || startingMoney<10){
//            System.out.println("How much money do you want to start with(int between 10-30)? $");
//            startingMoney = scan.nextInt();
//            if (startingMoney>30 || startingMoney<10){
//                System.out.println("Try again. Enter a new value that is between 10 & 30.");
//            }
//        }
//        currentMoney = startingMoney;
        scan.nextLine();




    }
    public void buying(){
        buy.printInventory();
        boolean isBuying = true;
        while (isBuying){
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


}