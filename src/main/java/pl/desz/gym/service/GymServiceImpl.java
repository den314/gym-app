package pl.desz.gym.service;

import pl.desz.gym.model.Location;
import pl.desz.gym.model.Pass;
import pl.desz.gym.model.User;

public class GymServiceImpl implements GymService {

    @Override
    public boolean canEnter(Location location, User user) {
        return user.getPass().getState() == Pass.State.ACTIVE
                && user.getPass().getLocation().equals(location);
    }
}
