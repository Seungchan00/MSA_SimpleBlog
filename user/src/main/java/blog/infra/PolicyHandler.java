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
    UserRepository userRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}
}
<<<<<<< HEAD
//>>> Clean Arch / Inbound Adaptor
=======
>>>>>>> origin/master
