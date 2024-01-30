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
public class PostEdited extends AbstractEvent {

    private Long id;
    private String title;
    private String content;
    private String nickname;
    private Long userId;

    public PostEdited(Post aggregate) {
        super(aggregate);
    }

    public PostEdited() {
        super();
    }
}
<<<<<<< HEAD
//>>> DDD / Domain Event
=======
>>>>>>> origin/master
