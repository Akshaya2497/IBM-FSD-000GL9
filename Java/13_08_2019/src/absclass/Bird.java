package absclass;

public class Bird extends Flyer {
	@override
	public void takeoff() {
		System.out.println("Bird takeoff");
	}
	@override
	public void landing() {
		System.out.println("Bird landing");
	}
}
