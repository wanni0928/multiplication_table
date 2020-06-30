package object.practice;

public class Order {
	private String orderNumber;
	private String ownerAccount;
	private String orderDate;
	private String ownerName;
	private String productNum;
	private String deliveryAddress;
	
	public Order() {
		// TODO Auto-generated constructor stub
	}

	public Order(String orderNumber, String ownerAccount, String orderDate, String ownerName, String productNum,
			String deliveryAddress) {
		super();
		this.orderNumber = orderNumber;
		this.ownerAccount = ownerAccount;
		this.orderDate = orderDate;
		this.ownerName = ownerName;
		this.productNum = productNum;
		this.deliveryAddress = deliveryAddress;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getOwnerAccount() {
		return ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getProductNum() {
		return productNum;
	}

	public void setProductNum(String productNum) {
		this.productNum = productNum;
	}

	public String getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	@Override
	public String toString() {
		return "Order [deliveryAddress=" + deliveryAddress + ", orderDate=" + orderDate + ", orderNumber=" + orderNumber
				+ ", ownerAccount=" + ownerAccount + ", ownerName=" + ownerName + ", productNum=" + productNum + "]";
	}
}	
