
public class Simulation {
        private Inventory inv;


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
