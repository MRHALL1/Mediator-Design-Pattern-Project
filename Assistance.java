//This class will define
public class Assistance{

	private String location = ""; //Location of actor/person
	private String serviceNeeded = ""; //police, fire, medical

	public Assistance(String locations, String servicesNeeded){

		location = locations;
		serviceNeeded = servicesNeeded;

	}

	public String getlocation() { return location; }
	public String getserviceNeeded() { return serviceNeeded; }

}
