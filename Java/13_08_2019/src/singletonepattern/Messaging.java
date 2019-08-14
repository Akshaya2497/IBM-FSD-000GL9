package singletonepattern;

public class Messaging {
 private String msg;
 private static Messaging message;
 private Messaging() {
	 
 }
 private Messaging(String message) {
	 System.out.println(this.msg);
	 this.msg=message;
 }
 public String getmsg() {
	 return this.msg;
 }

@Override
public String toString() {
	return "Messaging [msg=" + msg + "]";
}
////public static Messaging createmessage() {
//	if(message==null) {
//		message= new Messaging();
//		System.out.println("no params");
//	}
//	
//	return message;
//}
public static Messaging createmessageparams() {
	System.out.println("before params");
	if(message==null) {
		System.out.println("aftr params");
		
		message= new Messaging("Welcome");
		
	}
	return message;
}
}

