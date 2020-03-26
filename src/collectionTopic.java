import java.util.ArrayList;

public class collectionTopic 
{
	public static void main(String[] args) 
	{
		ArrayList l1=new ArrayList();
		l1.add("hello");
		l1.add(12);
		l1.add(true);
		l1.add(12.12);
		l1.add(12.12f);
		ArrayList l2=new ArrayList(l1);
		l2.add("special");
		//System.out.println(l1+" "+l2);
	//	l2.retainAll(l1);
		l2.removeAll(l1);
		System.out.println(l2);
		
		
	}

}
