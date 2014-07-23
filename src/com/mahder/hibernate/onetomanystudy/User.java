/**
 * 
 */
package com.mahder.hibernate.onetomanystudy;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author alemayehu
 *
 */
@Entity
@Table(name="TBL_USER")
public class User implements Serializable {	
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="USER_ID")
	@GeneratedValue
	private int id;
	
	@Column(name="FULL_NAME")
	private String fullName;
	
	@OneToMany(mappedBy="user")
	private List<CreditCard> creditCardList = new ArrayList<CreditCard>();

	public User() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public List<CreditCard> getCreditCardList() {
		return creditCardList;
	}

	public void setCreditCardList(List<CreditCard> creditCardList) {
		this.creditCardList = creditCardList;
	}

}// end class
