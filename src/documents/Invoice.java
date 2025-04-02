package documents;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Date;

import warehouse.Goods;


public class Invoice {
	Date saleDate;
	String contractor;
	ArrayList<Item> positions;
	double sum;
	public Invoice(Date saleDate, String contractor)
	{
		this.saleDate =saleDate;
		this.contractor =contractor;
		positions =new ArrayList<Item>();
		sum =0;
	}
	public void addItem(Goods goods, double quantity)
	{
		positions.add(new Item(goods,quantity));
		this.recalculateSum();
	}
	public double getSum()
	{
		return sum;
	}
	public Date getSaleDate()
	{
		return saleDate;
	}

	//If something changes on the invoice, you need to call this method
	private void recalculateSum()
	{
		Iterator<Item> positionIterator= positions.iterator();
		Item item;
		sum =0;
		while(positionIterator.hasNext())
		{
			item = positionIterator.next();
			sum += item.getValue();
		}
		
	}
	public Iterator<Item> getPositionIterator()
	{
		return positions.iterator();
	}
	public String getContractor()
	{
		return this.contractor;
	}
	
	
}
