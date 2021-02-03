package pl.bgawron.ustalterminapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.bgawron.ustalterminapi.model.User;

@Repository
public interface UserRepository extends CrudRepository <User, Long> {
}
