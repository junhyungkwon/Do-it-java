package study1;

public class switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ranking = 1;
		char medalColor;
		
		switch (ranking) {
			case 1 : medalColor = 'G';
				break;
			
			case 2 : medalColor = 'S';
					break;
			
			case 3 : medalColor = 'B';
					break;
			
			default:
					medalColor = 'A';
		}
		
		
			System.out.println(ranking + "등의 메달 색은" + medalColor + "입니다");
		}

	}


