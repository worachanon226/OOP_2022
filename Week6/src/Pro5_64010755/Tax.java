package Pro5_64010755;

public class Tax {
    private int bracket[][];
    private double rates[];
    private double taxableIncome;

    public Tax(int filingStatus,int[][] bracket, double[] rates, double taxableIncome){
        this.bracket = bracket;
        this.rates = rates;
        this.taxableIncome = taxableIncome;
    }
}
