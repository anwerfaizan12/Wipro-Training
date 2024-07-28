package day_05;

import java.util.Optional;

public class OptionalClass {
	public static void main(String[] args) {
		
		String[] str =new String[10];
		
		// this a second case where we assign value to the string ->
		// str[5] = "faizan";
		
		Optional<String> checkNull = Optional.ofNullable(str[5]);
		
		if(checkNull.isPresent()) {
			String lowerCaseString = str[5].toLowerCase();
			System.out.println(lowerCaseString);
		}
		else {
			System.out.println("String value is not present");
		}
		  
	  }
}
