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
public class UserHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<User>> {

    @Override
    public EntityModel<User> process(EntityModel<User> model) {
        return model;
    }
}
