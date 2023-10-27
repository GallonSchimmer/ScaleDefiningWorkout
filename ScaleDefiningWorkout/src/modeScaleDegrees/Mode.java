package modeScaleDegrees;



public class Mode {

	//define Modal Mode, Tonic, Scale Degrees, Degrees, Chords for Modal Sound
	
		//when Ionian Mode --> when C Tonic, then Scale Degrees C D E F G A B --> 1 2 3 4 5 6 7 
		//Tonic, major Second, major Third,  Perfect Fourth, Perfect Fifth, Major Sixth, Major Seventh
		
		
		// From light to Dark
		
		//light Modes
		
		public String Ionian = "1 2 3 4 5 6 7";    	    //First Mode
		public String Lydian = "1 2 3 #4 5 6 7";		//Fourth Mode
		
		// Light Dark Mode
		public String Mixolydian = "1 2 3 4 5 6 b7";    // Seventh Mode
		
		
		//Dark Modes
		public String Dorian = "1 2 b3 4 5 6 b7";	    // Second Mode
		public String Aeolian = "1 2 b3 4 5 b6 b7";		//Sixth Mode
		
		public String Phrygian = "1 b2 b3 4 5 b6 b7";	// Third Mode
		public String Locrian = "1 b2 b3 4 b5 b6 b7";	// Seventh Mode
		
		//Constructor
		public Mode () {
			
		}
		
		
		//Method gets the String value of Ionian
		public String getIonian() {	
				System.out.println("getIonian gets the: "+ Ionian);
				return this.Ionian;
			
		}
		
		public String getLydian() {	
			System.out.println("getLydian gets the: "+ Lydian);
			return this.Lydian;
		
		}
		public String getMixolydian() {	
			System.out.println("getMixolydian gets the: "+ Mixolydian);
			return this.Mixolydian;
		
		}
		public String getDorian() {	
			System.out.println("getDorian gets the: "+ Dorian);
			return this.Dorian;
		
		}
		
		public String getAeolian() {	
			System.out.println("getAeolian gets the: "+ Aeolian);
			return this.Aeolian;
		
		}
		
		public String getPhrygian() {	
			System.out.println("getIonian gets the: "+ Phrygian);
			return this.Phrygian;
		
		}
		
		public String getLocrian() {	
			System.out.println("getPhrygian gets the: "+ Locrian);
			return this.Locrian;
		
		}
		
		
		
	
	
	
	
	

	
}
