package Program18;

public class program18 extends Thread {
	public void run() {
		System.out.println("running...");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		program18 t1 = new program18();
		t1.start();
		t1.start();
	}

}
