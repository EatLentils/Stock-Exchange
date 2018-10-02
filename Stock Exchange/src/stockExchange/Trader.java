package stockExchange;

import java.awt.GraphicsConfiguration;

public class Trader extends java.lang.Object implements java.lang.Comparable<Trader> {
	
	private Brokerage brokerage;
	private String name, password;
	private String[] messages;
	
	public Trader(Brokerage brokerage, String name, String pswd){
		
		this.brokerage = brokerage;
		this.name = name;
		password = pswd;
		
	}
	
	public boolean equals(Trader other){
		
		return name.equals(other.name);
		
	}

	public String getName() {
		
		return name;
	}
	
	public String getPassword(){
		
		return password;
	}
	
	public boolean hasMessages(){
		if(messages.length == 0)
			return false;
		return true;
	}

	public void quit() {
		
	}

	public void getQuote(String symbol) {
		
	}

	public void placeOrder(TradeOrder tradeOrder) {
		
	}

	public int compareTo(Trader other) {
		
		return 0;
	}
}
