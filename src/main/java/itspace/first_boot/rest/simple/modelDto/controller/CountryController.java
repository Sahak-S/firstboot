package itspace.first_boot.rest.simple.modelDto.controller;

import itspace.first_boot.rest.simple.modelDto.Country;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountryController {

    @GetMapping("/italy")
    public Country italy() {
        Country country = Country.of("Italy", 27);
        return country;
    }
    @GetMapping("/france")
    public ResponseEntity<Country> france() {
        Country country = Country.of("France", 67);
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .header("continent","Eroup")
                .header("capital","paris")
                .body(country);
    }

    @GetMapping("/all")
    public List<Country> all() {
        Country country = Country.of("France", 67);
        Country country1 = Country.of("Spain", 577);
        return List.of(country, country1);
    }
}
