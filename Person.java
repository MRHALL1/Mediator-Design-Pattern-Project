//For the sake of the example Person will be used instead of Colleague which seems to be expected, as person makes more sense in this scenario.
public abstract class Person{

	private Mediator mediator;


	public Person(Mediator newMediator){
		mediator = newMediator;

		mediator.addPerson(this);

	}

	public void Emergency(String location, String serviceNeeded){

		mediator.Emergency(location, serviceNeeded);

	}

	public void Response(String location, String serviceNeeded){

		mediator.Response(location, serviceNeeded);

	}


}
