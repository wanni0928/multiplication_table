package object.practice;

public class Main {
	public static void main(String[] args) {
		Person person = new Person();
		person.setAge(40);
		person.setName("James");
		person.setIsMarriage(true);
		person.setChildrenCnt(3);
		
		System.out.println(person.toString());
		
		Order order = new Order();
		order.setOrderNumber("201907210001");
		order.setOwnerAccount("abc123");
		order.setOrderDate("2019년 7월 21일");
		order.setOwnerName("홍길동");
		order.setProductNum("PD0345-12");
		order.setDeliveryAddress("서울시 영등포구 여의도동 20번지");
		
		System.out.println(order.toString());
	}
}
