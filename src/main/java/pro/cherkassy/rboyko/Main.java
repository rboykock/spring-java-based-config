package pro.cherkassy.rboyko;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pro.cherkassy.rboyko.beans.*;

/**
 * Created by rboyko on 02.02.17.
 */
public class Main {
    public static void main(String[] args){

        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);

        Car car_1=context.getBean("car_1",Car.class);
        Car car_2=context.getBean("car_2",Car.class);
        Car car_3=context.getBean("car_3",Car.class);

        System.out.println(car_1);
        System.out.println(car_2);
        System.out.println(car_3);
    }
}
