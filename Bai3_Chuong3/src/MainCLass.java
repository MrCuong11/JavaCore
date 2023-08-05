import java.util.Scanner;

abstract class Polygon{
	protected int numVertices;
	protected int [][] vertices;
	protected double area;
	
	Scanner sc = new Scanner(System.in);
	
	public Polygon() {
		
	}
	public void inputVertices () {
		System.out.println("Enter the number of vertices: ");
		numVertices = sc.nextInt();
		vertices = new int [numVertices][2];
		for (int i = 0; i < numVertices; i++) {
			System.out.println("Nhap gia tri x cua dinh thu: "+ (i+1)+ ": ");
			int x = sc.nextInt();
			System.out.println("Nhap gia tri y cua dinh thu: "+ (i+1)+ ": ");
			int y = sc.nextInt();
			vertices[i][0] = x;
			vertices[i][1] = y;
		}
	}
	public void printVertices() {
		for (int i = 0; i < numVertices; i++) {
			System.out.println("Dinh "+ (i+1)+": ("+ vertices[i][0]+", "+vertices[i][1]+ ") ");
		}
	}
	public void printArea() {
        System.out.println("Dien tich: "+area);
	}
	public abstract void calculateArea();
	public abstract void inputVerticesForPolygon();
	
}
class Rectangle extends Polygon{
	public Rectangle() {
    	numVertices = 2;
        vertices = new int[numVertices][2];
    }

	@Override
    public void calculateArea() {
        int width = Math.abs(vertices[0][0] - vertices[1][0]);
        int height = Math.abs(vertices[0][1] - vertices[1][1]);
        area = width * height;
    }
	public void inputVertices() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the top-left vertex:");
        vertices[0][0] = scanner.nextInt();
        vertices[0][1] = scanner.nextInt();
        System.out.println("Enter the bottom-right vertex:");
        vertices[1][0] = scanner.nextInt();
        vertices[1][1] = scanner.nextInt();
        numVertices = 2;
    }
	public void inputVerticesForPolygon () {
		super.inputVertices();
	}
}
public class MainCLass{
    public static void main(String[] args) {
        //Khai báo p với kiểu dữ liệu là lớp cha và đối tượng đó thuộc lớp con
    	Polygon p = new Rectangle();
        p.inputVertices();
        p.calculateArea(); // tính diện tích hình chữ nhật
        p.printArea();
        Polygon c = new Rectangle();
        c.inputVerticesForPolygon();
        c.printVertices();
    }
//    Tóm lai về abstract và tham chiếu các thứ:
//    	Khai báo kiểu này Polygon p = new Rectangle(); thì p thuộc lớp cha nhưng tham chiếu đến lớp con
//    	(isMean:Nếu p muốn gọi đến các method ở lớp con thì cả cha và con đều phải có những method trên thì p mới gọi được, 
//      Còn muốn gọi đến method lớp cha thì oke lớp con không cần có vẫn gọi được, 
//      Lớp cha mà khai báo các method abstract thì lớp con phải overWrite lại mới được )
//    	Ngoài ra thì không thể khởi tạo Polygon p = new Polygon(); được vì Polygon là abstract class
//    	Rectangle c = new Polygon(); viết kiểu này thì không được vì không thể khởi tạo một đối tượng thuộc lớp con và tham chiếu đến lớp cha
}