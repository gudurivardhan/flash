package practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public class Streams {

	public static void main(String[] args) {
		
		List<Integer>  l=Arrays.asList(1,3,4,5,7,8,9);
		Integer sum=l.stream().filter(n->n%2==0).map(n->n*2).sorted().reduce(0,(c,e)->c+e);
//		s1.forEach(n->System.out.println(n));
		System.out.println(sum);
	}
}
