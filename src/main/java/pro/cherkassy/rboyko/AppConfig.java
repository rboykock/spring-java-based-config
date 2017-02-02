package pro.cherkassy.rboyko;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pro.cherkassy.rboyko.beans.*;

/**
 * Created by rboyko on 02.02.17.
 */
@Configuration
public class AppConfig {

    @Autowired
    protected Engine engine_v1;

    @Bean(name = "engine_v1")
    public Engine engine_1(){
        return new Engine(2.5);
    }

    @Bean(name = "engine_v2")
    public Engine engine_2(){
        return new Engine(6.5);
    }

    @Bean(name = "engine_v3")
    public Engine engine_3(){
        return new Engine(7.0);
    }

    @Bean(autowire = Autowire.BY_NAME)
    public Tyres summerTyres(){
        return new SummerTyres(18,"Nokia");
    }

    @Bean(autowire = Autowire.BY_NAME)
    public Tyres winterTyres(){
        return new WinterTyres(20,"Rossava");
    }

    @Bean
    public Wheels wheels_1(Tyres winterTyres){
        return new Wheels(winterTyres);
    }

    @Bean
    public Wheels wheels_2(Tyres summerTyres){
        return new Wheels(summerTyres);
    }

    @Bean
    public Car car_1(Wheels wheels_1){
        return new Car(engine_v1,wheels_1);
    }

    @Bean
    public Car car_2(Engine engine_v2,Wheels wheels_1){
        return new Car(engine_v2,wheels_1);
    }

    @Bean
    public Car car_3(Engine engine_v3,Wheels wheels_2){
        return new Car(engine_v3,wheels_2);
    }
}
