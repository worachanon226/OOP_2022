package Pro1_64010755;

public class Stock {

    private String symbol;
    private String name;
    private double previousClosingPrice = 34.5;
    private double currentPrice = 34.35;
    private double changePrice;

    public Stock(String symbol,String name){
        this.symbol = symbol;
        this.name = name;
    }

    public double getChangePercent(){
        changePrice = ( (currentPrice*100) / previousClosingPrice ) - 100;
        return changePrice;
    }

    public void detailOutput(){
        System.out.format("Symbol: %s\n",symbol);
        System.out.format("Name: %s\n",name);
        System.out.println("Previous Closing Price: " + previousClosingPrice);
        System.out.println("Current Price: " + currentPrice);
        System.out.println("Price Change: " + changePrice + "%");
    }
}
