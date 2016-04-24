public class TestMidTermFloat2Int_Int2Float {

	// Method 1. การแปลงข้อมูลตัวเลขชนิดเลขทศนิยมให้เป็นเลขจำนวนเต็ม
	public static int float2int(float num) {
		return (int)num;
	}

	// Method 2. หรือการแปลงข้อมูลตัวเลขชนิดเลขจำนวนเต็มให้เป็นเลขทศนิยม
	public static float int2float(int num) {
		return (float)num;
	}

	public static void main(String[] args) {
		// เรียกแสดงผล ข้อ 1. float2int(4.5f)
		// ข้อสังเกตุตัวเลขชนิด float จะต้องมี f ต่ำท้าย แต่ชนิด double ไม่ต้องมีอะไรต่อท้าย
		System.out.println(float2int(4.5f));  
		
		// เรียกแสดงผล ข้อ 2. int2float(4)
		System.out.println(int2float(4));
	}
}
