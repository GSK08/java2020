package TreeSet;

import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class sets {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<Integer>();
	    long N = 1_000_000;
		Random rand = new Random();
	    int num;
	    long start = System.currentTimeMillis();
	    
	    for (int i = 0; i < N; i++) {
	    	num = rand.nextInt();
			set.add(num);
		}
	    
	    
	    for (Iterator iterator = set.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
		}
	    
	    long end = System.currentTimeMillis();
	    
	    
	    System.out.println("Time Lapsed: " + (end-start));
	}
    		
}
