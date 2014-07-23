/**
 * 
 */
package com.mahder.hibernate.onetomanystudy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @author alemayehu
 *
 */
public class TestOneToManyHibernate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		//now create the Entity objects and save them to the database...
		User user = new User();
		user.setFullName("Madher Neway");
		CreditCard creditCard1 = new CreditCard();
		creditCard1.setCreditCardName("Bank of America Credit Card");
		creditCard1.setCreditCardNumber("4264 5102 0986 7234");
		CreditCard creditCard2 = new CreditCard();
		creditCard2.setCreditCardName("Bank of America Credit Card");
		creditCard2.setCreditCardNumber("4888 9370 8619 4638");
		user.getCreditCardList().add(creditCard1);
		user.getCreditCardList().add(creditCard2);
		creditCard1.setUser(user);
		creditCard2.setUser(user);
		session.save(user);
		session.save(creditCard1);
		session.save(creditCard2);
		session.getTransaction().commit();
		session.close();
		System.out.println("Done saving!");
	}

}//end class
