// Họ và tên : Bùi Danh Tùng
// MSSV: 20200568
// bài 6.5
// Write a Java program to sort a numeric array, and calculate the sum and average value of array elements
// Viết chương trình để sắp xếp 1 mảng số, tính tổng, giá trị trung bình của các phần tử trong mảng

import java.util.Scanner;

public class Array {
    public static Scanner keyboard = new Scanner(System.in);    // Tạo đối tượng của lớp Scanner có tên keyboard.

    // Sắp xếp một mảng số                                                          
    public static void sort(int[] arr) {
    	
        int temp = 0; // Lưu giá trị temp 
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) { // So sánh 2 phần tử liền kề nếu không đúng thứ tự thì đảo chỗ
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        // Khai báo, khởi tạo, đọc các giá trị từ bàn phím
        int sum = 0; // Khởi tạo giá trị tổng của mảng từ 0
        
        System.out.print("Nhập số phần tử của mảng n: "); // In ra yêu cầu nhập số phần tử của mảng 
        
        int n = keyboard.nextInt();        // Khai báo biến n chỉ số phần tử của mảng
        
        int[] A = new int[n];             // Khai báo mảng arr có n phần tử
        System.out.print("Nhập mảng : \n");   
        
        // Đọc giá trị các phần tử của mảng từ bàn phím 
        for (int i = 0; i < n; i++) {
            System.out.printf("arr[%d] = ", i);  
            A[i] = keyboard.nextInt();            // Đọc các phần tử từ bàn phím
        }

        // Sắp xếp mảng số
        sort(A);

        // In ra mảng sau khi sắp xếp
        System.out.println("Mảng sau khi sắp xếp là: ");
        
        for (int i = 0; i < A.length; i++) {
            sum += A[i];  // Tính tổng các phần tử trong mảng
            System.out.print(A[i] + " "); // In ra từng phần tử trong mảng
        }
        
        System.out.println("\nTổng của mảng: " + sum + ".Trung bình: " + sum / n); // In ra tổng và trung bình cộng các phần tử trong mảng
    }

}
