//Question5 Sort Map by key value pair using ArrayList 
import java.util.*; 
class Question5 { 
  
static Map<String, Integer> map = new HashMap<>(); 
  
    public static void sortbykey() 
    { 
        ArrayList<String> sortedKeys = 
                    new ArrayList<String>(map.keySet()); 
          
        Collections.sort(sortedKeys);  
  
        // Display the TreeMap which is naturally sorted 
        for (String x : sortedKeys)  
            System.out.println("Name = " + x +  
                        ", id = " + map.get(x));      
    } 
      
    public static void main(String args[]) 
    { 
        // putting values in the Map 
       
		map.put("abc3", 5); 
		map.put("abc", 4); 
        map.put("abc5", 6); 
	 map.put("ab2", 10); 
        sortbykey(); 
    } 
} 