package P030100;

public class Creating {
	String name;
	int age;
	int power;
	public Creating(String n) {
		this.name = n;
		
	}
	public Creating(int a, int p) {
		this.age = a;
		this.power = p;
	}

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	void printCharacter() {
		System.out.println(this.name + this.age + this.power);
	}
		
	
}
	
	


