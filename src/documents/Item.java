package documents;

import warehouse.Goods;

public class Item {
	private Goods goods;
	private double price;
	private double quantity;
	private double value;
	private String name;

	public Item(Goods goods, double quantity) {
		this.goods = goods;
		this.quantity = quantity;
		this.price = goods.getPrice();
		this.name = goods.getName();
		this.recalculateValue();
	}

	public void setTowar(Goods goods) {
		this.goods = goods;
		this.price = goods.getPrice();
		this.recalculateValue();
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
		this.recalculateValue();
	}

	public double getPrice()
	{
		return this.price;
	}
	
	public void setPrice(double price) {
		this.price = price;
		this.recalculateValue();
	}

	public String getName() {
		return name;
	}

	public double getValue() {
		return value;
	}

	// If anything changes, you need to call this method
	private void recalculateValue() {
		this.value = this.quantity * this.price;
	}

}
