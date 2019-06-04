package pl.desz.gym.model;

import lombok.Getter;
import lombok.ToString;
import org.springframework.util.StringUtils;

@Getter
@ToString
public class Address {

    private String city;
    private String streetName;

    public Address(String city, String streetName) {
        if (StringUtils.isEmpty(city) || StringUtils.isEmpty(streetName)) {
            throw new IllegalStateException("can't be null or empty");
        }
        this.city = city;
        this.streetName = streetName;
    }
}
