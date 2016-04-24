import java.util.*;

public class RunMainCollectionApi {
	public static void main(String[] args) {
		int i;
		Student s;
		Student st[] = new Student[6];
		st[0] = new Student("001", "Sam Alfa", 3.90);
		st[1] = new Student("002", "Jeen Nuttawat", 3.50);
		st[2] = new Student("003", "Tun Taweewat", 3.45);
		st[3] = new Student("004", "Tee Him", 3.25);
		st[4] = new Student("005", "Top Kaiwit", 3.50);
		st[5] = new Student("006", "Tunk Samkhoong", 4.00);

		LinkedList<Student> l1 = new LinkedList<Student>();
		for (i=0; i<st.length; i++) {
			l1.add(st[i]);
		}
		
		Iterator<Student> it = l1.iterator();
		while (it.hasNext()) {
	  		s = it.next();	//s = (Student) it.next();
	  		//s.showDetails();
      	}
      	
      	// for (Student sam : st) {
      	// 	System.out.println(st.toString(sam));
      	// }
	}
}
