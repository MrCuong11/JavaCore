import java.util.Scanner;

public class Citizen {
	private String name;
	private String birthday;
	private String address;
	private String idCardNum;
	
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Citizen a= new Citizen();
		Officer b = new Officer();
		// Citizen
        a.Input();
        System.out.println("Citizen information:");
		
        // Officer
        b.Input();
        System.out.println("Officer information:");
        
        //Lien ket tinh: Dùng để . đến một thuộc tính 
        //mà không cần tạo đối tượng
        Citizen.print(a);
        Citizen.print(b);
	}
	
	public Citizen () {
		
	}
	public Citizen(String name, String birthday, String address, String idCardNum) {
		this.name= name;
		this.birthday= birthday;
		this.address = address;
		this.idCardNum= idCardNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name= name;
	}
	
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday= birthday;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address= address;
	}
	
	public String getICardNum() {
		return idCardNum;
	}
	public void setIdCardNum() {
		this.idCardNum= idCardNum;
	}
	
	public void Input() {
		System.out.print("Nhap ten: ");
		name=sc.nextLine();
		System.out.print("Nhap ngay sinh: ");
		birthday=sc.nextLine();
		System.out.print("Nhap dia chi: ");
		address=sc.nextLine();
		System.out.print("Nhap Id: \n");
		idCardNum=sc.nextLine();
	}
	
	public void display() {
		System.out.println("ten: "+this.name);
		System.out.println("Ngay sinh: "+this.birthday);
		System.out.println("Dia chi: "+this.address);
		System.out.println("ID: "+this.idCardNum);
	}
	public static void print(Citizen person) {
    	person.display();
    }
}




	class Officer extends Citizen  {
		private String department;
		private String position;
		
		public Officer() {
			
		}
		public Officer(String name, String birthday, String address, String idCardNum, String department, String position) {
			super(name, birthday, address, idCardNum);
			this.department= department;
			this.position= position;
		}
		public void setDepartment(String department) {
	        this.department = department;
	    }

	    public void setPosition(String position) {
	        this.position = position;
	    }

	    public String getDepartment() {
	        return department;
	    }

	    public String getPosition() {
	        return position;
	    }
	    
	    public void Input() {
	    	super.Input();
	    	System.out.println("Nhap phong ban: ");
	    	department=sc.nextLine();
	    	System.out.println("Nhap vi tri: ");
	    	position=sc.nextLine();
	    }
	    
	    public void display() {
	    	super.display();
	    	System.out.println("Phong ban: "+ this.department);
	    	System.out.println("Vi tri: "+ this.position);
	    }
	    
	}







