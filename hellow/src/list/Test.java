package list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Test {
	public static void main(String[] args) {
		
		LinkedList<Student> a =new LinkedList<Student>();
		
		Student s1 = new Student("aa",11);
		Student s2 = new Student("bb", 22);
		Student s3 = new Student("cc", 33);
		a.add(s1);
		a.add(s2);
		a.add(s3);
		
		for (int i = 0; i < a.size(); i++) {
			
//			System.out.println(a.get(i).getName());
		}
		
		LinkedHashSet<String> b = new LinkedHashSet<String>();
		
		b.add("aa");
		b.add("ccc");
		b.add("aa");
		for (String j:b){
//			System.out.println(j);
		}
		
		LinkedHashSet<Student> c = new LinkedHashSet<Student>();
		
		c.addAll(a);
		c.add(s1);
		for (Student k:c){
//			System.out.println(k.getName());
		}
		
		
		HashMap<Integer,Student> map = new HashMap<Integer,Student>();
		map.put(1, new Student("����",11));
		map.put(2, new Student("����",22));
		map.put(3, new Student("����",33));
		
		Iterator<Integer> it = map.keySet().iterator(); 
		
		while(it.hasNext()){
			int key = it.next();
			Student ss = map.get(key);
			System.out.println(ss.getName());
		}
		
		
		
	}
}