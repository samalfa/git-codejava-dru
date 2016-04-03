import java.util.*;

public class Ex1CollectionApi {
	public static void main(String[] args) {
		Student s;
		Student st[] = new Student[3];
		st[0] = new Student("001", "Sam Alfa", 3.90);
		st[1] = new Student("002", "Jeen Nuttawat", 3.50); 
		st[2] = new Student("003", "Tun Taweewat", 3.45); 

		Student stu = new  Student("001", "Std n", 4.25);

		LinkedList<Student> l1 = new LinkedList<Student>();
		l1.add(stu);
		// l1.add(st[1]);	
		// l1.add(st[2]);
		Iterator iu = l1.iterator();
		while (iu.hasNext()) {
	  		s = (Student) iu.next();
	  		s.showDetails();
      	}
		// for (int i=0; i<st.length; i++) {
		// 	st[i].showDetails();
		// }
	}
}