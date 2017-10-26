import java.util.ArrayList;

public class DispatchMediator implements Mediator{

	private ArrayList<Person> people;
	private ArrayList<Assistance> emergencies;
	private ArrayList<Assistance> responses;


	public DispatchMediator(){

		people = new ArrayList<Person>();
		emergencies = new ArrayList<Assistance>();
		responses = new ArrayList<Assistance>();
	}

	public void addPerson(Person newPerson){

		people.add(newPerson);

	}

	public void Emergency(String location, String serviceNeeded){

		System.out.println("Civilian at " + location + " needs "  + serviceNeeded + " support immediately.\n");
		Assistance newAssist = new Assistance(location, serviceNeeded);
		emergencies.add(newAssist);
	}

	public void Response(String location, String serviceNeeded){

		System.out.println("Dispatch is sending "  + serviceNeeded + " to provide support at " + location + " immediately.\n");
		Assistance newAssist = new Assistance(location, serviceNeeded);
		responses.add(newAssist);
		emergencies.remove(newAssist);

		for (Assistance assist: emergencies){
			if((assist.getlocation() == location) && (assist.getserviceNeeded() == serviceNeeded)){

				System.out.print("Emergency aid provided by " + serviceNeeded + " at " + location + ". \n");
				emergencies.remove(assist);
			}
		}
	}

	public void getPendingEmergencies(){
		System.out.println("Pending Emergencies: \n");

		for(Assistance assist: emergencies){

			System.out.println(assist.getserviceNeeded() + " support still needed at " + assist.getlocation() + " immediately \n");

		}

	}

}
