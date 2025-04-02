package main;

import java.util.Iterator;
import java.util.Calendar;

import DiscountRandom.RandomDiscount;
import warehouse.Goods;

import documents.Invoice;
import documents.Item;

//Ext Discount


public class Ui {

	public static void main(String[] args) {
		Calendar now=Calendar.getInstance();
		
		//We create goods
		Goods t1=new Goods(10,"Shoes");
		Goods t2=new Goods(2,"Socks");
		
		//And a sample invoice
		Invoice f=new Invoice(now.getTime(),"Aldona");
		f.addItem(t1,3);
		f.addItem(t2, 5);

		writeInvoice(f);



		//TEST ext. discount
		RandomDiscount rd=new RandomDiscount();
		System.out.println(rd.drawDiscount());
	}
	private static void writeInvoice(Invoice invoice)
	{
		System.out.println("=====================================================");
		System.out.println("Invoice from: "+ invoice.getSaleDate().toString());
		System.out.println("issued for: "+ invoice.getContractor());
		System.out.println("for value of: "+ invoice.getSum());
		Iterator<Item> positionIterator= invoice.getPositionIterator();
		while(positionIterator.hasNext())
		{
			Item item =positionIterator.next();
			System.out.println("Goods: "+ item.getName()+" Quantity: "+ item.getQuantity()+" Value:" + item.getValue());
		}
		System.out.println("=====================================================");
	}

}
