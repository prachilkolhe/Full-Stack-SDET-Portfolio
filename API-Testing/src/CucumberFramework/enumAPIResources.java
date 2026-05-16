package CucumberFramework;

// enum is a special class which has collections of methods or constants
public enum enumAPIResources {
	
	// Method creation should be at top, the variable and then constructor and other methods
	addPlaceAPI("/maps/api/place/add/json"),
	getPlaceAPI("/maps/api/place/get/json"),
	deletePlaceAPI("/maps/api/place/delete/json");
	
	private String resource;
	

	enumAPIResources(String resource){
		this.resource = resource;
	};
	
	public String getResource() {
		return resource;
	}
}
