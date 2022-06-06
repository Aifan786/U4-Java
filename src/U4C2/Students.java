package U4C2;

public class Students {

	public int roll;
	public String name;
	public String address;
	public int marks;
		
//	public Students() {}                                              


	public Students(int r, String n, String ad, int ms) {
		this.roll = r;
		this.name = n;
		this.address = ad;
		this.marks = ms;
	}


	public void details() {
		System.out.println("Roll is: "+roll);
		System.out.println("Name is: "+name);
		System.out.println("Address is: "+address);
		System.out.println("Marks is: "+marks);
		
	}

	
	
}
