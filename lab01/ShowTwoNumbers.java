// Họ và tên : Bùi Danh Tùng
// Mssv : 20200568
// Ví dụ 5
// Input and print out 2 numbers program
// Nhập vào và in ra 2 số tuỳ ý

import javax.swing.JOptionPane;

//Nhap vao 2 so va hien ra hai so vua nhap
public class ShowTwoNumbers {
	
	public static void main(String[] args) {
		String strNum1;	//Khai báo xâu để lưu số thứ nhất
		String strNum2;	//Khai báo xâu để lưu số thứ hai 
		String strNotification = "You've just entered: "; //Khởi tạo xâu thông báo
		
		strNum1 = JOptionPane.showInputDialog(null, "Please input the first number: ", "Input the first number",
				JOptionPane.INFORMATION_MESSAGE); // Nhập vào số thứ nhất 
		
		strNotification += strNum1 + " and "; // Thêm số thứ nhất vào chuỗi kết quả được in ra
		
		strNum2 = JOptionPane.showInputDialog(null, "Please input the second number: ", "Input the second number",
				JOptionPane.INFORMATION_MESSAGE); // Nhập vào số thứ hai
				
		strNotification += strNum2;	// Thêm số thứ hai vào chuỗi kết quả được in ra
		
		JOptionPane.showMessageDialog(null, strNotification, "Show two numbers", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0); // In ra 2 số được nhập vào
	}
}
