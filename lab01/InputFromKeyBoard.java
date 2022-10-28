// Họ và tên : Bùi Danh Tùng 
// MSSV: 20200568
// Bài 6.2	
// Write a program for input/output from keyboard
//Viết chương trình cho nhập/xuất từ bàn phím 

import java.util.Scanner;

public class InputFromKeyboard {
	
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // In ra yêu cầu nhập vào dữ liệu để lưu vào các biến 
        System.out.println("What is your name?"); // In ra thông báo nhập tên 
        String strName = keyboard.nextLine(); // Khai báo xâu strName để lưu giá trị tên
        
        System.out.println("How old are you?"); // In ra thông báo nhập tuổi
        int iAge = keyboard.nextInt(); // Khai báo xâu iAge để lưu giá trị tuổi 
        
        System.out.println("How tall are you (m)?"); // In ra thông báo nhập chiều cao
        double dHeight = keyboard.nextDouble(); // Khai báo xâu dHeight để lưu giá trị chiều cao

        // In ra màn hình dữ liệu vừa được nhập vào
        System.out.println("Mrs/Ms " + strName + ", " + iAge + " years old."
                + "Your height is :" + dHeight + "."); 
    }

}
