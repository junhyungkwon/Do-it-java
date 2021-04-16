package study1;

public class WhileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 1;
		int sum = 0;
		
		while (num<=10) { //num 값이 10보다 작거나 같을때 
			sum += num; //합계를 뜻하는 sum에 num을 더하고 
			num++; //num에 1씩 더해 나가는 것 
		}
			System.out.println("1부터 10까지의 합은" + sum + "입니다");
		}

	}


