package Pro5_64010755;

public class Tax {
    private int filingStatus;
    private int bracket[][];
    private double rates[];
    private double taxableIncome;

    public Tax(){}

    public Tax(int filingStatus,int[][] bracket, double[] rates, double taxableIncome){
        setStatus(filingStatus);
        setBracket(bracket);
        setRates(rates);
        setTaxableIncome(taxableIncome);
    }

    public void setStatus(int filingStatus){
        this.filingStatus = filingStatus;
    }

    public void setBracket(int[][] bracket){
        this.bracket = bracket;
    }

    public void setRates(double[] rates){
        this.rates = rates;
    }

    public void setTaxableIncome(double taxableIncome){
        this.taxableIncome = taxableIncome;
    }

    public int getStatus(){
        return this.filingStatus;
    }

    public int[][] getBracket() {
        return this.bracket;
    }

    public double[] getRates(){
        return this.rates;
    }

    public double getTaxalbleIncome(){
        return this.taxableIncome;
    }

    public double getTax(){

        double tax = 0;

        for(int i=0;i<5;i++){
            if(taxableIncome<=bracket[filingStatus][i]){
                if(i==0){
                    tax = taxableIncome * rates[i];
                    break;
                }
                else{
                    tax += (taxableIncome - bracket[filingStatus][i-1]) * rates[i];
                    for(int j=i-1;j>0;j--){
                        tax += (bracket[filingStatus][j] - bracket[filingStatus][j-1]) * rates[j];
                    }
                    tax += bracket[filingStatus][0] * rates[0];
                    break;
                }
            }   
        }

        if(taxableIncome>bracket[filingStatus][4]){
            tax += (taxableIncome - bracket[filingStatus][4]) * rates[5];
            for(int j=4;j>0;j--){
                tax += (bracket[filingStatus][j] - bracket[filingStatus][j-1]) * rates[j];
            }
            tax += bracket[filingStatus][0] * rates[0];
        }

        return tax;
    }
}
