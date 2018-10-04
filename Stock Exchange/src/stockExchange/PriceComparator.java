package stockExchange;

import java.util.*;

public class PriceComparator implements Comparator<TradeOrder> {
	
	boolean asc = true;
	
	public PriceComparator(){}
	
	public PriceComparator(boolean asc){
		this.asc = asc;
	}
	
	public int compare(TradeOrder order1, TradeOrder order2){
		double diff = order1.getPrice() - order2.getPrice();
		if(asc){
			if(diff < 0){
				return 1;
			}else if(diff > 0){
				return -1;
			}else{
				return 0;
			}
		}else{
			if(diff < 0){
				return -1;
			}else if(diff > 0){
				return 1;
			}else{
				return 0;
			}
		}
	}
}
