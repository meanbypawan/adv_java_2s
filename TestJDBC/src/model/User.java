package model;

public class User {
    private Integer id;
    private String name;
    private String contact;
    private Integer age;
	public User(Integer id, String name, String contact, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.contact = contact;
		this.age = age;
	}
	public User(String name, String contact, Integer age) {
		super();
		this.name = name;
		this.contact = contact;
		this.age = age;
	}
	public User() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
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
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
    
    
}
