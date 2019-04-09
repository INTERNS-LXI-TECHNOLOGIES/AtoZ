package com.lxisoft.AtoZ.model;

public class Product {

	private long id;
	private String name;
	private Float price;
	private String mgfDate;
	private String expDate;
	private String quantiry;
	private String tax;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public String getMgfDate() {
		return mgfDate;
	}
	public void setMgfDate(String mgfDate) {
		this.mgfDate = mgfDate;
	}
	public String getExpDate() {
		return expDate;
	}
	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}
	public String getQuantiry() {
		return quantiry;
	}
	public void setQuantiry(String quantiry) {
		this.quantiry = quantiry;
	}
	public String getTax() {
		return tax;
	}
	public void setTax(String tax) {
		this.tax = tax;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", mgfDate=" + mgfDate + ", expDate="
				+ expDate + ", quantiry=" + quantiry + ", tax=" + tax + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((expDate == null) ? 0 : expDate.hashCode());
		result = prime * result + ((mgfDate == null) ? 0 : mgfDate.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		result = prime * result + ((quantiry == null) ? 0 : quantiry.hashCode());
		result = prime * result + ((tax == null) ? 0 : tax.hashCode());
		return result;
	}
	
	
	
}
