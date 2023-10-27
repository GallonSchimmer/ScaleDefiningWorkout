package modeScaleDegrees;


import java.util.Scanner;

public class ScaleModeApp {
	
	public static void main(String[] args) {
	
	Scanner inputScale = new Scanner(System.in);
	System.out.println("Enter a Mode (Ionian, Doriam, Phrygian, Lydian, Mixolydian, Aeolian, Locrian) : " );
	
	String modeToAnalyse = inputScale.nextLine();
	System.out.println("Your Mode is : " + modeToAnalyse);
	
		//compare input string with abstract mode to output scale String
		//System.out.println("your Mode toString() is: " + modeToAnalyse.toString());
	
	
	//Accessing a method with return String from the Class Mode getIonian and printing it
	Mode newMode = new Mode();
	
		//String ionianScale = newMode.getIonian();
		//System.out.println("The Ionian Scale Degrees: " + ionianScale);
	
		//check if name of imput is same as Values of Ionian String variable-> does not work
		//if(modeToAnalyse.toString() == newMode.Ionian) {
		//	System.out.println("Your Scale Degrees are: " + newMode.Ionian);
		//}else {
		//	System.out.println(modeToAnalyse + " is not equal to " + newMode.Ionian);
		//}
	
	
	//Condition to call every method and print the Scale Degree values for each Input String option
	if(modeToAnalyse.toString().equals("Ionian")) {
		System.out.println("Your Scale Degrees are: " + newMode.Ionian);
	}else {
		System.out.println(modeToAnalyse.toString() + " is not equal to " + "Ionian");
	}
	
	//getDorian
	if(modeToAnalyse.toString().equals("Dorian")) {
		System.out.println("Your Scale Degrees are: " + newMode.Dorian);
	}else {
		System.out.println(modeToAnalyse.toString() + " is not equal to " + "Dorian");
	}
	
	
	//getPhrygian
	if(modeToAnalyse.toString().equals("Phrygian")) {
		System.out.println("Your Scale Degrees are: " + newMode.Phrygian);
	}else {
		System.out.println(modeToAnalyse.toString() + " is not equal to " + "Phrygian");
	}
	
	
	//getLydian
	if(modeToAnalyse.toString().equals("Lydian")) {
		System.out.println("Your Scale Degrees are: " + newMode.Lydian);
	}else {
		System.out.println(modeToAnalyse.toString() + " is not equal to " + "Lydian");
	}
	
	//getMixolydian
	if(modeToAnalyse.toString().equals("Mixolydian")) {
		System.out.println("Your Scale Degrees are: " + newMode.Mixolydian);
	}else {
		System.out.println(modeToAnalyse.toString() + " is not equal to " + "Mixolydian");
	}
	
	//getAeolian
	if(modeToAnalyse.toString().equals("Aeolian")) {
		System.out.println("Your Scale Degrees are: " + newMode.Aeolian);
	}else {
		System.out.println(modeToAnalyse.toString() + " is not equal to " + "Aeolian");
	}
	
	//getLocrian
	if(modeToAnalyse.toString().equals("Locrian")) {
		System.out.println("Your Scale Degrees are: " + newMode.Locrian);
	}else {
		System.out.println(modeToAnalyse.toString() + " is not equal to " + "Locrian");
	}


	}
	//https://stackoverflow.com/questions/10759453/java-substring-equals-versus
	//https://www.geeksforgeeks.org/substring-in-java/
	//https://stackoverflow.com/questions/12662257/check-if-a-variable-is-equal-to-a-string
	//https://www.w3schools.com/java/ref_string_equals.asp
	//https://www.geeksforgeeks.org/string-arrays-in-java/
	//https://www.geeksforgeeks.org/map-interface-java-examples/
	//https://www.digitalocean.com/community/tutorials/abstract-class-in-java
	//https://stackoverflow.com/questions/10924561/java-scanner-string-input-if-statement-not-working
	//https://www.geeksforgeeks.org/compare-two-strings-in-java/
}



