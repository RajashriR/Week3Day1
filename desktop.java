package Week3Day1;

public class desktop extends computer {
	public void desktopmodel() {
		System.out.println("Desktop Model: Insignia");
	}

	public static void main(String[] args) {
		System.out.println("Single Inheritance");
		
		desktop d1 = new desktop();
		double computermodel2= d1.computermodel2;
		System.out.println("New Computer Model :" + computermodel2);
		
		d1.computerModel();
		d1.desktopmodel();
	}

}
