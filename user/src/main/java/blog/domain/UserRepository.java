package blog.domain;

<<<<<<< HEAD
import blog.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel="users", path="users")
public interface UserRepository extends PagingAndSortingRepository<User, Long>{
=======
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="users", path="users")
public interface UserRepository extends PagingAndSortingRepository<User, Long>{

    User findByEmail(String email);
>>>>>>> origin/master
}