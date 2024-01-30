package blog.domain;

<<<<<<< HEAD
import blog.domain.*;
import blog.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
=======
import blog.infra.AbstractEvent;
import lombok.*;

@Data
@EqualsAndHashCode(callSuper=false)
>>>>>>> origin/master
@ToString
public class PostDeleted extends AbstractEvent {

    private Long id;
    private String title;
    private String content;
    private String nickname;
    private Long userId;
<<<<<<< HEAD
}
=======
}
>>>>>>> origin/master
