import java.util.Scanner;

/*Bài tập: Cho ma trận A gồm n hàng và m cột.
 * a, Nhập và xuất ma trận từ bàn phím
 * b, Tính giá trị lớn nhất của ma trận trên từng hàng, rồi lưu vào vector B
 * c, Tìm hàng chứa phần tử lớn nhất đầu tiên. Hoán đổi hàng đó với hàng K(K nhập từ bàn phím 0<k<=n)
 * */
public class exercise {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,m;
		System.out.println("Nhap so hang cua ma tran");
		n=sc.nextInt();
		
		System.out.println("Nhap so cot cua ma tran");
		m= sc.nextInt();
		
		int matrix[][]  = new int [n][m];
		int maxRow[]= new int [n];
		//Nhap matrix
		for (int i=0; i<n; i++) {
			for (int j=0; j<m; j++) {
				System.out.print("Nhập phần tử thứ [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
			}
		}
		//xuat ma tran 
		System.out.println("Xuat matrix ");
		for (int i=0; i<n; i++) {
			for (int j=0; j<m; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		
		// Tim max cua hàng
		for (int i=0; i<n; i++) {
			int max = matrix[i][0];
			for (int j=1; j<m;j++) {
				if (max <matrix[i][j]) {
					max = matrix [i][j];
				}
			}
			maxRow[i]=max;
		}
		//In ra mang maxRow gom nhung phan tu max
		System.out.println("Xuat mang B");
		for (int i=0; i<n; i++) {
			System.out.println("Phan tu max "+(i+1)+" la "+maxRow[i]);
		}
		//Tim phan hang chua phan tu lon nhat dau tien
		int indexMaxRow =0;
		int maxValue = maxRow[0];
		for (int i=1; i<n; i++) {
			if (maxValue < maxRow[i]) {
				maxRow[i] = maxValue;
				indexMaxRow = i;
			}
		}
		System.out.println("Hang chua phan tu lon nhat dau tien: "+(indexMaxRow+1));
		
		//Hoan doi voi hang k. K nhap tu ban phim. 
		//In mang vua hoan doi duoc
		

			int k;
			do {				
			System.out.println("Nhap hang k");
			k=sc.nextInt();
			} while (k<0 || k>n);
			int temp[]=matrix[indexMaxRow];
			matrix[indexMaxRow] = matrix[k-1];
			matrix[k-1]= temp;
			for (int i=0; i<n; i++) {
				for (int j=0; j<m; j++) {
					System.out.print(matrix[i][j]+ " ");
				}
				System.out.println();
			}
		
	}
}
