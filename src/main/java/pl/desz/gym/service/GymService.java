package pl.desz.gym.service;

import pl.desz.gym.model.Location;
import pl.desz.gym.model.User;

public interface GymService {

    boolean canEnter(Location location, User user);
}
