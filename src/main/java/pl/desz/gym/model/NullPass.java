package pl.desz.gym.model;

public final class NullPass extends Pass {

    public static final String NOT_AVAILABLE = "not available";
    private static NullPass INSTANCE;

    private NullPass(Location location, Type type) {
        super(location, type, State.EXPIRED);
    }

    public static NullPass getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new NullPass(new Location(new Address(NOT_AVAILABLE, NOT_AVAILABLE), NOT_AVAILABLE), Type.NULL);
        }
        return INSTANCE;
    }
}
