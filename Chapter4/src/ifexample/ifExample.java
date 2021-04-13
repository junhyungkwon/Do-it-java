package ifexample;

public class ifExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age = 10;
		int charge= 0;
		
		if(age <8) {
			charge = 1000;
			System.out.println("미취학 아동 입니다 	");
		}
		else if (age <14) {
			charge = 2000;
			System.out.println("초등학생 입니다  ");
		}
		else if (age <19) {
			charge = 2500;
			System.out.println("고등학생 입니다 ");
		}
		else {
			charge = 3000;
			System.out.println ("성인입니다 ");
	}
	
		System.out.println("입장료는 " + charge + "원입니다 ");
	
		}
	}


