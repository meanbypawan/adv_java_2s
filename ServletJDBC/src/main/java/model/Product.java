package model;

public class Product {
	private Integer id;
	private String title;
	private Float price;
	private String brand;

	public Product() {
	}

	public Product(String title, Float price, String brand) {
		super();
		this.title = title;
		this.price = price;
		this.brand = brand;
	}

	public Product(Integer id, String title, Float price, String brand) {
		super();
		this.id = id;
		this.title = title;
		this.price = price;
		this.brand = brand;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

}
