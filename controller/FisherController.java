package com.cruddapplication.crud.controller;

import com.cruddapplication.crud.exception.ResourceNotFoundException;
import com.cruddapplication.crud.model.Fisher;
import com.cruddapplication.crud.repository.FisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class FisherController {

    @Autowired
    private FisherRepository fisherRepository;

//    Get all fishers
    @GetMapping("/fishers")
    public List<Fisher> getAllFishers(){
        return fisherRepository.findAll();

    }

    //Create Fisher rest api
    @PostMapping ("/fisher")
    public Fisher createFisher(@RequestBody Fisher fisher) {
        Fisher fish = new Fisher();
        fish.setFirstName(fisher.getLastName());
        return fisherRepository.save(fish);
    }

//    get Fisher by id rest api
    @GetMapping("/fishers/{id}")
    public ResponseEntity<Fisher> getFisherById(@PathVariable Long id){
        Fisher fisher = fisherRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Fisher not exist with id" + id));
        return ResponseEntity.ok(fisher);
    }
//update employee rest api
    @PutMapping("fishers/{id}")
    public ResponseEntity<Fisher> updateFisher(@PathVariable Long id, @RequestBody Fisher fisherDetails){
        Fisher fisher = fisherRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Fisher not exist with id" + id));
        fisher.setFirstName(fisherDetails.getFirstName());
        fisher.setLastName(fisherDetails.getLastName());
        fisher.setEmailId(fisherDetails.getEmailId());
        fisher.setUserName(fisherDetails.getUserName());
        fisher.setPassword(fisherDetails.getPassword());
        fisher.setFisherType(fisherDetails.getFisherType());
        fisher.setPhoneNumber(fisherDetails.getPhoneNumber());
        fisher.setAddress(fisherDetails.getAddress());

        Fisher updatedFisher = fisherRepository.save(fisher);
        return  ResponseEntity.ok(updatedFisher);
    }

//delete fisher rest api
    @DeleteMapping("fishers/{id}")
    public Map<String, Boolean>deleteFisher (@PathVariable Long id){
        Fisher fisher = fisherRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Fisher not exist with id" + id));
        fisherRepository.delete(fisher);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
       return (Map<String, Boolean>) ResponseEntity.ok(response);
    }
}


