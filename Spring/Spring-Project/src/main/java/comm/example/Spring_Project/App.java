package comm.example.Spring_Project;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import comm.example.Spring_Project.bean.BasketballCoach;
import comm.example.Spring_Project.bean.Coach;
import comm.example.Spring_Project.bean.CricketCoach;
import comm.example.Spring_Project.bean.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	try {
//        	
//        	ClassPathXmlApplicationContext context=new 
//        			ClassPathXmlApplicationContext("applicationContext.xml");
//        	Coach myCoach=context.getBean("theCoach",CricketCoach.class);
//        	System.out.println(myCoach.getDailyWorkout());
//        	Coach myCoach1=context.getBean("theCoach",CricketCoach.class);
//        	System.out.println(myCoach==myCoach1);
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
    	ClassPathXmlApplicationContext context=new 
    			ClassPathXmlApplicationContext("applicationContext.xml");
    	Employee theEmployee=context.getBean("theEmployee",Employee.class);
    	System.out.println(theEmployee.getAddress());
		
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
    }
}

