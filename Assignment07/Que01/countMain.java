package question3;


import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class countMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str;
		str = sc.nextLine();
		Map<String, Integer> m =  countOccurance.count(str);
		for(Entry<String, Integer> ele : m.entrySet() ) {
			System.out.println("Word: "+ ele.getKey() + " Occurance: " + ele.getValue());
		}
		
		
	}

}
