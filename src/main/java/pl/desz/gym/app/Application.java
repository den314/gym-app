package pl.desz.gym.app;

import pl.desz.gym.model.Location;
import pl.desz.gym.model.Pass;
import pl.desz.gym.model.User;
import pl.desz.gym.service.GymService;
import pl.desz.gym.service.GymServiceImpl;
import pl.desz.gym.service.LocationService;
import pl.desz.gym.service.StubLocationService;

public class Application {

    public static void main(String[] args) {
        LocationService locationService = new StubLocationService();
        Location location = locationService.getAll().stream().findFirst().get();

        User user = new User(1L, new Pass(location, Pass.Type.OPEN));
        System.out.println(user);

        GymService gymService = new GymServiceImpl();
        System.out.println("gymService.canEnter(location, user) = " + gymService.canEnter(location, user));
    }
}
