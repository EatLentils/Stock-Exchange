package stockExchange;

import java.util.*;

public class Trader extends java.lang.Object implements java.lang.Comparable<Trader> {
	
	public Brokerage brokerage;
	public String name, password;
	public LinkedList<String> messages;
	public TraderWindow myWindow;
	
	public Trader(Brokerage brokerage, String name, String pswd){
		messages = new LinkedList<String>();
		this.brokerage = brokerage;
		this.name = name;
		password = pswd;
		
	}
	
	public boolean equals(Object other){
		
		if(!(other instanceof Trader)){
			return false;
		}
		return name.equals(((Trader)other).name);
		
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
		
		myWindow = new TraderWindow(this);
	}

	public void quit() {
		
		
		myWindow = null;
		brokerage.logout(this);
		
	}

	public void getQuote(String symbol) {
		
		brokerage.getQuote(this, symbol);
		
	}

	public void placeOrder(TradeOrder tradeOrder) {
		
		brokerage.placeOrder(tradeOrder);
		
	}

	public int compareTo(Trader other) {
		
		return name.compareTo(other.name);
	}
	
	public void recieveMessage(String msg){
		
		messages.add(msg);
		if(myWindow != null){
			for(int i = 0; i < messages.size(); i++)
				myWindow.showMessage(messages.remove(i));
		}
	}
	
}
