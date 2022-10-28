// Họ và tên : Bùi Danh Tùng
// Mssv : 20200568
// Bài tập 2.2.6
/* Program to solve the first-degree equation (linear equation) with one variable, 
   the system of first-degree equations (linear system) with two variables,
   The second-degree equation with one variable
*/
// Chương trình giải phương trình bậc nhất 1 ẩn, hệ phương trình bậc nhất 2 ẩn, và phương trình bậc 2 1 ẩn

import javax.swing.JOptionPane;
import java.lang.Math;
// 2.2.6

public class Ex_2_2_6 {
	// Chương trình giải phương trình bậc nhất 1 ẩn
	public static void solveFirstDegreeEquation(String[] args) {
		String strA; // Khai báo chuỗi để lưu hệ số bậc 1
		String strB; // Khai báo chuỗi để lưu hệ số bậc 0
		
		strA = JOptionPane.showInputDialog(null, "Please input the first number: ", "Input the first number",
				JOptionPane.INFORMATION_MESSAGE); // Nhập vào hệ số bậc 1 dưới dạng string
		
		strB = JOptionPane.showInputDialog(null, "Please input the second number: ", "Input the second number",
				JOptionPane.INFORMATION_MESSAGE); // Nhập vào hệ số bậc 0 dưới dạng string
		
		double a = Double.parseDouble(strA); // Chuyển hệ số bậc 1 về dạng số thực
		double b = Double.parseDouble(strB); // Chuyển hệ số bậc 0 về dạng số thực
		
		if (a == 0) { // Xét trường hợp hệ số bậc 1 của phương trình bậc nhất 1 ẩn bằng 0
			if (b == 0) { // Xét trường hợp cả hệ số bậc 1 và 0 đều bằng 0 thì phương trình có vô số nghiệm
				JOptionPane.showMessageDialog(null,"Above equation has infinitely many solutions !!");
			} else { // Xét trường hợp hệ số bậc 0 khác 0 thì phương trình vô nghiệm
				JOptionPane.showMessageDialog(null,"Above equation doesn't have any roots :((");
			}
		} else { // Xét trường hợp hệ số bậc 1 của phương trình bậc nhất 1 ẩn khác 0
			JOptionPane.showMessageDialog(null, -b / a,"Root of above equation :", JOptionPane.INFORMATION_MESSAGE);
		}
	}
	// Chương trình giải hệ phương trình bậc nhất 2 ẩn
	public static void solveSystemFirstDegEquations(String[] args) {
		
		// Khai báo các chuỗi để lưu trữ các hệ số của hệ phương trình
		String strA11;
		String strA12;
		String strB1;
		String strA21;
		String strA22;
		String strB2;
		// Nhập vào hệ số cho phương trình thứ nhất
		strA11 = JOptionPane.showInputDialog(null, "Please input A11: ", "A11: ",
				JOptionPane.INFORMATION_MESSAGE);
		
		strA12 = JOptionPane.showInputDialog(null, "Please input A12: ", "A12: ",
				JOptionPane.INFORMATION_MESSAGE);
		
		strB1 = JOptionPane.showInputDialog(null, "Please input B1: ", "B1: ",
				JOptionPane.INFORMATION_MESSAGE);
		
		// Nhập vào hệ số cho phương trình thứ hai
		strA21 = JOptionPane.showInputDialog(null, "Please input A21: ", "A21: ",
				JOptionPane.INFORMATION_MESSAGE);
		
		strA22 = JOptionPane.showInputDialog(null, "Please input A22: ", "A22: ",
				JOptionPane.INFORMATION_MESSAGE);
		
		strB2 = JOptionPane.showInputDialog(null, "Please input B2: ", "B2: ",
				JOptionPane.INFORMATION_MESSAGE);
		
		// Chuyển các hệ số về dạng số thực
		double A11 = Double.parseDouble(strA11);
		double A12 = Double.parseDouble(strA12);
		double B1 = Double.parseDouble(strB1);
		double A21 = Double.parseDouble(strA21);
		double A22 = Double.parseDouble(strA22);
		double B2 = Double.parseDouble(strB2);
		
		double D = A11*A22 - A12*A21;// Tinh toán các hệ thức
		double D1 = B1*A22 - A12*B2;
		double D2 = A11*B2 - B1*A21;
		
		if (D != 0) { // Xét trường hợp định thức D khác 0 thì hệ phương trình có 1 nghiệm duy nhất 
			JOptionPane.showMessageDialog(null,	// In ra nghiệm của hệ phương trình
                    "Hệ phương trình có 2 nghiệm là: x1 = " + D1/D + " và x2 = " + D2/D ,
                    "title", JOptionPane.INFORMATION_MESSAGE);		
			}
		else { // Xét trường hợp D = 0 thì có hai trường hợp : hpt vô nghiệm hoặc vô số nghiệm
			if (D1 != 0 || D2 != 0) { // Xét trường hợp có ít nhất 1 trong 2 định thức D1, D2 khác 0 thì hệ phương trình vô nghiệm
				JOptionPane.showMessageDialog(null,
	                    "Hệ phương trình vô nghiệm !!",	// In ra thông báo vô nghiệm
	                    "title", JOptionPane.INFORMATION_MESSAGE);	
			} else { // Xét trường hợp cả D1, D2, D đều bằng 0 thì hệ phương trình vô số nghiệm
				JOptionPane.showMessageDialog(null,
	                    "Hệ phương trình vô số nghiệm !!", // In ra thông báo vô số nghiệm
	                    "title", JOptionPane.INFORMATION_MESSAGE);	
			}
		}
	}
	// Chương trình giải phương trình bậc 2 1 ẩn
	public static void solve2DegreeEquation(String[] args) {
		// Khai báo các chuỗi để lưu trữ giá trị của các hệ số của phương trình ax^2 + bx + c =0
		String strA; 
		String strB;
		String strC;
		
		// Nhập vào hệ số cho phương trình bậc 2
		strA = JOptionPane.showInputDialog(null, "Please input a: ", "a: ",
				JOptionPane.INFORMATION_MESSAGE);
		
		strB = JOptionPane.showInputDialog(null, "Please input b: ", "b: ",
				JOptionPane.INFORMATION_MESSAGE);
		
		strC = JOptionPane.showInputDialog(null, "Please input c: ", "c: ",
				JOptionPane.INFORMATION_MESSAGE);
		
		// Chuyển các hệ số về dạng số thực
		double a = Double.parseDouble(strA);
		double b = Double.parseDouble(strB);
		double c = Double.parseDouble(strC);

		// Tính định thức delta 
		double delta = b*b - 4 * a * c;
		
        if (delta < 0) { // Xét trường hợp định thức delta < 0 thì phương trình vô nghiệm
			JOptionPane.showMessageDialog(null,
                    "Phương trình trên vô nghiệm !!", // In ra thông báo vô nghiệm
                    "title", JOptionPane.INFORMATION_MESSAGE);
        } else if (delta == 0) { // Xét trường hợp định thức delta = 0 thì phương trình có nghiệm kép
			JOptionPane.showMessageDialog(null,
                    "Phương trình trên có nghiệm kép là : x1 = x2 = " + (-b/(2*a)), // In ra thông báo có nghiệm kép
                    "title", JOptionPane.INFORMATION_MESSAGE);
        } else { // Xét trường hợp định thức delta > 0 thì phương trình có 2 nghiệm phân biệt
			JOptionPane.showMessageDialog(null,
                    "Phương trình trên có 2 nghiệm phân biệt là : x1 = " + ((-b + Math.sqrt(a))/(2*a)) + "  và x2 = " + ((-b - Math.sqrt(a))/(2*a)), // In ra thông báo vô nghiệm
                    "title", JOptionPane.INFORMATION_MESSAGE);
        }
	}
}