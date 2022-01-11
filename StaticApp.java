class Foo{
	public static String classVar="I class var";
	public String instanceVar="I instance var";
	public static void classMethod() {
		System.out.println(classVar); //ok
		//System.out.println(instanceVar); //error
	}
	public void instanceMethod() {
		System.out.println(classVar); //ok
		System.out.println(instanceVar); //ok
	}
}

public class StaticApp {

	public static void main(String[] args) {
		System.out.println(Foo.classVar); //ok
		//System.out.println(Foo.instanceVar); //error
		
		Foo.classMethod(); //ok
		//Foo.instanceMethod(); //error

	}

}
