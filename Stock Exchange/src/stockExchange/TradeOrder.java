package stockExchange;

public class TradeOrder {
	
	private Trader myTrader;
	private String symbol;
	private boolean buyOrder, marketOrder;
	private int numShares;
	public double price;

	public TradeOrder(Trader myTrader, String symbol, boolean buyOrder, boolean marketOrder, int numShares, double price) {
		
		this.myTrader = myTrader;
		this.symbol = symbol;
		this.buyOrder = buyOrder;
		this.marketOrder = marketOrder;
		this.numShares = numShares;
		this.price = price;
		
	}
	
	public Trader getTrader(){
		return myTrader;
	}
	
	public String getSymbol(){
		return symbol;
	}
	
	public int getShares(){
		return numShares;
	}
	
	public double getPrice(){
		return price;
	}
	
	public void subtractShares(int shares){
		numShares -= shares;
	}
	
	public boolean isBuy(){
		return buyOrder;
	}
	
	public boolean isLimit(){
		return !marketOrder;
	}
	
	public boolean isMarket(){
		return marketOrder;
	}
	
	public boolean isSell(){
		return !buyOrder;
	}
	


}
