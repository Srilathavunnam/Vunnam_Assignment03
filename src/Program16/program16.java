/**
 * 
 */
package Program16;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/**
 * @author S545534
 *
 */
public class program16 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Map<String, Long> myPhoneBook = new HashMap<String, Long>(100, 0.9f);

	        myPhoneBook.put("Srilatha", (long) 1234566788);
	        myPhoneBook.put("Vunnam", (long) 469927216);
	        myPhoneBook.put("Latha", (long) 89670232);

	        Set<Map.Entry<String, Long>> myPhoneBookSet = myPhoneBook.entrySet();
	        System.out.println("---------: Contacts in my Phone List :----------");
	        for (Map.Entry<String, Long> phoneEntry : myPhoneBookSet) {
	            System.out.println("Name : " + phoneEntry.getKey() + " " + " Number : " + phoneEntry.getValue());
	        }
	        System.out.println("------------------------------------------------");
	        System.out.println("No of contacts in myPhoneBook : " + myPhoneBook.size());
	        System.out.println("Vunnam Contact number : " + myPhoneBook.get("Vunnam"));
	        System.out.println("Delete Latha contact : " + myPhoneBook.remove("Latha"));
	}

}
