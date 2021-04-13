package ifExample;

public class Shopping {
	String orderNumber;
	String orderld;
	String orderDate;
	String orderName;
	String productNumber;
	String shippingAddress;
	
	public void showOrderNumber() {
		System.out.println("주문 번호 :" + orderNumber); //주문 번호 출력
	}
	public void showOrderld() {
		System.out.println("주문 아이디 :" + orderld); //주문자 아이디 출력
	}
	public void showOrderDate() {
		System.out.println("주문 날짜  :" + orderDate ); //주문 날짜 출력 
	}
	public void showOrderName() {
		System.out.println("주문자 이름  :" + orderName); //주문자 이름 출력
	}
	public void showproductNumber() {
		System.out.println("주문 상품 번호  :" + productNumber);//주문 상품 번호 출력
	}
	public void showshippingAddress() {
		System.out.println("배송 주  :" + shippingAddress); // 배송 주소 출력 
	}
	
	public void setOrderNumber(String number) {
		orderNumber = number;
	}
	
	public void setOrderld(String id) {
		orderld = id;
	}
	
	public void OrderDate(String date) {
		orderDate = date;
	}
	
	public void setOrderName(String name) {
		orderName = name ;
	}
	
	public void setProductNumber(String product) {
		productNumber = product;
	}
	
	public void setShippingAddress(String address) {
		shippingAddress = address;
	}
	

	}


