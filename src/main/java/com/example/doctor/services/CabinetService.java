package com.example.doctor.services;

import com.example.doctor.models.Cabinet;
import com.example.doctor.models.Consultation;
import com.example.doctor.repositories.CabinetRepository;
import com.example.doctor.repositories.ConsultationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class CabinetService {
    @Autowired
    private CabinetRepository cabinetRepository;
    public List<Cabinet> listAllCabinet() {
        return cabinetRepository.findAll();
    }

    public void saveCabinet(Cabinet cabinet) {
        cabinetRepository.save(cabinet);
    }

    public Cabinet getCabinet(Integer id) {
        return cabinetRepository.findById(id).get();
    }

    public void deleteCabinet(Integer id) {
        cabinetRepository.deleteById(id);
    }
}
