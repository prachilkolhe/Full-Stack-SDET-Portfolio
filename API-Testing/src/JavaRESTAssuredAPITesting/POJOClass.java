package JavaRESTAssuredAPITesting;

import java.util.List;

// Creation of POJO Class (Plain Old Java Object)
public class POJOClass {
	
	// Creation of variable to extract the data from response
	private int accuracy;
	private String name;
	private String phone_number;
	private String address;
	private List<String> types;
	private String website;
	private String language;
	
	
	// Creation of Getters and Setters method for each variable
	public int getAccuracy() {
		return accuracy;
	}
	public void setAccuracy(int accuracy) {
		this.accuracy = accuracy;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	public List<String> getTypes() {
		return types;
	}
	public void setTypes(List<String> types) {
		this.types = types;
	}
	
	
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	
	
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	
	// Here Location has nested JSON in it, so need to create another POJO class for this location => SubPOJOLocation
	// To inject that class here, set the return type of variable as that sub class name
	// Also change the return type of Getters and Setters method
	
	private SubPOJOLocation location;
	public SubPOJOLocation getLocation() {
		return location;
	}
	public void setLocation(SubPOJOLocation location) {
		this.location = location;
	}
	
	
	
	
	
	

}
