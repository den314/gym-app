package pl.desz.gym.service;

import pl.desz.gym.model.Address;
import pl.desz.gym.model.Location;

import java.util.Collection;
import java.util.HashSet;
import java.util.stream.Collectors;

public class StubLocationService implements LocationService {

    private Collection<Location> locations = new HashSet<>();
    {
        locations.add(new Location(new Address("Katowice", "Jabłoniowa"), "Katowice Szare Lasy"));
        locations.add(new Location(new Address("Katowice", "Zielona"), "Katowice Czarny Staw"));
        locations.add(new Location(new Address("Katowice", "Miarki"), "Katowice Miami"));
    }

    @Override
    public Collection<Location> getAll() {
        return locations;
    }

    public Collection<Location> getByCityName(String cityName) {
        return locations.stream()
                .filter(loc -> loc.getAddress().getCity().equals(cityName))
                .collect(Collectors.toList());
    }

    public boolean add(Location location) {
        return locations.add(location);
    }
}
