package pl.desz.gym.utils;

import java.time.Instant;
import java.time.ZoneOffset;
import java.time.temporal.TemporalUnit;

public final class InstantUtils {

    public static Instant add(Instant instant, int amountToAdd, TemporalUnit unit) {
        return instant.atOffset(ZoneOffset.UTC).plus(amountToAdd, unit).toInstant();
    }
}
