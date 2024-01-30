package blog.domain;

<<<<<<< HEAD
import blog.domain.*;
import blog.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
=======
import blog.infra.AbstractEvent;
import lombok.*;

@Data
@EqualsAndHashCode(callSuper=false)
>>>>>>> origin/master
@ToString
public class UserCreated extends AbstractEvent {

    private Long id;
    private String password;
    private String name;
    private String nickname;
    private String email;

    public UserCreated(User aggregate) {
        super(aggregate);
    }

    public UserCreated() {
        super();
    }
}
<<<<<<< HEAD
//>>> DDD / Domain Event
=======
>>>>>>> origin/master
