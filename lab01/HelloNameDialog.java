// Họ và tên: Bùi Danh Tùng
// Mssv : 20200568
// Ví dụ 3
// Print input string program
// In chuỗi được nhập vào

import javax.swing.JOptionPane;

public class HelloNameDialog{
	
	public static void main(String[] args) {
		String result;
		result = JOptionPane.showInputDialog("Please enter your name: "); // Nhập vào chuỗi và lưu vào chuỗi result
		JOptionPane.showMessageDialog(null, "Hi " + result + "!");	// In ra chuỗi kết quả
		System.exit(0);
	}
}
