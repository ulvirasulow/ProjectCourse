package entities;

public class Course {

	public Course(int id, String name, double unitPrice, String description, int categoryId) {
		this.id = id;
		this.categoryId = categoryId;
		this.description = description;
		this.name = name;
		this.unitPrice = unitPrice;
	}

	private int id;
	private String name;
	private double unitPrice;
	private String description;
	private int categoryId;

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

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
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
