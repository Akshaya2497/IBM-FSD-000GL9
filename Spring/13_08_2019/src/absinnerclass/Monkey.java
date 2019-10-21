package absinnerclass;

public class Monkey implements Livingthings{
	private String name;
	public Monkey(String name) {
		this.name= name;
	}
	public String getName() {
		return this.name;
	}
	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("Name of dog is"+getName());
	}
	
}
