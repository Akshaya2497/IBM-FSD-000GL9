package exception;

public class ExceptionHandling {
	public static void main(String[] args) {
		int num=0;
		for(String arg:args) {
			try {
				num+= Integer.parseInt(arg);
				System.out.println(args[10]);
				
				
			}
			catch(NumberFormatException nfe) {
				System.err.println("Number format exception");
				nfe.printStackTrace();
				nfe.getCause();
				System.exit(0);
				
			}
			catch(ArrayIndexOutOfBoundsException arrIndex ) {
				System.err.println("Array Index out of bound");
				arrIndex.printStackTrace();
				System.exit(0);
				
			}
			catch(Exception e) {
				System.out.println("Exception occured");
				System.exit(0);
			}
		}
		System.out.println("num is"+num);
	}

}
