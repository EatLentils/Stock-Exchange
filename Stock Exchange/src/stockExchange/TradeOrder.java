package stockExchange;

public class TradeOrder {
	
	private Trader myTrader;
	private String symbol;
	private boolean buyOrder, marketOrder;
	private int numShares;
	private double price;

	public TradeOrder(Trader myTrader, String symbol, boolean buyOrder, boolean marketOrder, int numShares, double price) {
		
		this.myTrader = myTrader;
		this.symbol = symbol;
		this.buyOrder = buyOrder;
		this.marketOrder = marketOrder;
		this.numShares = numShares;
		this.price = price;
		
	}
	
	public Trader getMyTrader(){
		return myTrader;
	}
	
	public String getSymbol(){
		return symbol;
	}
	
	public boolean getBuyOrder(){
		return buyOrder;
	}
	
	public boolean getMarketOrder(){
		return marketOrder;
	}
	
	public int getNumShares(){
		return numShares;
	}
	
	public double getPrice(){
		return price;
	}

}
