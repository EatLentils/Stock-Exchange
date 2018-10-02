package stockExchange;

import java.util.ArrayList;

public class Trader extends java.lang.Object implements java.lang.Comparable<Trader> {
	
	public Brokerage brokerage;
	public  String name, password;
	public ArrayList<String> messages;
	
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
		if(messages.size() == 0)
			return false;
		return true;
	}
	
	public void openWindow(){
		
		TraderWindow myWindow = new TraderWindow(this);
	}

	public void quit() {
		
	}

	public void getQuote(String symbol) {
		
	}

	public void placeOrder(TradeOrder tradeOrder) {
		
	}

	public int compareTo(Trader other) {
		
		return name.compareTo(other.name);
	}
	
	public void recieveMessage(String msg){
		
		messages.add(msg);
		int msgNum = 1;
		for(String i:messages){
			System.out.println("Message " + msgNum + ": " + i);
			msgNum++;
		}
	}
}
