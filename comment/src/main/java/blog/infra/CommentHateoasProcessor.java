package blog.infra;

import blog.domain.*;
import org.springframework.hateoas.EntityModel;
<<<<<<< HEAD
import org.springframework.hateoas.Link;
=======
>>>>>>> origin/master
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class CommentHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Comment>> {

    @Override
    public EntityModel<Comment> process(EntityModel<Comment> model) {
        return model;
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> origin/master
