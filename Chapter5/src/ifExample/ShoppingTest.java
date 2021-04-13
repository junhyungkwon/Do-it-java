package ifExample;

public class ShoppingTest {

	public static void main(String[] args) {
		Shopping orderlnfo = new Shopping();
		orderlnfo.orderNumber = "201803120001";
		orderlnfo.orderld = "abc123";
		orderlnfo.orderDate = "2018년 월 12일";
		orderlnfo.orderName = "홍길순";
		orderlnfo.productNumber = "PD0345-12";
		orderlnfo.shippingAddress = "서울시 영등포구 여의도동 20번지";
		
		orderlnfo.showOrderNumber();
		orderlnfo.showOrderld();
		orderlnfo.showOrderDate();
		orderlnfo.showOrderName();
		orderlnfo.showproductNumber();
		orderlnfo.showshippingAddress();
		
		
	}

}
