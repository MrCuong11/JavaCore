
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v = new Vehicle();
		v.init();
		v.display();

		Vehicle v1 = new Car();
		v1.init();
		v1.display();

		Car car1 = new Car();
		car1.init();
		car1.display();

		car1.run();
		car1.sleep();
		car1.start();
		car1.stop();

	}

}

class Vehicle {
	protected String brand;
	protected double speed;
	protected double weight;
	protected String color;

	public Vehicle() {

	}

	public void init() {
		Scanner number = new Scanner(System.in);
		Scanner line = new Scanner(System.in);
		System.out.println("Nhập Brand: ");
		this.brand = line.nextLine();
		System.out.println("Nhập Speed: ");
		this.speed = number.nextFloat();
		System.out.println("Nhập Weight: ");
		this.weight = number.nextFloat();
		System.out.println("Nhập Color: ");
		this.color = line.nextLine();
	}

	public void display() {
		System.out.println("Brand: " + this.brand);
		System.out.println("Speed: " + this.speed);
		System.out.println("Weight: " + this.weight);
		System.out.println("Color: " + this.color);
	}
}

class Car extends Vehicle implements Movement {
	private int seatNum;

	public Car() {

	}

	public void init() {
		super.init();
		Scanner c = new Scanner(System.in);
		System.out.println("Nhập seatNum: ");
		this.seatNum = c.nextInt();
	}

	public void display() {
		super.display();
		System.out.println("seatNum: " + this.seatNum);
	}

	public void run() {
		System.out.println("The car is running");
	}

	public void sleep() {
		System.out.println("The car is sleeping");
	}

	public void stop() {
		System.out.println("The car is stoping");
	}

	public void start() {
		System.out.println("The car is starting");
	}

}

interface Movement {
	abstract void run();

	abstract void sleep();

	abstract void stop();

	abstract void start();
}
