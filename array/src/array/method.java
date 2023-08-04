package array;


public class method {
	//Hàm tính tổng 
	public int sum (int a, int b) {
		return a+b;
	}
	//Hàm tính thương 
	public double div (int a, int b) {
		return (double)a/b;
	}
	public static void main(String[] args) {
		int a=5;
		int b=9;
		method m = new method();
		int sum = m.sum(a, b);
		double div =m.div(a, b);
		System.out.println(sum);
		System.out.println(Math.round(div*10000.0)/10000.0);
	}
}
