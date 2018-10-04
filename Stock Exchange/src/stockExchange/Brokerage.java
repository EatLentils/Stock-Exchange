package stockExchange;

import java.util.*;
public class Brokerage implements Login
{
	TreeMap<String, Trader> TM;
	ArrayList<String> tradersLoggedIn;
	public Brokerage(StockExchange exchange)
	{
		TM = new TreeMap<String, Trader>();
		tradersLoggedIn = new ArrayList<String>();
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
		for(String i:tradersLoggedIn){
			if(i.equals(name)){
				return false;
			}
		}
		return true;
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
			tradersLoggedIn.add(name);
			return 0;
		}
	}
	
	public void getQuote(Trader trader, java.lang.String symbol)
	{
		
	}
	public void logout(Trader trader) {
		
		
	}

}
