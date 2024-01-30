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
import java.util.*;
import lombok.*;

@Data
@EqualsAndHashCode(callSuper=false)
>>>>>>> origin/master
@ToString
public class PostCreated extends AbstractEvent {

    private Long id;
    private String title;
    private String content;
    private List<Long> commentList;
    private String nickname;
    private Long userId;

    public PostCreated(Post aggregate) {
        super(aggregate);
    }

    public PostCreated() {
        super();
    }
}
//>>> DDD / Domain Event
