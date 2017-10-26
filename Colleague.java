public abstract class Person{

	private Mediator mediator;
	private String personType;


	public Colleague(Mediator newMediator){
		mediator = newMediator;

		mediator.addColleague(this);

	}

	public void Emergency(String location, String serviceNeeded){

		mediator.Emergency(location, serviceNeeded, this.colleagueType);

	}

	public void Response(String location, String serviceNeeded){

		mediator.Response(location, serviceNeeded, this.colleagueType);

	}

	public void setCollType(int collType){ colleagueType = collType; }


}
