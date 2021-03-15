import java.util.ArrayList;

public class ListPortfolio {
    private static ListPortfolio instance;
    private ArrayList<Portfolio> portfolios;

    private ListPortfolio(){
        this.portfolios = new ArrayList<Portfolio>();
    }

    public static ListPortfolio getInstance(){
        if (instance == null){
            instance = new ListPortfolio();
        }
        return instance;
    }

    public ArrayList<Portfolio> getPortfolios() {
        return portfolios;
    }

    public void setPortfolios(ArrayList<Portfolio> portfolios) {
        this.portfolios = portfolios;
    }

    public void AddPortfolio(Portfolio portfolio){
        portfolios.add(portfolio);
    }
}
