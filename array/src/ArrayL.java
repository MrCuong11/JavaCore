import java.util.ArrayList;
import java.util.Collections;

public class ArrayL {
	public static void main(String[] args) {
		ArrayList<Integer> arrList = new ArrayList<>();
		//Thêm phần tử vào arrList
		arrList.add(10);
		arrList.add(5);
		arrList.add(4);
		arrList.add(3);
		arrList.add(1);
		arrList.add(7);
		for (int i = 0; i < arrList.size(); i++) {
			System.out.print(" "+arrList.get(i)+" ");
		}
		
		System.out.println("");
		System.out.println("---------------------");
		
		for (Integer item : arrList) {
			System.out.println(item);
		}
		System.out.println("------------arrayList tang dan--------------");
		Collections.sort(arrList);
		for (Integer item : arrList) {
			System.out.println(item);
		}
		System.out.println("------------arrayList giam dan--------------");
		Collections.reverse(arrList);
		for (Integer item : arrList) {
			System.out.println(item);
		}
		System.out.println("----------tim min--------------");
		int findMin = Collections.min(arrList);
		System.out.println("Min = "+findMin);
		
		System.out.println("----------tim max--------------");
		int findMax = Collections.max(arrList);
		System.out.println("Max = "+findMax);
	}
}
