package com.example.doctor.services;

 import com.example.doctor.models.Prescription;
 import com.example.doctor.repositories.PrescriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class PrescriptionService {
    @Autowired
    private PrescriptionRepository prescriptionRepository;
    public List<Prescription> listAllPrescription() {
        return prescriptionRepository.findAll();
    }

    public void savePrescription(Prescription prescription) {
        prescriptionRepository.save(prescription);
    }

    public Prescription getPrescription(Integer id) {
        return prescriptionRepository.findById(id).get();
    }

    public void deletePrescription(Integer id) {
        prescriptionRepository.deleteById(id);
    }

}
