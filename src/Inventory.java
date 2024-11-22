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

    //TODO: add these variables for analytics
    //total final - original = profit
    //total spendings
    //number of paying customers total
    //total people

    //add an overloaded constructer here
    public Inventory(){
        lemons = 0;
        cups = 0;
        ice = 0;
        sugar = 0;
        currentMoney = 0;
        lemonAdjustment = 0;
        iceAdjustment = 0;
        sugarAdjustment = 0;
        cupPrice = 0;
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

}
