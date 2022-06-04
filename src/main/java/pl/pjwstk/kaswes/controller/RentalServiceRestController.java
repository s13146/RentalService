package pl.pjwstk.kaswes.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.pjwstk.kaswes.model.Movie;
import pl.pjwstk.kaswes.service.RentalService;

@RestController
@RequestMapping("/movie")
public class RentalServiceRestController {
    private RentalService rentalService;

    public RentalServiceRestController (RentalService rentalService) {
      this.rentalService=rentalService;
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Movie> getMovie(@PathVariable Long id){
        return  ResponseEntity.ok(rentalService.getMovie(id));
    }
}
