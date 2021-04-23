package ifExample;

class Person{
	String name;
	int age;
	
	Person( )  {
		this("권준형", 24); //this를 사용하여 Person(String, int) 생성자를 호
	
	}
	
	Person(String name, int age) {
		this.name = name;
		this.age= age;
	}
}

public class this2 {
	

	public static void main(String[] args) {
		Person noName = new Person() ;
		System.out.println(noName.name);
		System.out.println(noName.age);
		
		
	}

}
