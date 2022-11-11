package lab02;
public class Aims {
	public static void main(String[] args) {
		
		// create a new cart
		Cart anOrder = new Cart();
		
		// create new dvd object and add them to the cart
		DigitalVideoDsc dvd1 = new DigitalVideoDsc("The Lion King", "Animation", "Roger Allers", 87, 19.95f); 
		
		anOrder.addDigitalVideoDisc(dvd1);
		
		DigitalVideoDsc dvd2 = new DigitalVideoDsc("Stars War", "Science Fiction", "Geogre Lucas", 87, 24.95f); 
		
		anOrder.addDigitalVideoDisc(dvd2);
		
		DigitalVideoDsc dvd3 = new DigitalVideoDsc("Aladin", "Animation", "Roger Allers", 18.99f); 
		
		anOrder.addDigitalVideoDisc(dvd3);
		
		// print total cost of items in the cart
		
		System.out.println("Total Cost is: ");
		System.out.println(anOrder.totalCost);
		
	}
}
