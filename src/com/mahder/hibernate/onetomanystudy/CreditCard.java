/**
 * 
 */
package com.mahder.hibernate.onetomanystudy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author alemayehu
 *
 */
@Entity
@Table(name="TBL_CREDIT_CARD")
public class CreditCard {
	@Id
	@Column(name="CREDIT_CARD_ID")
	@GeneratedValue
	private int id;
	
	@Column(name="CREDIT_CARD_NUMBER")
	private String creditCardNumber;
	
	@Column(name="CREDIT_CARD_NAME")
	private String creditCardName;
	
	@ManyToOne
	@JoinColumn(name="USER_ID")
	private User user;
	
	public CreditCard(){
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public String getCreditCardName() {
		return creditCardName;
	}

	public void setCreditCardName(String creditCardName) {
		this.creditCardName = creditCardName;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
	
}//end class
