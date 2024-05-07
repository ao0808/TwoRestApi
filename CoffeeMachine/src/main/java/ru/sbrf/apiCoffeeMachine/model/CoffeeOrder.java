package ru.sbrf.apiCoffeeMachine.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.sbrf.coffee.listingOfOrderParameters.TypeOfCoffee;
import ru.sbrf.coffee.listingOfOrderParameters.VolumeOfCup;

public class CoffeeOrder {
    @JsonProperty("volumeOfCup")
    VolumeOfCup volumeOfCup;
    @JsonProperty("typeOfCoffee")
    TypeOfCoffee typeOfCoffee;

    public VolumeOfCup getVolumeOfCup() {
        return volumeOfCup;
    }

    public TypeOfCoffee getTypeOfCoffee() {
        return typeOfCoffee;
    }
}
