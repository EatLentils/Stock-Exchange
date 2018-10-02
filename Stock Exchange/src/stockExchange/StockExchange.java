package stockExchange;

import java.util.HashMap;

public class StockExchange {
	HashMap<String, Stock> stocks;
	
	public StockExchange(){
		stocks = new HashMap<String, Stock>();
	}
	
	public String getQuote(String symbol){
		return "quote";
	}
	
	public void listStock(String symbol, String name, double price) {
		stocks.put(symbol, new Stock(symbol, name, price));
	}
	
	public void placeOrder(TradeOrder order){
		stocks.get(order.getSymbol()).placeOrder(order);
	}
}
