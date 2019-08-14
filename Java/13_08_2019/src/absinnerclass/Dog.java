package absinnerclass;

public class Dog {
	private String bread;
	public Dog(String bread) {
		this.bread=bread;
	}
	public String gebread() {
	return this.bread;
	}
	public void createLivingThings() {
		Livingthings living = new Livingthings() {

			@Override
			public void walk() {
				// TODO Auto-generated method stub
				System.out.println("Dog's bread is"+getbread());
			}
			 
		};
		
	}
}
