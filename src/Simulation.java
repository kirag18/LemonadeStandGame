import java.util.Scanner;

public class Simulation {
        private Inventory inv;
//        private int lemons;
//        private int cups;
//        private int ice;
//        private int sugar;
//        private int currentMoney;
//        private int lemonAdjustment;
//        private int iceAdjustment;
//        private int sugarAdjustment;
//        private double cupPrice;


//        public Simulation(){
//            lemons = 0;
//            cups = 0;
//            ice = 0;
//            sugar = 0;
//            currentMoney = 20;
//            lemonAdjustment = 1;
//            iceAdjustment = 5;
//            sugarAdjustment = 4;
//            cupPrice = 0.25;
//
//        }

        public Simulation(Inventory inv){
            this.inv = inv;
        }

        public void simulate(){
            int x = 1;
            boolean soldOut = false;
            int numCustomers = (int)(Math.random() * 41)+80;
            while (!soldOut || x < numCustomers){
                int buyProbability = (int)(Math.random() * 31)+60; //TODO: implement a cool probability
                int rand = (int) (Math.random() * 100)+1;
                if (rand <= buyProbability){
                    inv.incrementLemons(-1* inv.getLemonAdjustment());
                    inv.incrementCups(-1);
                    inv.incrementIce(-1* inv.getIceAdjustment());
                    inv.incrementSugar(-1* inv.getSugarAdjustment());
                    inv.incrementCurrentMoney(inv.getCupPrice());
                    if (inv.getLemons()<=0 || inv.getCups()<= 0 || inv.getIce()<=0 ||inv.getSugar()<=0){
                        soldOut = true;
                    }
                }
                x++;
            }
        }


}
