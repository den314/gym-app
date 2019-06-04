package pl.desz.gym.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.Instant;

@Getter
@ToString
public class User {

    private Long id;
    private Instant createdAt = Instant.now();
    @Setter
    private Pass pass;

    public User(Long id) {
        this(id, NullPass.getInstance());
    }

    public User(Long id, Pass pass) {
        this.id = id;
        this.pass = pass;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof User) {
            User other = (User) obj;
            return id.equals(other.id);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return 31 * id.hashCode();
    }

}
