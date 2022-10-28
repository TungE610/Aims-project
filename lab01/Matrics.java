// Ho ten: Bùi Danh Tùng
// MSSV: 20200568
// Bài 6.6
// Write a Java program to add two matrices of the same size.
// Viết chương trình cộng 2 ma trận cùng kích thước

import java.util.Scanner;

public class Matrics {
    public static Scanner keyboard = new Scanner(System.in); // Tạo đối tượng của lớp Scanner có tên keyboard.

    public static void main(String[] args) {

    	// In ra yêu cầu nhập kích thước n 
        System.out.print("Nhập vào kích thước n: "); 
        int n = keyboard.nextInt();    // Lưu giá trị nhập vào biến nguyên n
        int[][] Max1 = new int[n][n];   // Khai báo mảng 2 mảng 2 chiều kích thước n x n
        int[][] Max2 = new int[n][n];

        // Nhập giá trị cho ma trận thứ nhất
        System.out.print("Nhập ma trận thứ nhất: \n"); // In yêu cầu nhập ma trận thứ nhất
        for (int i = 0; i < n; i++) {	// Nhập lần lượt từng dòng, từng cột cho ma trận
            for (int j = 0; j < n; j++) {
            	
                System.out.printf("Max1[%d][%d] = ", i, j);
                Max1[i][j] = keyboard.nextInt(); // Nhập vào giá trị cho các phần tử
                
            }
        }

        // Nhập giá trị cho ma trận thứ hai
        System.out.print("Nhập ma trận thứ 2: \n"); // In yêu cầu nhập ma trận thứ 2
        for (int i = 0; i < n; i++) { // Nhập lần lượt từng dòng từng cột cho ma trận
            for (int j = 0; j < n; j++) {
            	
                System.out.printf("Max2[%d][%d] = ", i, j);
                Max2[i][j] = keyboard.nextInt(); // Nhập vào giá trị cho các phần tử
                
            }
        }
        System.out.print("Kết quả của phép cộng ma trận là:  "); 
        // Cộng lần lượt từng vị trí của 2 ma trận và in ra các giá trị vừa nhận được
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(Max1[i][j] + Max2[i][j] + " ");// Cộng lần lượt từng vị trí tương ứng và in ra
            }
            System.out.println();
        }
    }
}
