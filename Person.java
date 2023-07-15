public class Person {
	public static void main (String [] args){
		private String name;
  
    public Person(String name) {
        this.name = name; // "this.name" refers to the instance variable "name"
    }
  
    public void sayHello() {
        System.out.println("Hello, my name is " + this.name + ".");		// "this.name" refers to the instance variable "name"
		}
	}



