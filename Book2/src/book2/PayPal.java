/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book2;

/**
 *
 * @author CltControl
 */
/* Se creo la clase paypall
/* Movi todos los metodos de pagos a la clase paypall ya que a esta clase le estoy otorgando una responsabilidad unica*/
public class PayPal {
    public void pay(String method, Book book) {
		if("card".equals(method)) {
			pay_card("numberCard", book);
		}else if ( "cash".equals(method)) {
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
}
