import java.util.Scanner;

public class Square {

	private int width, area;

	// public void setWidth(int width) {
	// 	this.width = width;
	// }

	// public int getWidth() {
	// 	return width;
	// }

	public int calArea() {
		return area = width*width;
	}

	public void showArea() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Width: ");
		width = input.nextInt();
		calArea();
		System.out.printf("Area : %d \n", area);
		System.out.println("================");
	}
		
}
