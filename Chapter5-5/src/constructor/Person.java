package constructor;

public class Person {

	String name;
	float height;
	float weight;
	
	public Person() { } //디폴트 생성자
	
	public Person(String pname) { 
		name = pname;        //11번째 줄과 12번째 줄은 이름을 매개변수로 입력받는 생성
	}
	public Person(String pname, float pheight, float pweight) {
		name= pname;
		height = pheight;
		weight = pweight;   //14번째 줄부터 17번째 줄은 이름, , 몸무게를 매개변수로 입력 받는 생성
		
	}
	

}
