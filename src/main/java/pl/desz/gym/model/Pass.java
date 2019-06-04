package pl.desz.gym.model;

import lombok.Getter;
import lombok.ToString;
import pl.desz.gym.utils.InstantUtils;

import java.time.Instant;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;

@Getter
@ToString
public class Pass {

    private State state;

    private Type type;
    private Location location;
    private Instant activationDateTime;
    private Instant expirationDateTime;

    public Pass(Location location, Type type) {
        this(location, type, State.ACTIVE);
    }

    public Pass(Location location, Type type, State state) {
        this.location = location;
        if (state == State.ACTIVE) {
            activatePass(state);
        }
        this.type = type;
    }

    private void activatePass(State state) {
        activationDateTime = Instant.now();
        expirationDateTime = InstantUtils.add(Instant.now(), 1, ChronoUnit.MONTHS);
        this.state = state;
    }

    public enum State {
        ACTIVE,
        EXPIRED
    }

    public enum Type {
        OPEN,
        HALF_OPEN,
        ONE_TIME,
        NULL
    }
}
