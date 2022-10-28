// Họ và tên: Bùi Danh Tùng
// MSSV: 20200568
// Bài 6.4
// Write a program to display the number of days of a month
// Viết chương trình biểu diễn số ngày trong 1 tháng

import java.util.Scanner;

public class NumberOfDay {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in); // Tạo đối tượng của lớp Scanner có tên keyboard.

        // Khởi tạo xâu để lưu trữ giá trị và nhập vào
        System.out.print("Nhập vào tháng muốn tìm: "); // In ra thông báo nhập tháng
        String strMonth = keyboard.nextLine(); // Khởi tạo biến strMonth để lưu trữ giá trị tháng được nhập vào
        
        System.out.print("Nhập năm muốn tìm: "); // In ra thông báo nhập năm
        int year = keyboard.nextInt(); // Khởi tạo biến year lưu giá trị năm nhập từ bàn phím
        
        int month = 0; // Khởi tạo biến month để nhận giá trị biến sau khi kiểm tra

        // Rẽ nhánh cho giá trị tháng được nhập vào
        switch (strMonth) {
            case "January":	// cac truong hop the hien thang nhap vao là tháng 1
            case "Jan":
            case "Jan.":
            case "1":
                month = 1;
                break;
            case "February": // cac truong hop the hien thang nhap vao là tháng 2
            case "Feb":
            case "Feb.":
            case "2":
                month = 2;
                break;
            case "March": // cac truong hop the hien thang nhap vao là tháng 3
            case "Mar":
            case "Mar.":
            case "3":
                month = 3; 
                break;
            case "April": // cac truong hop the hien thang nhap vao là tháng 4
            case "Apr":
            case "Apr.":
            case "4":
                month = 4; 
                break;
            case "May": // cac truong hop the hien thang nhap vao là tháng 5
            case "5":
                month = 5;
                break;
            case "June": // cac truong hop the hien thang nhap vao là tháng 6
            case "Jun":
            case "6":
                month = 6;
                break;
            case "July": // cac truong hop the hien thang nhap vao là tháng 7
            case "Jul":
            case "7":
                month = 7;
                break;
            case "August": // cac truong hop the hien thang nhap vao là tháng 8
            case "Aug.":
            case "Aug":
            case "8":
                month = 8;
                break;
            case "September": // cac truong hop the hien thang nhap vao là tháng 9
            case "Sept.":
            case "Sep":
            case "9":
                month = 9;
                break;
            case "October": // cac truong hop the hien thang nhap vao là tháng 10
            case "Oct.":
            case "Oct":
            case "10":
                month = 10;
                break;
            case "November": // cac truong hop the hien thang nhap vao là tháng 11
            case "Nov.":
            case "Nov":
            case "11":
                month = 11;
                break;
            case "December": // cac truong hop the hien thang nhap vao là tháng 12
            case "Dec.":
            case "Dec":
            case "12":
                month = 12;
                break;

        }

        // Kiểm tra trường hợp năm là năm nhuận
        boolean leapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        // In ra số ngày tương ứng với tháng được nhập vào và năm được nhập vào
        switch (month) {
            case 1: // Tháng 1 có 31 ngày
                System.out.println(
                        "January " + year + " had 31 days");
                break;
            case 2: // Tháng 2 có 29 ngày nếu là năm nhuận và 28 ngày với năm thường
                System.out.println("February " + year + " had" +
                        ((leapYear) ? " 29 days" : " 28 days"));
                break;
            case 3: // Tháng 3 có 31 ngày
                System.out.println(
                        "March " + year + " had 31 days");
                break;
            case 4: // Tháng 4 có 30 ngày
                System.out.println(
                        "April " + year + " had 30 days");
                break;
            case 5: // Tháng 5 có 31 ngày
                System.out.println(
                        "May " + year + " had 31 days");
                break;
            case 6: // Tháng 6 có 30 ngày
                System.out.println(
                        "June " + year + " had 30 days");
                break;
            case 7: // Tháng 7 có 31 ngày
                System.out.println(
                        "July " + year + " had 31 days");
                break;
            case 8: // Tháng 8 có 31 ngày
                System.out.println(
                        "August " + year + " had 31 days");
                break;
            case 9: // Tháng 9 có 30 ngày
                System.out.println(
                        "September " + year + " had 30 days");
                break;
            case 10: // Tháng 10 có 31 ngày
                System.out.println(
                        "October " + year + " had 31 days");
                break;
            case 11: // Tháng 11 có 30 ngày
                System.out.println(
                        "November " + year + " had 30 days");
                break;
            case 12: // Tháng 12 có 31 ngày
                System.out.println(
                        "December " + year + " had 31 days");
        }
    }
}
