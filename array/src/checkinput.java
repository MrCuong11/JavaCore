import java.util.Scanner;

public class checkinput {
	// Sử dụng tryCatch kiểm tra input đầu vào. Input này chỉ nhận số
	// Nếu người dùng nhập chữ, thì yêu cầu nhập lại
	public int checkInput() {
		int number = 0;
		while (true) {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.print("Nhập số :");
				number = sc.nextInt();
				break;
			} 
			catch (Exception e) {
		}
		}
		return number;
	}

	public checkPositive () {
		int n=0;
		Scanner sc = new Scanner(System.in);
		while (true) {
			try {
				System.out.print("Số dương");
				n= sc.nextInt();
				if (n>0) {
					break;
				}
			} catch (Exception e) {
				
			}
		}
		return n;
	}
	public static void main(String[] args) {
		checkinput c = new checkinput();
		int number = c.checkInput();
		System.out.println("Number = "+ number);

		int n = c.checkInput();
		System.out.print(n);
	}
}
