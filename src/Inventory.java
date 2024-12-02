public class Inventory {
    private int lemons;
    private int cups;
    private int ice;
    private int sugar;
    private double currentMoney;
    private int lemonAdjustment;
    private int iceAdjustment;
    private int sugarAdjustment;
    private double cupPrice;
    private int totalPasserby;
    private int totalBuyers;
    private double allRevenue;
    private double allExpenses;

    //TODO: add these variables for analytics
    //total spendings
    //number of paying customers total
    //total people

    //add an overloaded constructer here
    public Inventory(){
        lemons = 0;
        cups = 0;
        ice = 0;
        sugar = 0;
        currentMoney = 20;
        lemonAdjustment = 1;
        iceAdjustment = 2;
        sugarAdjustment = 1;
        cupPrice = 0.1;
    }
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
    public double getCurrentMoney(){
        return currentMoney;
    }
    public int getLemonAdjustment(){
        return lemonAdjustment;
    }
    public int getIceAdjustment(){
        return iceAdjustment;
    }
    public int getSugarAdjustment(){
        return sugarAdjustment;
    }
    public double getCupPrice(){
        return cupPrice;
    }
    public int getTotalPasserby(){
        return totalPasserby;
    }
    public int getTotalBuyers(){
        return totalBuyers;
    }
    public double getAllRevenue(){
        return allRevenue;
    }
    public double getAllExpenses(){
        return allExpenses;
    }

    public void setLemonAdjustment(int adjustment){
        lemonAdjustment = adjustment;
    }
    public void setIceAdjustment(int adjustment){
        iceAdjustment = adjustment;
    }
    public void setSugarAdjustment(int adjustment){
        sugarAdjustment = adjustment;
    }
    public void setCupPrice(double adjustment){
        cupPrice = adjustment;
    }

    public void incrementLemons(int inc){
        lemons += inc;
    }
    public void incrementCups(int inc){
        cups += inc;
    }
    public void incrementIce(int inc){
        ice += inc;
    }
    public void incrementSugar(int inc){
        sugar += inc;
    }
    public void incrementCurrentMoney(double inc){
        currentMoney += inc;
    }
    public void incrementTotalPasserby(int inc){
        totalPasserby += inc;
    }
    public void incrementTotalBuyers(int inc){
        totalBuyers += inc;
    }
    public void incrementAllRevenue(double inc){
        allRevenue += inc;
    }
    public void incrementAllExpenses(double inc){
        allExpenses += inc;
    }

}
