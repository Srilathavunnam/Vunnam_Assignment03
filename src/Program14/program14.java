/**
 * 
 */
package Program14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * @author S545534
 *
 */
public class program14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<String> list =
		           Collections.synchronizedList(new ArrayList<String>());
		 
		        list.add("practice");
		        list.add("code");
		        list.add("quiz");
		 
		        synchronized(list)
		        {
		            // must be in synchronized block
		            Iterator it = list.iterator();
		 
		            while (it.hasNext())
		                System.out.println(it.next());
		        }
	}

}
