package week1.day2;

public class TwoWheeler {
	public void noOfWheels() {
		int noOfWheels = 2;
		System.out.println("bike wheels =" + noOfWheels);
	}
	public void noOfMirrors() {
		short noOfMirrors = 2;
		System.out.println("bike mirrors =" + noOfMirrors);
	}
	public void chassisNumber() {
		long chassisNumber = 638316717098765l;
		System.out.println("bike chassis =" + chassisNumber);
	}
	public void isPunctured() {
		boolean isPunctured = true;
		System.out.println("bike is punctured =" + isPunctured);
	} 
	public void bikeName() {
		String bikeName = "jupiter";
		System.out.println("my bike name is =" + bikeName);
	}
	public void runningkm() {
		double runningKm = 45.000;
		System.out.println("bike km is =" + runningKm);
	}
		
	public static void main(String[] args) {   
		TwoWheeler jupiter = new TwoWheeler();
		jupiter.chassisNumber();
		jupiter.noOfWheels();
		jupiter.isPunctured();
		jupiter.runningkm();
		jupiter.bikeName();
		jupiter.noOfMirrors();
		
	}

}
