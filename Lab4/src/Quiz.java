import java.util.ArrayList;
import java.util.Scanner;
public class Quiz {
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		String yn,a;
		CitycountryList();
		
		System.out.println(countries.toString());
		System.out.println(cities.toString());
		
		System.out.print(randomQ());
			a = kb.nextLine();
		correct(a);
			
		
		kb.close();
	}
	private static ArrayList<String> countries;
	private static ArrayList<String> cities;
	private static String country = null, city = null;
	public static void CitycountryList(){
		countries = new ArrayList<String>();
		cities 	  = new ArrayList<String>();
		countries.add("Canada");
		cities.add("Ottawa");
		countries.add("United States");
		cities.add("Washington,DC");
		countries.add("Westeros");
		cities.add("King's Landing");
		countries.add("Russia");
		cities.add("Moscow");
		countries.add("France");
		cities.add("Paris");
		
		
	
	}
	public static String randomQ() {
		
		double rand =  Math.random();
		
		
		if(rand>0.5) {
			country = countries.get((int)(Math.random()*countries.size())).toString();
		}
		else
			city = cities.get((int)(Math.random()*cities.size())).toString();
		if(city!=null)
			return "What country is "+city+" capital of?";
		else
			return "What is the capital of "+country+"?";
	}
	
	public static void correct(String a) {
		String answer;
		int i;
		if(city!=null) {
			i = cities.indexOf(city);
			answer = countries.get(i);
			if(answer.toLowerCase().equals(a.toLowerCase()))
				System.out.print("Correct! ");
			else
				System.out.print("Incorrect! The correct answer was "+answer+". ");
		}
		else {
			i = countries.indexOf(country);
			answer = cities.get(i);
			if(answer.toLowerCase().equals(a.toLowerCase()))
				System.out.print("Correct! ");
			else
				System.out.print("Incorrect! The correct answer was "+answer+". ");
		}
		
		
	}
}
