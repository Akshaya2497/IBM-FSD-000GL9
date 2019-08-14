package employeepack;
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = null;
		e= new permanentEmp(10000);
		System.out.println(e.getDetails());
		e= new ContractualEmp(100);
		System.out.println(e.getDetails());
		
		

	}

}
