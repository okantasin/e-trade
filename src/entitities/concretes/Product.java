package entitities.concretes;

public class Product {
	private int id;
	private String name;
	private int unitPrice;
	private String description;
	private int categoryId;
	
	public Product() {
		super();
	}
	public Product(int id, String name, int unitPrice, String description, int categoryId) {
		super();
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.description = description;
		this.categoryId = categoryId;
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
	public int getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	
	

}
