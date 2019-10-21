package absclass;

public class Superman extends Flyer {
	@override
	public void takeoff() {
		System.out.println("superman takeoff");
	}
	@override
	public void landing() {
		System.out.println("superman landing");
	}
}
