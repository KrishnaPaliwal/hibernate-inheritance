package com.inheritance.joinTable;

import javax.persistence.*;

@Entity
@Table(name = "payment_methods")
@Inheritance(strategy = InheritanceType.JOINED)
public class PaymentMethod {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String owner;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}
}
