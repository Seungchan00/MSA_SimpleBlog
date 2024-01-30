package blog.infra;

import blog.domain.*;
<<<<<<< HEAD
import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//<<< Clean Arch / Inbound Adaptor

@RestController
// @RequestMapping(value="/comments")
=======
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;


@RestController
>>>>>>> origin/master
@Transactional
public class CommentController {

    @Autowired
    CommentRepository commentRepository;
<<<<<<< HEAD
}
//>>> Clean Arch / Inbound Adaptor
=======
}
>>>>>>> origin/master
