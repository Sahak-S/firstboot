package itspace.first_boot.rest.simple.modelDto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Country {

    private String name;
    private int population;

    public static Country of(String name, int population) {
        Country country = new Country();
        country.setName(name);
        country.setPopulation(population);
        return country;
    }
}
