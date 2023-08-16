import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập giá trị cho n: ");
		n = sc.nextInt();
		System.out.println("Xuất giá trị n: " + n);
		int arr[] = new int[n];
		System.out.println("Nhập mảng: ");
		for (int i = 0; i < n; i++) {
			System.out.println("Nhập phần tử thứ arr[ " + i + " ] = ");
			arr[i] = sc.nextInt();
		}
		System.out.println("Xuất mảng: ");
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i] + " ");
		}
		System.out.println("Nhập mảng 2 chiều");
		int brr[][] = new int[n][n];
		System.out.println("Nhập mảng brr");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("Nhập giá trị cho arr[" + i + "][" + j + "]: ");
				brr[i][j] = sc.nextInt();
			}
		}
		System.out.println("Xuất mảng brr");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(brr[i][j] + " ");
			}
			System.out.println();
		}
		String a = sc.nextLine();
		System.out.println("Nhập vào xâu kí tự t");
		String t = sc.nextLine();
		
		System.out.println("Nhập vào xâu kí tự s");
		String s = sc.nextLine();

		int length = s.length() + t.length();
		System.out.println("Tổng độ dài của hai xâu: " + length);

		int index = t.indexOf(s);
		System.out.println(index);
		if (index==-1) {
			System.out.println("Không tìm thấy vị trí của xâu s trong xâu t");
		}
		else {
			System.out.println("Xâu S ở vị trí thứ "+index+ " trong xâu T");
		}
	}
}