package blog.domain;

import blog.infra.AbstractEvent;
<<<<<<< HEAD
import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
=======
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
>>>>>>> origin/master
public class CommentCreated extends AbstractEvent {

    private Long id;
    private String content;
    private Long postId;
    private String nickname;
    private Long userId;
<<<<<<< HEAD
}
=======
}
>>>>>>> origin/master
