import javax.swing.JOptionPane;
import java.util.Scanner;
public class ChangeCalculator {
	public static void main(String [] args ) {

String amount = JOptionPane.showInputDialog("Enter amount ");
double amount1 = Double.parseDouble(amount);

int remainingAmount = (int)(amount1 *100);

int numberOfOneDollars = remainingAmount / 100;

int numberOfQuarters = (remainingAmount / 25);

int numberOfDimes = remainingAmount / 10;

int numberOfNickles = remainingAmount / 5;

int numberOfPennies = remainingAmount;

JOptionPane.showMessageDialog(null, "Your amount " + amount + " consists of \n " + "\t" + numberOfOneDollars + "dollars\n " + "\t" + numberOfQuarters + "quarters\n" + "\t" + numberOfDimes + "dimes\n" + "\t" + numberOfNickles + "nickles\n" + "\t" + numberOfPennies + "pennies\n" + "\t");
  	 }
 }