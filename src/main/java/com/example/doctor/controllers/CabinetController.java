package com.example.doctor.controllers;

import com.example.doctor.models.Cabinet;
 import com.example.doctor.services.CabinetService;
 import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/cabinet")
public class CabinetController {
    @Autowired
    CabinetService cabinetService;

    @GetMapping("")
    public List<Cabinet> list() {
        return cabinetService.listAllCabinet();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cabinet> get(@PathVariable Integer id) {
        try {
            Cabinet cabinet = cabinetService.getCabinet(id);
            return new ResponseEntity<Cabinet>(cabinet, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Cabinet>(HttpStatus.NOT_FOUND);
        }
    }
    @PostMapping("/")
    public void add(@RequestBody Cabinet cabinet ) {
        cabinetService.saveCabinet(cabinet);
    }
    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody Cabinet cabinet, @PathVariable Integer id) {
        try {
            cabinet.setId(id);
            cabinetService.saveCabinet(cabinet);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {

        cabinetService.deleteCabinet(id);
    }

}
