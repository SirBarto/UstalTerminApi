package pl.bgawron.ustalterminapi.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.bgawron.ustalterminapi.model.Reservation;
import pl.bgawron.ustalterminapi.service.ReservationService;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ReservationApi {

    private final ReservationService reservationService;

    @Autowired
    public ReservationApi(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @GetMapping("/reservation/all")
    public Iterable<Reservation> getAll() {
        return null;
    }

    @GetMapping("/reservation/{index}")
    public  @ResponseBody
    Optional<Reservation> getReservationById(@PathVariable Long index){
        return null;
    }

    @PostMapping("/reservation")
    public Reservation addReservation(@RequestBody Reservation reservation){
        return null;
    }

    @PutMapping("/reservation")
    public Reservation updateReservation(@RequestBody Reservation reservation) {
        return null;
    }

    @DeleteMapping("/reservation")
    public void deleteReservation(@PathVariable Long index) {

    }


}
