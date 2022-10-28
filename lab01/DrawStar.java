// Họ và tên : Bùi Danh Tùng
// MSSV: 20200568
// Bài 6.3
// Write a program to display a triangle with a height of n stars (*), n is entered by users.
// Viết chương trình biểu diễn 1 tam giác sao với độ cao n nhập vào bởi người dùng
import java.util.Scanner;

public class DrawStar {
	
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in); // Tạo đối tượng của lớp Scanner có tên keyboard.

        // Nhập giá trị chiều cao cho tam giác sao
        System.out.println("Nhập vào chiều cao n: "); // Hiện thị yêu cầu nhập chiều cao
        int n = keyboard.nextInt(); // Biến chiều cao n được nhập từ bàn phím

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" "); // Tạo khoảng trắng cho đầu mỗi dòng từ ô 0->n-i-1 ở dòng thứ i
            }
            for (int x = 0; x < 2 * i + 1; x++)
                System.out.print("*"); // ở dòng thứ i có 2i+1 ngôi sao được vẽ
            System.out.println();
        }
    }
}
