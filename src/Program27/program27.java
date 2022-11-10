/**
 * 
 */
package Program27;

/**
 * @author S545534
 *
 */
public class program27 {

	/**
	 * @param args
	 */

	// TODO Auto-generated method stub
	public static class Singleton {
		private static Singleton instance = null;

		private Singleton() {
		}

		public static Singleton getInstance() {
			if (instance == null) {
				instance = new Singleton();
			}

			return instance;
		}
	}
}
