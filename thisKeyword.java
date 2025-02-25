 class Animal {
	private String name;
	private String breed;
	
	public Animal(String name) {
		this.name = name;
	}
	public void printName() {
		System.out.println("My Name is : " + this.name);
	} 
}
public class thisKeyword {
	public static void main (String[] args) {
		Animal animal = new Animal("Daku");
		animal.printName();
		
	}
}