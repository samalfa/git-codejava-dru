public class Student {

	private String id;
	private String name;
	private Double gpa;

	public Student(String i, String n, Double g) {
		id = i;
		name = n;
		gpa = g;
	}
	public void showDetails() {
		System.out.println("รหัสนักศึกษา : "+id);
		System.out.println("ชื่อนักศึกษา : "+name);
		System.out.println("GPA : "+gpa);
		System.out.println("================================");
	}
}
