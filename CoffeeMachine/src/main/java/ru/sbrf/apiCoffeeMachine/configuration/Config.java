package ru.sbrf.apiCoffeeMachine.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.sbrf.coffee.impl.CoffeeMachineVitek;


@Configuration
public class Config {
    @Bean
    public CoffeeMachineVitek coffeeMachine(){
        return CoffeeMachineVitek.builder().amountOfWater(1500).
                amountOfCoffeeBeans(500).cleanCounter(0).build();
    }
}
