package lab02;
public class Cart {
	public static final int Max_Numbers_Ordered = 20;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[Max_Numbers_Ordered];
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (itemsOrdered.length > Max_Numbers_Ordered) {
			System.out.println("The number of orders exceeds the maximum number. ");   
		} else {
			
		}
	}
}








