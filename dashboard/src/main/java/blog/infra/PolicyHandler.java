package blog.infra;

import blog.config.kafka.KafkaProcessor;
<<<<<<< HEAD
import blog.domain.*;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
=======
import javax.transaction.Transactional;
>>>>>>> origin/master
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

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}
}
<<<<<<< HEAD
//>>> Clean Arch / Inbound Adaptor
=======
>>>>>>> origin/master
