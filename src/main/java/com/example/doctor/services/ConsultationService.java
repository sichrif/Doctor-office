package com.example.doctor.services;

import com.example.doctor.models.Consultation;
import com.example.doctor.repositories.ConsultationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ConsultationService {
    @Autowired
    private ConsultationRepository consultationRepository;
    public List<Consultation> listAllConsultation() {
        return consultationRepository.findAll();
    }

    public void saveConsultation(Consultation consultation) {
        consultationRepository.save(consultation);
    }

    public Consultation getConsultation(Integer id) {
        return consultationRepository.findById(id).get();
    }

    public void deleteConsultation(Integer id) {
        consultationRepository.deleteById(id);
    }
}

