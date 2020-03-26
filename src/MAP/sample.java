package MAP;

import java.util.TreeMap;

public class sample {
	
	
	
	
	public static void main(String[] args) 
	{

		// HashMap<String, Integer>a1=new HashMap<String, Integer>();
		// a1.put("vijjusonu", 2312);
		// a1.put("pan1nu", 1234);
		// a1.put("pannu", 1234);
		// a1.put(null, 12);
		// System.out.println(a1);
		// System.out.println(a1.get("pannu"));//by using which we can get the value for
		// the specided key
		// //if does not match it will return null value

		// LinkedHashMap<String, String> s1=new LinkedHashMap<String, String>();
		// s1.put("hello", "hi");
		// s1.put(null, "hi");
		// System.out.println(s1.get("null"));

		TreeMap<String, Double> t1 = new TreeMap<String, Double>();
		t1.put("mastercopy", 123.12);
		t1.put("parrot", 123.12);
		t1.put("mastercopy1", 1213.12);
		t1.put("parrot2", 123.122);
		System.out.println(t1.get("parrot"));

		TreeMap<String, Double> t2 = new TreeMap<String, Double>();
		System.out.println(t2);
		t2.putAll(t1);
		System.out.println(t2);
		// t2.remove("parrot", 123.12);

		t2.replace("parrot", 12.6789);
		System.out.println(t2);
		

	}

}
