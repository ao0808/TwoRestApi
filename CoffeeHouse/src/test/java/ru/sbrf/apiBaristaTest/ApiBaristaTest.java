package ru.sbrf.apiBaristaTest;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.Assert;
import org.springframework.web.client.RestTemplate;
import ru.sbrf.apiBarista.model.Dto;

import java.util.Objects;

import static org.junit.Assert.assertEquals;
import static ru.sbrf.coffee.listingOfOrderParameters.TypeOfCoffee.CAPPUCCINO;
import static ru.sbrf.coffee.listingOfOrderParameters.VolumeOfCup.GRANDE;

public class ApiBaristaTest extends Assert {
    private static final String API_ROOT
            = "http://localhost:8080/api/barista";
    final private RestTemplate restTemplate = new RestTemplate();

    @Ignore
    @Test
    public void getCoffeeTest() {
        Dto dto = Dto.builder().typeOfCoffee(CAPPUCCINO).volumeOfCup(GRANDE).build();
        Response response = RestAssured.given()
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .body(dto)
                .post(API_ROOT + "/getCoffee");

        response.prettyPrint();
        assertEquals(HttpStatus.OK.value(), response.getStatusCode());
    }

    @Ignore
    @Test
    public void addWaterTest() {
        Response response = RestAssured.get(API_ROOT + "/addWater");
        System.out.println(response.prettyPrint());
        assertEquals(HttpStatus.OK.value(), response.getStatusCode());
        assertEquals("Water add in CoffeeMachine", response.prettyPrint().toString());
    }

    @Ignore
    @Test
    public void addWaterOneTest() {
        ResponseEntity<?> response = restTemplate.getForEntity(API_ROOT + "/addWater", String.class);
        assertEquals(HttpStatus.OK.value(), response.getStatusCode().value());
        assertEquals("Water add in CoffeeMachine", Objects.requireNonNull(response.getBody()).toString());
    }
}
