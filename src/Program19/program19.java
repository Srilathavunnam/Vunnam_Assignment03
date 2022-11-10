/**
 * 
 */
package Program19;


/**
 * @author S545534
 *
 */
public class program19 extends Thread {

	/**
	 * @param args
	 */
	public void run(){  
		System.out.println("thread is running...");  
		}  
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		program19 t1=new program19();  
		t1.start(); 
	}

}
