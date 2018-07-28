public class Address {
	private String street;
	private String city;
	private String province;
	private String postalCode;

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	boolean IsPersonAddress() {
		return true;
	}

	public Address() {
		street = "Rob street";
		city = "Rob street";
		postalCode = "Rob street";
		province = "Rob street";
	}

	public Address(String street, String city, String province,
			String postalCode) {
		super();
		this.street = street;
		this.city = city;
		this.province = province;
		this.postalCode = postalCode;
	}

}
