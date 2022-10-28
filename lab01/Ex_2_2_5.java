// Họ và tên : Bùi Danh Tùng
// Mssv : 20200568
// Bài tập 2.2.5
// calculate sum, difference, product, and quotient of 2 double numbers program
// Chương trình tính toán tổng, hiệu, tích, thương của 2 số thực

import javax.swing.JOptionPane;

public class Ex_2_2_5 {
	
	public static void main(String[] args) {	
		String strNum1;	// Khai báo chuỗi để lưu số thứ nhất
		String strNum2; // Khai báo chuỗi để lưu số thứ 2
		double sum, difference, product, quotient;	// Khai báo các biến lưu trữ tổng, hiệu, tích, thương
		
		strNum1 = JOptionPane.showInputDialog(null, "Bùi Danh Tùng - 20200568 - Nhập vào số thức nhất: ", "Bùi Danh Tùng - 20200568 - Nhập vào số thức nhất",
				JOptionPane.INFORMATION_MESSAGE); // Nhập vào số thứ nhất dưới dạng string
		
		strNum2 = JOptionPane.showInputDialog(null, "Bùi Danh Tùng - 20200568 - Nhập vào số thứ hai: ", "Bùi Danh Tùng - 20200568 - Nhập vào số thứ hai",
				JOptionPane.INFORMATION_MESSAGE); // Nhập vào số thứ hai dưới dạng string
				
		double num1 = Double.parseDouble(strNum1); // Chuyển số thứ nhất sang dạng số thực
		double num2 = Double.parseDouble(strNum2); // Chuyển số thứ hai sang dạng số thực
	
		sum = num1 + num2; // Tính tổng của 2 số
		JOptionPane.showMessageDialog(null, // In ra tổng của 2 số
                "Bùi Danh Tùng - 20200568 - Tổng của 2 số: " + sum, 
                "Bùi Danh Tùng - 20200568 - Tổng của 2 số ", JOptionPane.INFORMATION_MESSAGE);	
		
		difference = num1 - num2; // Tính hiệu của 2 số
		JOptionPane.showMessageDialog(null, // In ra hiệu của 2 số
                "Bùi Danh Tùng - 20200568 - Hiệu của 2 số: " + difference, 
                "Bùi Danh Tùng - 20200568 - Hiệu của 2 số ", JOptionPane.INFORMATION_MESSAGE);	
		
		product = num1 * num2; // Tính tích của 2 số
		JOptionPane.showMessageDialog(null, // In ra tích của 2 số
                "Bùi Danh Tùng - 20200568 - Tích của 2 số: " + product, 
                "Bùi Danh Tùng - 20200568 - Tích của 2 số ", JOptionPane.INFORMATION_MESSAGE);	
		
		if (num2 == 0) { // Kiểm tra trường hợp số chia = 0
			JOptionPane.showMessageDialog(null, "Bùi Danh Tùng - 20200568 - Can not devide these two numbers !!");	// Không thể thực hiện được phép chia
		} else {
			quotient = num1 / num2;	// Nếu số chia khác không thì tính thương như bình thường
			JOptionPane.showMessageDialog(null, // In ra thương của 2 số
	                "Bùi Danh Tùng - 20200568 - Thương của 2 số: " + quotient, 
	                "Bùi Danh Tùng - 20200568 - Thương của 2 số ", JOptionPane.INFORMATION_MESSAGE);	
		}
		
	}
}
