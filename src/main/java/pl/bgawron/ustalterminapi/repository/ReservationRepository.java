package pl.bgawron.ustalterminapi.repository;

import org.springframework.data.repository.CrudRepository;
import pl.bgawron.ustalterminapi.model.Reservation;

public interface ReservationRepository extends CrudRepository<Reservation, Long> {
}
