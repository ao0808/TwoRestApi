package ru.sbrf.apiCoffeeMachine.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.sbrf.apiCoffeeMachine.model.CoffeeOrder;
import ru.sbrf.coffee.impl.CoffeeMachineVitek;
import ru.sbrf.coffee.model.CupOfCoffee;
import ru.sbrf.coffee.model.Order;

@RestController
@RequestMapping("/coffeeMachine")
public class Controller {

    @Autowired
    CoffeeMachineVitek coffeeMachine;

    @PostMapping("/makeCoffee")
    public CupOfCoffee makeCoffee(@RequestBody CoffeeOrder coffeeOrder){
        Order newOrder = Order.builder().typeOfCoffee(coffeeOrder.getTypeOfCoffee()).
                volumeOfCup(coffeeOrder.getVolumeOfCup()).build();
        return coffeeMachine.makeCoffee(newOrder);
    }

    @GetMapping("/addWater")
    public String addWater() {
        coffeeMachine.addWater();
        return "Ok";
    }
    @GetMapping("/addCoffeeBeans")
    public int addCoffeeBeans(){
        coffeeMachine.addCoffeeBeans();
        return coffeeMachine.getAmountOfCoffeeBeans();
    }


//         coffeeMachine.addCoffeeBeans();
//        coffeeMachine.getAmountOfCoffeeBeans()
//        coffeeMachine.addAllIngredients();
//        coffeeMachine.getAmountOfWater();
//        coffeeMachine.getCleanCounter();
//        coffeeMachine.clean();

}
