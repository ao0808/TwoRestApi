package ru.sbrf.apiBaristaTest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import ru.sbrf.apiBarista.Application;
import ru.sbrf.apiBarista.model.Dto;


import java.util.Objects;

import static ru.sbrf.coffee.listingOfOrderParameters.TypeOfCoffee.CAPPUCCINO;
import static ru.sbrf.coffee.listingOfOrderParameters.VolumeOfCup.GRANDE;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class, webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class ApiBaristaRestTest extends Assert {

    @Autowired
    private TestRestTemplate restTemplate;
    private static final String API_ROOT
            = "http://localhost:8080/api/barista";

    @Test
    public void CoffeeTest() {
        Dto dto = Dto.builder().typeOfCoffee(CAPPUCCINO).volumeOfCup(GRANDE).build();
        ResponseEntity<?>response = restTemplate.postForEntity(API_ROOT + "/getCoffee", dto, Object.class);
        Assertions.assertEquals(HttpStatus.OK, response.getStatusCode());
        Assertions.assertEquals("{volumeOfCup=GRANDE, typeOfCoffee=CAPPUCCINO}", Objects.requireNonNull(response.getBody()).toString());
    }

    @Test
    public void addWaterTest() {
        Dto dto = Dto.builder().typeOfCoffee(CAPPUCCINO).volumeOfCup(GRANDE).build();
        ResponseEntity<?>response = restTemplate.getForEntity(API_ROOT + "/addWater", String.class);
        Assertions.assertEquals(HttpStatus.OK, response.getStatusCode());
        Assertions.assertEquals("Water add in CoffeeMachine", Objects.requireNonNull(response.getBody()).toString());
    }
    @Test
    public void addCoffeeBeans() {
        Dto dto = Dto.builder().typeOfCoffee(CAPPUCCINO).volumeOfCup(GRANDE).build();
        ResponseEntity<?>response = restTemplate.getForEntity(API_ROOT + "/addCoffeeBeans", String.class);
        Assertions.assertEquals(HttpStatus.OK, response.getStatusCode());
        Assertions.assertEquals("Теперь в кофемашине 500 гр. зерна", Objects.requireNonNull(response.getBody()).toString());
    }
}


