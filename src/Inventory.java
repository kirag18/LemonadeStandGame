/**
 * This is a data class that stores all the values for the inventory of the player
 *
 * @author kira gottlieb
 */
public class Inventory {
    /**current umber of lemons */
    private int lemons;
    /**current number of cups */
    private int cups;
    /**current number of ice cubes */
    private int ice;
    /**current number of sugar cubes */
    private int sugar;
    /**current money of the player*/
    private double currentMoney;
    /**current number of lemons per cup */
    private int lemonAdjustment;
    /**current number of ice cubes per cup */
    private int iceAdjustment;
    /**current number of sugar cubes per cup */
    private int sugarAdjustment;
    /**current cost of one cup*/
    private double cupPrice;
    /**current total number of people who passed by the lemonade stand */
    private int totalPasserby;
    /**current total number of lemonade buyers */
    private int totalBuyers;
    /**total current revenue from lemonade */
    private double allRevenue;
    /**current total value of expenses from buying */
    private double allExpenses;


    /**
     * Initializes the inventory class
     *
     * @param lemons
     * @param cups
     * @param ice
     * @param sugar
     * @param currentMoney
     * @param lemonAdjustment
     * @param iceAdjustment
     * @param sugarAdjustment
     * @param cupPrice
     */
    public Inventory(int lemons, int cups, int ice, int sugar, double currentMoney, int lemonAdjustment, int iceAdjustment, int sugarAdjustment, double cupPrice){
        this.lemons = lemons;
        this.cups = cups;
        this.ice = ice;
        this.sugar = sugar;
        this.currentMoney = currentMoney;
        this.lemonAdjustment = lemonAdjustment;
        this.iceAdjustment = iceAdjustment;
        this.sugarAdjustment = sugarAdjustment;
        this.cupPrice = cupPrice;
    }

    /**
     * Initializes the inventory class with default values
     */
    public Inventory(){
        lemons = 0;
        cups = 0;
        ice = 0;
        sugar = 0;
        currentMoney = 20;
        lemonAdjustment = 1;
        iceAdjustment = 5;
        sugarAdjustment = 2;
        cupPrice = 0.1;
    }
    /**
     * returns the current number of lemons
     * @return the current number of lemons
     */
    public int getLemons(){
        return lemons;
    }
    /**
     * returns the current number of cups
     * @return the current number of cups
     */
    public int getCups(){
        return cups;
    }
    /**
     * returns the current number of ice cubes
     * @return the current number of ice cubes
     */
    public int getIce(){
        return ice;
    }
    /**
     * returns the current number of sugar cubes
     * @return the current number of sugar cubes
     */
    public int getSugar(){
        return sugar;
    }
    /**
     * returns the current balance of the player
     * @return the current balance of the player
     */
    public double getCurrentMoney(){
        return (Math.round(100*currentMoney)/100.0);
    }
    /**
     * returns the current number of lemons per cup
     * @return the current number of lemons per cup
     */
    public int getLemonAdjustment(){
        return lemonAdjustment;
    }

    /**
     * returns the current number of ice cubes per cup
     * @return the current number of ice cubes per cup
     */
    public int getIceAdjustment(){
        return iceAdjustment;
    }
    /**
     * returns the current number of sugar cubes per cup
     * @return the current number of sugar cubes per cup
     */
    public int getSugarAdjustment(){
        return sugarAdjustment;
    }
    /**
     * returns the current cost per cup
     * @return the current cost per cup
     */
    public double getCupPrice(){
        return cupPrice;
    }
    /**
     * returns the current number of people who passed the lemonade stand
     * @return the current number of people who passed the lemonade stand
     */
    public int getTotalPasserby(){
        return totalPasserby;
    }
    /**
     * returns the current number of lemonade buyers
     * @return the current number of lemonade buyers
     */
    public int getTotalBuyers(){
        return totalBuyers;
    }
    /**
     * returns the total revenue from lemonade
     * @return the total revenue from lemonade
     */
    public double getAllRevenue(){
        return (Math.round(100*allRevenue)/100.0);
    }
    /**
     * returns the current expenses from buying
     * @return the current expenses from buying
     */
    public double getAllExpenses(){
        return (Math.round(100*allExpenses)/100.0);
    }

    /**
     * sets the number of lemons per cup
     * @param adjustment new number of lemons per cup
     */
    public void setLemonAdjustment(int adjustment){
        lemonAdjustment = adjustment;
    }
    /**
     * sets the number of ice cubes per cup
     * @param adjustment new number of ice cubes per cup
     */
    public void setIceAdjustment(int adjustment){
        iceAdjustment = adjustment;
    }
    /**
     * sets the number of sugar cubes per cup
     * @param adjustment new number of sugar cubes per cup
     */
    public void setSugarAdjustment(int adjustment){
        sugarAdjustment = adjustment;
    }
    /**
     * sets the price per cup
     * @param adjustment new cup price
     */
    public void setCupPrice(double adjustment){
        cupPrice = adjustment;
    }

    /**
     * Increments the total number of lemons
     * @param inc how many more lemons there are
     */
    public void incrementLemons(int inc){
        lemons += inc;
    }
    /**
     * Increments the total number of cups
     * @param inc how many more cups there are
     */
    public void incrementCups(int inc){
        cups += inc;
    }
    /**
     * Increments the total number of ice cubes
     * @param inc how many more ice cubes there are
     */
    public void incrementIce(int inc){
        ice += inc;
    }
    /**
     * Increments the total number of sugar cubes
     * @param inc how many more sugar cubes there are
     */
    public void incrementSugar(int inc){
        sugar += inc;
    }
    /**
     * Increments the total money
     * @param inc how much more money you have
     */
    public void incrementCurrentMoney(double inc){
        currentMoney += inc;
    }
    /**
     * Increments the total number of passerby
     * @param inc how many more new passerby there are
     */
    public void incrementTotalPasserby(int inc){
        totalPasserby += inc;
    }
    /**
     * Increments the total number of buyers
     * @param inc how many more buyers there are
     */
    public void incrementTotalBuyers(int inc){
        totalBuyers += inc;
    }
    /**
     * Increments the total revenue
     * @param inc how much more money made
     */
    public void incrementAllRevenue(double inc){
        allRevenue += inc;
    }
    /**
     * Increments the total buying expenses
     * @param inc how much more money spent
     */
    public void incrementAllExpenses(double inc){
        allExpenses += inc;
    }

}
