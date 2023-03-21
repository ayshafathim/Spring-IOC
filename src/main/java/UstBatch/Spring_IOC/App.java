package UstBatch.Spring_IOC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context =   
    		    new ClassPathXmlApplicationContext("applicationContext.xml");  
    	sim s=context.getBean(sim.class);
    	s.dialing();
    	s.calling();
    }
}
