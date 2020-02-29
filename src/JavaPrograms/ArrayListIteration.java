package JavaPrograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListIteration {

	public static void main(String[] args) {
		// Here we can see in how many ways we can iterate ArrayList
		
		ArrayList<String> tvSeries  = new ArrayList<String>();
		tvSeries.add("Game of Thrones");
		tvSeries.add("Breaking Bad");
		tvSeries.add("The Big bang Theory");
		tvSeries.add("The walikng Dead");
		tvSeries.add("presion break");
		
		//1. using java 8 with for each loop and using lambda expression
		System.out.println("--- print usng with for each and lambda ----");
		tvSeries.forEach(shows->{
			System.out.println(shows);
		});	
		
		System.out.println("--- print usng with Iterator ----");
		//2. Using Iterator 
		Iterator<String> it = tvSeries.iterator();
		
		while(it.hasNext()) {
			String shows = it.next();
			System.out.println(shows);
		}
			
		//3. using  iterator and java 8 forEachRemaining() method
		System.out.println("--- using  iterator and java 8 forEachRemaining() method ----");
		
		it = tvSeries.iterator();
		tvSeries.forEach(shows-> {
			System.out.println(shows);
		});
		
		//4. print using for each loop
		System.out.println("--- print using for each loop ----");
		for(String shows :tvSeries) {
			System.out.println(shows);
		}
			
		//5 using for loop with order/index
		System.out.println("--- using for loop with order/index ----");
		for (int i = 0; i <tvSeries.size(); i++) {
			System.out.println(tvSeries.get(i));
		}
		
		//6 using a listIterator() to traveser in both direction
		System.out.println("--- using listIterator() ----");
		ListIterator<String> listseries = tvSeries.listIterator(tvSeries.size());
		
		while(listseries.hasPrevious()) {
			String shows = listseries.previous();
			System.out.println(shows);
		}
	
	}

}
