package Week3Day1;

public class axisBank extends bankInfo {
	public void deposit() {
		System.out.println("Deposits in axiss bank");
		
	}

	public static void main(String[] args) {
		
axisBank ab = new axisBank();
ab.deposit();
ab.savings();
ab.fixed();

bankInfo bi = new bankInfo();
bi.deposit();
	}

}
