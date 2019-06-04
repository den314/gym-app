package pl.desz.gym.model;

import lombok.Getter;
import lombok.ToString;
import org.springframework.util.StringUtils;

import java.util.Objects;

@Getter
@ToString
public class Location {

    private Address address;
    private String shortDescription;

    public Location(Address address, String shortDescription) {
        Objects.requireNonNull(address);
        if (StringUtils.isEmpty(shortDescription)) {
            throw new IllegalStateException("short description must be provided");
        }
        this.address = address;
        this.shortDescription = shortDescription;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Location) {
            Location other = (Location) obj;
            return address.equals(other.getAddress())
                    && shortDescription.equals(other.getShortDescription());
        }
        return false;
    }

    @Override
    public int hashCode() {
        return 31 * address.hashCode() + shortDescription.hashCode();
    }
}
