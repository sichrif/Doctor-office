package com.example.doctor.controllers;

import com.example.doctor.models.Consultation;
import com.example.doctor.services.ConsultationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/consultations")
public class ConsultationController {
    @Autowired
    ConsultationService consultationService;

    @GetMapping("")
    public List<Consultation> list() {
        return consultationService.listAllConsultation();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Consultation> get(@PathVariable Integer id) {
        try {
            Consultation consultation = consultationService.getConsultation(id);
            return new ResponseEntity<Consultation>(consultation, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Consultation>(HttpStatus.NOT_FOUND);
        }
    }
    @PostMapping("/")
    public void add(@RequestBody Consultation consultation) {
        consultationService.saveConsultation(consultation);
    }
    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody Consultation consultation, @PathVariable Integer id) {
        try {
            Consultation existConsultation =  consultationService.getConsultation(id);
            consultation.setId(id);
            consultationService.saveConsultation(consultation);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {

        consultationService.deleteConsultation(id);
    }
}
