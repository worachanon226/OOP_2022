package Pro1_64010755;

public class Stock {

    public String symbol;
    public String name;
    public double previousClosingPrice;
    public double currentPrice;
    public double changePrice;

    public Stock(String symbol,String name,double previousClosingPrice,double currentPrice){
        this.symbol = symbol;
        this.name = name;
        this.previousClosingPrice = previousClosingPrice;
        this.currentPrice = currentPrice;
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
