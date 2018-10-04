package stockExchange;

import java.util.*;
public class Brokerage implements Login
{
	TreeMap<String, Trader> TM1;
	TreeMap<String, Trader> TM2;
	public Brokerage(StockExchange exchange)
	{
		TM1 = new TreeMap<String, Trader>();
	}
	public int addUser(java.lang.String name, java.lang.String password)
	{
		Set<String> s1 = TM1.keySet();
		
		for(String s2: s1)
		{
			if(name == TM1.get(s2).getName())
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
			TM1.put(name, new Trader(this, name, password));
			return 0;
		}
	}

	public int login(String name, String password)
	{
		
	}
	
	public void getQuote(Trader trader, java.lang.String symbol)
	{
		
	}

}
