public interface Mediator {

	public void Emergency(String location, String serviceNeeded);

	public void Response(String location, String serviceNeeded);

	public void addPerson(Person person);

}
