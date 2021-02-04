package pl.bgawron.ustalterminapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.bgawron.ustalterminapi.model.OfficialLetter;

@Repository
public interface OfficialLetterRepository extends CrudRepository <OfficialLetter, Long> {
}
