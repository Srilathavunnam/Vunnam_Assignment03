/**
 * 
 */
package Program09;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author S545534
 *
 */
public class program09 {

	/**
	 * @param args
	 * @return 
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	public static String main(String[] args) throws FileNotFoundException, IOException {
		String path = null;
		// TODO Auto-generated method stub
		try (FileReader fr = new FileReader(path);
		         BufferedReader br = new BufferedReader(fr)) {
		        return br.readLine();
		    }
	}

}
