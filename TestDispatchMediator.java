public class TestDispatchMediator{

	public static void main(String[] args){

		DispatchMediator nineoneone = new DispatchMediator();

		PoliceOfficer officer = new PoliceOfficer(nineoneone);
		FireRescue fireman = new FireRescue(nineoneone);
		Medical paramedic = new Medical(nineoneone);

		Civilian civilian = new Civilian(nineoneone);

		Civilian civilian2 = new Civilian(nineoneone);

		civilian.Emergency("123 Elm Street","Fire");
		civilian.Emergency("123 Elm Street","Medical");

		fireman.Response("123 Elm Street", "Fire");

		nineoneone.getPendingEmergencies();
	}

}
