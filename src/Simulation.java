import java.util.Scanner;

public class Simulation {

        private int lemons;
        private int cups;
        private int ice;
        private int sugar;
        private int currentMoney;
        private int lemonAdjustment;
        private int iceAdjustment;
        private int sugarAdjustment;
        private double cupPrice;


        public Simulation(){
            lemons = 0;
            cups = 0;
            ice = 0;
            sugar = 0;
            currentMoney = 20;
            lemonAdjustment = 1;
            iceAdjustment = 5;
            sugarAdjustment = 4;
            cupPrice = 0.25;

        }

        public Simulation(int lemons,int cups, int ice, int sugar, int currentMoney, int lemonAdjustment, double cupPrice, int iceAdjustment, int sugarAdjustment){
            this.lemons = lemons;
            this.cups = cups;
            this.ice = ice;
            this.sugar = sugar;
            this.currentMoney = currentMoney;
        }

        public void simulate(){
            int x = 1;
            boolean soldOut = false;
            int numCustomers = (int)(Math.random() * 41)+80;
            while (!soldOut || x < numCustomers){
                int buyProbability = (int)(Math.random() * 31)+60; //TODO: implement a cool probability
                int rand = (int) (Math.random() * 100)+1;
                if (rand <= buyProbability){
                    lemons -= lemonAdjustment;
                    cups -= 1;
                    ice -= iceAdjustment;
                    sugar -= sugarAdjustment;
                    currentMoney += cupPrice;
                    if (lemons<=0 || cups<= 0 || ice<=0 ||sugar<=0){
                        soldOut = true;
                    }
                }
                x++;
            }
        }


}
