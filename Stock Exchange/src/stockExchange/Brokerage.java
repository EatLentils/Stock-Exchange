package stockExchange;

import java.util.*;
public class Brokerage implements Login
{
	TreeMap<String, Trader> TM;
	TreeSet<Trader> tradersLoggedIn;
	public Trader openWindow;
	public Brokerage(StockExchange exchange)
	{
		TM = new TreeMap<String, Trader>();
		tradersLoggedIn = new TreeSet<Trader>();
	}
	public int addUser(java.lang.String name, java.lang.String password)
	{
		Set<String> s1 = TM.keySet();
		
		for(String s2: s1)
		{
			if(name == TM.get(s2).getName())
			{
				return -3;
			}
		}
		if (name.length() < 4 || name.length() > 10)
			return -1;
		else if (password.length() < 2 || password.length() > 10)
			return -2;
		else
		{
			TM.put(name, new Trader(this, name, password));
			return 0;
		}
	}
	
	public boolean thisIsATest(String name){
		for(Trader i:tradersLoggedIn){
			if(i.getName().equals(name)){
				return true;
			}
		}
		return false;
	}

	public int login(String name, String password)
	{
		
		if (name.length() < 4 || name.length() > 10)
			return -1;
		else if (password.length() < 2 || password.length() > 10)
			return -2;
		else if(thisIsATest(name))
			return -3;
		else
		{
			Set<String> set = TM.keySet();
			for(String trad : set){
				if (name == trad){
					tradersLoggedIn.get(name);
				}
			}
			openWindow();
			if()
			return 0;
		}
	}
	
	public void getQuote(Trader trader, java.lang.String symbol)
	{
		
	}
	public void logout(Trader trader)
	{
		
	}
	public void placeOrder(TradeOrder tradeOrder)
	{
		
	}
}
