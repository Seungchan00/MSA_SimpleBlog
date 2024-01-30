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
public class PostEdited extends AbstractEvent {

    private Long id;
    private String title;
    private String content;
<<<<<<< HEAD
    private List<Long> commentList;
=======
>>>>>>> origin/master
    private String nickname;
}
