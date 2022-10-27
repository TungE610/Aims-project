//Exercise 2.2.5: Ex_2_2_5.java
import javax.swing.JOptionPane;
public class Ex_2_2_5 {
	public static void main(String[] args) {
		String strNum1, strNum2;
		double sum, difference, product, quotient;
		
		strNum1 = JOptionPane.showInputDialog(null, "Please input the first number: ", "Input the first number",
				JOptionPane.INFORMATION_MESSAGE);	
		
		strNum2 = JOptionPane.showInputDialog(null, "Please input the second number: ", "Input the second number",
				JOptionPane.INFORMATION_MESSAGE);
				
		double num1 = Double.parseDouble(strNum1);
		double num2 = Double.parseDouble(strNum2);
	
		sum = num1 + num2;
		System.out.println(sum);
		difference = num1 - num2;
		System.out.println(difference);
		product = num1 * num2;
		System.out.println(product);
		if (num2 == 0) {
			JOptionPane.showMessageDialog(null, "Can not devide these two numbers !!");
		} else {
			quotient = num1 / num2;
			System.out.println(quotient);
		}
		
	}
}
