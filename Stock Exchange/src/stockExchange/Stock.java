package stockExchange;

import java.util.*;

public class Stock {
	public static double money;
	
	private String symbol;
	private String name;
	private double price;
	private PriorityQueue<TradeOrder> sellOrders, buyOrders;
	private double hi, lo;
	private int vol;
	
	public Stock(String symbol, String name, double price) {
		this.symbol = symbol;
		this.name = name;
		this.price = price;
		this.sellOrders = new PriorityQueue<TradeOrder>(new PriceComparator());
		this.buyOrders = new PriorityQueue<TradeOrder>(new PriceComparator());
	}

	public void placeOrder(TradeOrder order) {
		String msg = "New Order: ";
		if(order.isBuy()){
			buyOrders.add(order);
			msg += "Buy " + symbol + " (" + name + ")\n";
		}else{
			sellOrders.add(order);
			msg += "Sell " + symbol + " (" + name + ")\n";
		}
		
		if(order.isMarket()){
			msg += order.getShares() + " shares at market";
		}else{
			msg += order.getShares() + " shares at " + order.getPrice();
		}
	}
	
	public String getQuote(){
		String strPrice = String.format("%.2f", price);
		String strHi = String.format("%.2f", hi);
		String strLo = String.format("%.2f", lo);
		
		String quote = name + " (" + symbol + ")\n"
				+ "Price: " + strPrice + " hi: " + strHi + " lo: " + strLo + " vol: " + vol
				+ " Ask: ";
		
		String ask = null;
		if(sellOrders.size() == 0 || sellOrders.peek().getPrice() == 0){
			ask = "none";
			quote += ask + " ";
		}else{
			ask = String.format("%.2f", sellOrders.peek().getPrice());
			quote += ask + " size: " + sellOrders.peek().getShares() + " ";
		}
		
		String buy = null;
		quote += "Bid: ";
		if(buyOrders.size() == 0 || buyOrders.peek().getPrice() == 0){
			buy = "none";
			quote += buy + " ";
		}else{
			buy = String.format("%.2f", buyOrders.peek().getPrice());
			quote += buy + " size: " + buyOrders.peek().getShares();
		}
		
		return quote;
	}

}
