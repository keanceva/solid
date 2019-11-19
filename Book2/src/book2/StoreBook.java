/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book2;

import java.util.ArrayList;

/**
 *
 * @author win10
 */
public class StoreBook extends Book {
    protected ArrayList<Book> books;
    protected Book book;

    public StoreBook(String title, String author, String category, float price) {
        super(title, author, category, price);
    }
	
	
	
	
	public void pay(String method, Book book) {
		if(method == "card") {
			pay_card("numberCard", book);
		}else if ( method == "cash") {
			pay_cash( "money", book);
		}
	}
	
	public void pay_card(String card, Book book) {
		/*
		 * change state to true
		 */
	}
	
	public void pay_cash(String money, Book book) {
		/*
		 * change state to true
		 */
	}
	
	public void removeBooksPurchased(ArrayList<Book> books) {
		/*
		 * store books with state true in new array and remove the original array
		 * 
		 */
	}
}
// storebook es una clase hija de book por lo que se aplica herencia