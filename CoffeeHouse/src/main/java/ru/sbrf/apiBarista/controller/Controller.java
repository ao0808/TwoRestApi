package ru.sbrf.apiBarista.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import ru.sbrf.apiBarista.model.Dto;

import java.util.Objects;

@RestController
@RequestMapping("/api/barista")
public class Controller {
    final private RestTemplate restTemplate = new RestTemplate();
    @Value("${URL}")
    public String appURL;

    @PostMapping("/getCoffee")
    public ResponseEntity<?> makeCoffee(@RequestBody Dto dto){
        ResponseEntity<?> response = restTemplate.postForEntity(appURL + "/makeCoffee", dto, Object.class);
        return ResponseEntity.ok(response.getBody());
    }

    @GetMapping("/addWater")
    public String addWater(){
        ResponseEntity<?> response = restTemplate.getForEntity(appURL + "/addWater",String.class);
        return "Water add in CoffeeMachine";
    }

    @GetMapping("/addCoffeeBeans")
    public String addCoffeeBeans(){
        ResponseEntity<?> response = restTemplate.getForEntity(appURL + "/addCoffeeBeans",String.class);
        return "Теперь в кофемашине " + response.getBody().toString() + " гр. зерна";
    }
}
