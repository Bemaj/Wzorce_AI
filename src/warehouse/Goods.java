package warehouse;

public class Goods {
	private double price;
	private String name;
	
	public Goods(double price, String name)
	{
		this.price = price;
		this.name = name;
	}
	
	//price operations
	public void setPrice(double price)
	{
		this.price = price;
	}
	
	public double getPrice()
	{
		return price;
	}
	//operations on the name of the item
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
}
