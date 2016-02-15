import javax.swing.JOptionPane;

public class HeightConverter {

	public static void main(String[] args) {
		String strHeightFeet = "";
		String strHeightInches = "";
		double dblHeightFeet;
		//prompt the user by using JOPtionPAne input dialog;
		
		strHeightFeet = JOptionPane.showInputDialog("Enter your height in cm's ");
		
		double number1 = Double.parseDouble(strHeightFeet);
		

		double inches = (number1*0.39);
		double feet = (inches/12);
		
		
		JOptionPane.showMessageDialog(null, "Your height in feet is " + feet + " feet and " + inches + " inches");
		
		
		

	}

}
