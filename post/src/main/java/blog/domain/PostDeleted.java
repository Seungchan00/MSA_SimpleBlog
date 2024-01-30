package blog.domain;

<<<<<<< HEAD
import blog.domain.*;
import blog.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
=======
import blog.infra.AbstractEvent;
>>>>>>> origin/master
import lombok.*;

//<<< DDD / Domain Event
@Data
<<<<<<< HEAD
=======
@EqualsAndHashCode(callSuper=false)
>>>>>>> origin/master
@ToString
public class PostDeleted extends AbstractEvent {

    private Long id;
    private String title;
    private String content;
    private String nickname;
    private Long userId;

    public PostDeleted(Post aggregate) {
        super(aggregate);
    }

    public PostDeleted() {
        super();
    }
}
<<<<<<< HEAD
//>>> DDD / Domain Event
=======
//>>> DDD / Domain Event
>>>>>>> origin/master
