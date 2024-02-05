package nl.novi.techiteasy.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/televisions")
@RestController
public class TelevisionsController {
//    GET-request voor alle televisies
    @GetMapping()
    public ResponseEntity<String> getTelevisions(){
        return ResponseEntity.ok("This is the televisions placeholder string");
    }
//    GET-request voor 1 televisie
    @GetMapping("/{id}")
    public ResponseEntity<String> getTelevision(@PathVariable Integer id){
        return ResponseEntity.ok("televisions met id: " + id);
    }
//    POST-request voor 1 televisie
    @PostMapping()
    public ResponseEntity<Void> addTelevision(@RequestBody String television){
        System.out.println(television);
        return ResponseEntity.created(null).build();
    }
//    PUT-request voor 1 televisie
    @PutMapping("/{id}")
    public ResponseEntity<String> updateTelevision(@PathVariable int id, @RequestBody String TelevisionName){
        return ResponseEntity.noContent().build();
    }
//    DELETE-request voor 1 televisie
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTelevision(@PathVariable Long id){
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/api/weather/current/coordinates")
    public String GetWeatherCoordinates(@RequestParam double lat, @RequestParam double lon) {
        return "Regenachtig bij Latitude " + lat + " Longtitude " + lon;
    }
}
