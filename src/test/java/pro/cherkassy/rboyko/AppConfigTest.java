package pro.cherkassy.rboyko;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pro.cherkassy.rboyko.beans.*;

import static org.junit.Assert.*;

/**
 * Created by rboyko on 02.02.17.
 */
public class AppConfigTest {

    protected ApplicationContext context;

    @Before
    public void setUp() throws Exception {
        context=new AnnotationConfigApplicationContext(AppConfig.class);
    }

    @Test
    public void testWinterTyres(){
        Tyres tyres=context.getBean("winterTyres", WinterTyres.class);
        assertEquals(tyres.getClass(),WinterTyres.class);
    }

    @Test
    public void testSummerTyres(){
        Tyres tyres=context.getBean("summerTyres", SummerTyres.class);
        assertEquals(tyres.getClass(),SummerTyres.class);
    }

    @Test
    public void testEngine(){
        Engine engine=context.getBean("engine_v1",Engine.class);
        assertEquals(engine.getClass(),Engine.class);
    }

    @Test
    public void testWheels(){
        Wheels wheels=context.getBean("wheels_1",Wheels.class);
        assertEquals("Rossava 20d",wheels.toString());
    }

    @Test
    public void testCar(){
        Car car=context.getBean("car_1",Car.class);
        assertEquals("Engine:V2.5. Wheels:Rossava 20d",car.toString());
    }
}