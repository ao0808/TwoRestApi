package ru.sbrf.apiBarista.model;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.sbrf.coffee.listingOfOrderParameters.TypeOfCoffee;
import ru.sbrf.coffee.listingOfOrderParameters.VolumeOfCup;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Dto {
    private VolumeOfCup volumeOfCup;
    private TypeOfCoffee typeOfCoffee;

    @Override
    public String toString() {
        return "Dto{" +
                "volumeOfCup=" + volumeOfCup +
                ", typeOfCoffee=" + typeOfCoffee +
                '}';
    }
}
