package stockExchange;

import java.util.*;

public class PriceComparator implements Comparator<TradeOrder> {
	
	boolean asc = true;
	
	public PriceComparator(){}
	
	public PriceComparator(boolean asc){
		this.asc = asc;
	}
	
	public int compare(TradeOrder order1, TradeOrder order2){
		if(order1.isLimit() && order2.isMarket()){
			return 1;
		}else if(order1.isMarket() && order2.isLimit()){
			return -1;
		}else if(order1.isMarket() && order2.isMarket()){
			return 0;
		}
		int o1price = (int)(order1.getPrice()*100);
		int o2price = (int)(order2.getPrice()*100);
		if(asc){
			return o1price-o2price;
		}else{
			return o2price-o1price;
		}
	}
}
