package item.storage;

public class Item {
	private int quantity;
	private String name;
	private double price;

	public Item() {
		this.quantity = 0;
		this.name = null;
		this.price = 0;
	}
	
	public Item(int quantity, String name, double price) {
		this.quantity = quantity;
		this.name = name;
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
}
