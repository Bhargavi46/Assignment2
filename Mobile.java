package week1.day2;

public class Mobile {
	public void mobileBrandName() {
	String mobileBrandName = "one+ ";
	System.out.println("mobliebrand=" + mobileBrandName);
	}
	public void mobileLogo() {
	char mobileLogo = '1';
	System.out.println("my mobile logo is =" + mobileLogo);
	}
	public void Piece() {
	Short Piece = 1;
	System.out.println("piece is =" + Piece);
	}
	public void model() {
		int model = 7;
		System.out.println("model is =" + model);
	}
	public void mobileNo() {
		long mobileNo = 6383167170l;
		System.out.println("mobileNo =" + mobileNo);
	}
	public void mobilePrice() {
		float mobilePrice = 59999.9f;
		System.out.println(" mobileprice =" + mobilePrice);
	}
	public void isDamaged() {
		boolean isDamaged = false;
		System.out.println("isDamaged =" + isDamaged);
		
	}
	public static void main(String[] args) {
		Mobile obj = new Mobile();
		obj.mobilePrice();
		obj.mobileLogo();
		obj.mobileNo();
		obj.mobileBrandName();
		obj.isDamaged();
		obj.model();
		obj.Piece();
	}
}
	
	
	
		


