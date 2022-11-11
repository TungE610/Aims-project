// Họ và tên : Bùi Danh Tùng
// MSSV : 20200568

import java.util.Arrays;
package lab02;

public class Cart {
	public static final int Max_Numbers_Ordered = 20; // Max numder of orders that can be placed
	public static int orderedQuantity = 0; // counter variable
	
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[Max_Numbers_Ordered]; // Declare array of DVDs
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) { // Adding new DVD to cart method
		if (itemsOrdered.length > Max_Numbers_Ordered) {
			System.out.println("BuiDanhTung-20200568-The Cart is almost full !!"); // print out the notification that the ordered number exceeds the maximum number
		} else {
			itemsOrdered[orderedQuantity] = disc; // add new DVD to the array
			orderedQuantity++; // increase counter variable 
			System.out.println("BuiDanhTung-20200568-This DVD has been added!!"); // print out the notification that this DVD has successfully been added
		}
	}
	
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) { // Removing DVD from Cart method
		for (int i = 0, j = 0 ; i < orderedQuantity - 1; j ++) {
			
			if(!itemsOrdered[j].equals(disc)) { // If DVD is not to be removed, remain index of this
				arr[i++] = arr[j];
			}
		}
		
		itemsOrdered = Arrays.copyOf(itemsOrdered, i); 
	}
	
	public float totalCost () { // Calculating total cost of DVDs in the Cart method
		float totalCost = 0;
		for (int i = 0; i < orderedQuantity - 1; i ++ ) { // loop through all the dvds in the cart
			totalCost = totalCost + itemsOrdered[i].getCost(); // sum up the totalCost
		}
		
		return totalCost; // return totalCost
	}
}








