package modeScaleInterfaceAbstract;

import java.util.Scanner;

import modeScaleDegrees.Mode;

public class ScaleModeAppInterface {
	
	public static void main(String[] args) {
	
	Scanner inputScale = new Scanner(System.in);
	System.out.println("Enter a Mode (Ionian, Doriam, Phrygian, Lydian, Mixolydian, Aeolian, Locrian) : " );
	
	String modeToAnalyse = inputScale.nextLine();
	System.out.println("Your Mode is : " + modeToAnalyse);
	
	Mode newMode = new Mode();
	
	if(modeToAnalyse.toString().equals("Ionian")) {
		System.out.println("Your Scale Degrees are: " + newMode.Ionian);
	}else if(modeToAnalyse.toString().equals("Dorian")) {
		System.out.println("Your Scale Degrees are: " + newMode.Dorian);
	}else if(modeToAnalyse.toString().equals("Phrygian")) {
		System.out.println("Your Scale Degrees are: " + newMode.Phrygian);		
	}else if(modeToAnalyse.toString().equals("Lydian")) {
		System.out.println("Your Scale Degrees are: " + newMode.Lydian);
	}else if(modeToAnalyse.toString().equals("Mixolydian")) {
		System.out.println("Your Scale Degrees are: " + newMode.Mixolydian);
	}else if(modeToAnalyse.toString().equals("Aeolian")) {
		System.out.println("Your Scale Degrees are: " + newMode.Aeolian);
	}else if(modeToAnalyse.toString().equals("Locrian")) {
		System.out.println("Your Scale Degrees are: " + newMode.Locrian);
	}
	

	}
}
