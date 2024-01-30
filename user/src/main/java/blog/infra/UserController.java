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
// @RequestMapping(value="/users")
@Transactional
public class UserController {

    @Autowired
    UserRepository userRepository;
}
//>>> Clean Arch / Inbound Adaptor
=======
import lombok.RequiredArgsConstructor;

import javax.transaction.Transactional;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@Transactional
@RequiredArgsConstructor
public class UserController {
    
    private final UserRepository userRepository;
        
    @PostMapping("/users/register")
    public ResponseEntity<User> register(@RequestBody UserCreated userCreated){

        //객체 생성
        User user = new User();
        //객체 생성 후 해당 패스워드는 암호화된 아이디로 저장
        user.register(userCreated);

        userRepository.save(user);
        return ResponseEntity.ok(user);
    }
        
}
>>>>>>> origin/master
