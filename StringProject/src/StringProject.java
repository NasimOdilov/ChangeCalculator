import javax.swing.JOptionPane;

public class StringProject {
	public static void main(String [] args ) {
		
		boolean isIdentical = false;
		int lastNameSize, compareResult; 
		char letter;
		//declare a variable and initialize the value
		String firstName = "Nasim";
		char result = firstName.charAt(4);
		
		firstName = firstName.concat("Odilov");
		String Str1 = new String("Odilov");
		String Str2 = Str1;
	    
		// equals() method
		// Are they equal?
		String Str3 = new String("Odilov");
	    String Str4 = new String(" odilov ");
	    isIdentical = Str3.equals(Str4);
	    JOptionPane.showMessageDialog(null, "Str3 and Str4 are identical (case-sensitive)? " + isIdentical, "equals() method", JOptionPane.PLAIN_MESSAGE);
	    
	    // equalsIgnoreCase() method
	 	// Are they equal regardless of case?
	    isIdentical = Str3.equalsIgnoreCase(Str4);
	    JOptionPane.showMessageDialog( null, "Str3 and Str4 are identical (not case-sensitive)? " + isIdentical);		
				
	    //indexOf() method
	    JOptionPane.showMessageDialog( null, "Index of dil is at index " + Str3.indexOf("dili"));
	
	    //lastIndexOf() method
	    JOptionPane.showMessageDialog( null, "Last index of o is at index " + Str4.lastIndexOf("o"));
	
	    //length
	    JOptionPane.showMessageDialog( null, "Length of " + Str1 + " is " + Str1.length());
	    
	    //toLowerCase
	    JOptionPane.showMessageDialog( null, "Lower case of " + Str3 + " is " + Str3.toLowerCase());
	    
	    //toUpperCase method
	    JOptionPane.showMessageDialog( null, "The Upper case of " + Str4 + "is " + Str4.toUpperCase());
	
	    //Replace method
	    JOptionPane.showMessageDialog( null, "The Replace of " + Str4 + " is " + Str4.replace("o","b"));
	    
	    //Substring method
	    JOptionPane.showMessageDialog( null, "The Substring of " + Str4 + " is " + Str4.substring(1));
	
	    //Substring(Start,End)
	    JOptionPane.showMessageDialog( null, "The Substring of " + Str4 + " is " + Str4.substring(1,4));
	    
	    //trim method
	    JOptionPane.showMessageDialog( null, "The Trim of " + Str4 + " is " + Str4.trim());
	}
}
