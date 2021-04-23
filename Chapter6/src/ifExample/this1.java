package ifExample;

 class BirthDay{
	int day;
	int month;
	int year;
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public void printThis( ) {
		System.out.println(this);
	}
		
	}
    
    public class this1 {
	public static void main(String[] args) {
		BirthDay bDay = new BirthDay() ;
		bDay.setYear(1998);       //태어난 연도를 1998으로 지
		System.out.println(bDay);  // 참조 변수 출력하
		bDay.printThis();   // this 출력 메서드 호
		

	}

}
