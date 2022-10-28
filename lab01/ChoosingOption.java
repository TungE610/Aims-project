// Ho và tên : Bùi Danh Tùng
// MSSV: 20200568
// Bài 6.1	
// Write, compile and run the ChoosingOption program:
// Viết, biên dịch và chạy chương trình chọn
import javax.swing.JOptionPane;

public class ChoosingOption {
	
    public static void main(String[] args) {

        
        int option = JOptionPane.showConfirmDialog(null,
                "Do you want to change to the first class ticket?"); // Bật lên hộp thoại yêu cầu chọn 
        JOptionPane.showMessageDialog(null, "You've chosen: " +
                (option == JOptionPane.YES_NO_OPTION ? "YES" : "NO")); // Các lựa chọn để chọn

        System.exit(0);
    }

}
