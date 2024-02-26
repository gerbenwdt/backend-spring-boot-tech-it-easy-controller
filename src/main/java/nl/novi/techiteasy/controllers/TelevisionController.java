package nl.novi.techiteasy.controllers;

import jakarta.validation.Valid;
import nl.novi.techiteasy.dtos.RequestTelevisionDto;
import nl.novi.techiteasy.models.Television;
import nl.novi.techiteasy.services.TelevisionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/televisions")
@RestController
public class TelevisionController {
    private final TelevisionService televisionService;

    public TelevisionController(TelevisionService televisionService) {
        this.televisionService = televisionService;
    }

    //    GET-request voor alle televisies
    @GetMapping()
    public ResponseEntity<List<Television>> getTelevisions(){
        List<Television> televisions = televisionService.getTelevisions();
        return ResponseEntity.ok(televisions);
    }
//    GET-request voor 1 televisie
    @GetMapping("/{id}")
    public ResponseEntity<Television> getTelevision(@PathVariable Long id){
        Television television = televisionService.getTelevision(id);
        return ResponseEntity.ok(television);
    }
//    POST-request voor 1 televisie
    @PostMapping()
    public ResponseEntity<Void> addTelevision(@Valid @RequestBody RequestTelevisionDto television){
        televisionService.addTelevision(television);
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

}
