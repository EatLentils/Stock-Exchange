package stockExchange;

import java.util.HashMap;

public class StockExchange {
	HashMap<String, Stock> stocks = new HashMap<String, Stock>();
	
	public void listStock(String string, String string2, double d) {
		stocks.put(string, new Stock(string2, d));
	}
	
}
