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
public class PostHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Post>> {

    @Override
    public EntityModel<Post> process(EntityModel<Post> model) {
        return model;
    }
}
