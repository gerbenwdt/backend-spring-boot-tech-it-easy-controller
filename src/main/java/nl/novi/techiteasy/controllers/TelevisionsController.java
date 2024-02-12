package nl.novi.techiteasy.controllers;

import nl.novi.techiteasy.models.Television;
import nl.novi.techiteasy.repositories.TelevisionRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/televisions")
@RestController
public class TelevisionsController {
    private final TelevisionRepository televisionRepository;

    public TelevisionsController(TelevisionRepository televisionRepository) {
        this.televisionRepository = televisionRepository;
    }

    //    GET-request voor alle televisies
    @GetMapping()
    public ResponseEntity<List<Television>> getTelevisions(){
        List<Television> televisions = televisionRepository.findAll();
        return ResponseEntity.ok(televisions);
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

}
