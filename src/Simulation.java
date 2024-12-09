
public class Simulation {
        private Inventory inv;


        public Simulation(Inventory inv){
            this.inv = inv;
        }

        public int peoplePerDay(){
            int numCustomers = (int)(Math.random() * 41)+80;
            inv.incrementTotalPasserby(numCustomers);
            return numCustomers;
        }

        public void simulate(){
            int buyProbability = (int)(Math.random() * 31)+60;
            if (inv.getCupPrice()>1){
                buyProbability /= (int) inv.getCupPrice()+2;
            }
            if (inv.getIceAdjustment()<= 2){
                buyProbability /= inv.getIceAdjustment()+1;
            }
            int rand = (int) (Math.random() * 100)+1;
            if (rand <= buyProbability) {
                inv.incrementLemons(-1 * inv.getLemonAdjustment());
                inv.incrementCups(-1);
                inv.incrementIce(-1 * inv.getIceAdjustment());
                inv.incrementSugar(-1 * inv.getSugarAdjustment());
                inv.incrementCurrentMoney(inv.getCupPrice());
                inv.incrementTotalBuyers(1);
                inv.incrementAllRevenue(inv.getCupPrice());

            }
        }
        public void overallAnalytics(){
            System.out.println("You have reached the end of this simulation");
            System.out.println("Your total expenses were $" + inv.getAllExpenses());
            System.out.println("Your total revenue was $"+inv.getAllRevenue());
            System.out.println("Your profit was $" + (Math.round(100*inv.getAllRevenue() - inv.getAllExpenses())/100.0));
            System.out.println(inv.getTotalPasserby() + " people stopped by your stand");
            System.out.println(inv.getTotalBuyers() + " people bought from your stand");
            System.out.println("You had a " +(100.0*inv.getTotalBuyers()/inv.getTotalPasserby()) +"% buy rate");
        }


}
