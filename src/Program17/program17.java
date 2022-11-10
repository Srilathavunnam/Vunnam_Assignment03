package Program17;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class program17 {
	    public static void main(String[] args)   
	    {   
	        ConcurrentHashMap<String, Integer> m = new ConcurrentHashMap<String, Integer>(); 
	        m.put("Ninty Eight", 98);   
	        m.put("Ninty Nine", 99);   
	        Iterator<String> it = m.keySet().iterator();   
	        while (it.hasNext()) {   
	            String key = (String)it.next();   
	            System.out.println(key + " : " + m.get(key));   
	            m.put("Hundred", 100);   
	        }   
	    }   
	}  
