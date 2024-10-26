package model;

public class OrderDetails {
	private int id;
	private String name;
	private String contact;
	private int userId;
	private int productId;
	private String deliveryAddress;
	private float billAmount;

	public OrderDetails(int id, String name, String contact, int userId, int productId, String deliveryAddress,
			float billAmount) {
		super();
		this.id = id;
		this.name = name;
		this.contact = contact;
		this.userId = userId;
		this.productId = productId;
		this.deliveryAddress = deliveryAddress;
		this.billAmount = billAmount;
	}

	public OrderDetails(String name, String contact, int userId, int productId, String deliveryAddress,
			float billAmount) {
		super();
		this.name = name;
		this.contact = contact;
		this.userId = userId;
		this.productId = productId;
		this.deliveryAddress = deliveryAddress;
		this.billAmount = billAmount;
	}

	public OrderDetails() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	public float getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(float billAmount) {
		this.billAmount = billAmount;
	}

}
