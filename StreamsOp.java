import java.util.*;
import java.util.stream.*;

public class StreamsOp
{
	public static void main(String[] args) {
		
		List<Integer> number = Arrays.asList(2,3,4,5);
		List<String> names = Arrays.asList("Reflection","Collection","Stream");
		
		//streams - intermediate function - map
		List<Integer> mapperResult = number.stream().map(x-> x*x).collect(Collectors.toList());
		System.out.println(mapperResult);
		
		//streams - intermediate function - filter
		List<String> filterResult = name.stream().filter(s->s.startsWith("S")).collect.(Collectors.toList());
		System.out.println(filterResult);
		
		//streams - intermediate function - sorted
		List<String> show = names.stream().sorted.collect(Collectors.toList());
		System.out.println(show);
		
		//stream - terminal function -  collect - forEach - reduce
		List<Integer> numbers = Array.toList(2,3,4,5,2);
		
		//collect
		Set<Integer> squareSet = numbers.stream().map(x->x*x).collect(Collectors.toSet());
		System.out.println(squareSet);
		
		//forEach
		number.stream.map(x->x*x).forEach(s->System.out.println(s));
		
		//reduce
		int even = number.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);
		System.out.println(even);
		
		
	}
}
