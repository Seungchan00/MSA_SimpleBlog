package blog.infra;

import blog.config.kafka.KafkaProcessor;
import blog.domain.*;
<<<<<<< HEAD
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import javax.naming.NameParser;
=======
>>>>>>> origin/master
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

<<<<<<< HEAD
//<<< Clean Arch / Inbound Adaptor
=======
>>>>>>> origin/master
@Service
@Transactional
public class PolicyHandler {

    @Autowired
    CommentRepository commentRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='PostDeleted'"
    )
    public void wheneverPostDeleted_DeleteAllComments(
        @Payload PostDeleted postDeleted
    ) {
        PostDeleted event = postDeleted;
        System.out.println(
            "\n\n##### listener DeleteAllComments : " + postDeleted + "\n\n"
        );

<<<<<<< HEAD
        // Sample Logic //
=======
>>>>>>> origin/master
        Comment.deleteAllComments(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='UserUpdated'"
    )
    public void wheneverUserUpdated_UpdateUser(
        @Payload UserUpdated userUpdated
    ) {
        UserUpdated event = userUpdated;
        System.out.println(
            "\n\n##### listener UpdateUser : " + userUpdated + "\n\n"
        );

<<<<<<< HEAD
        // Sample Logic //
        Comment.updateUser(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
=======
        Comment.updateUser(event);
    }
}
>>>>>>> origin/master
