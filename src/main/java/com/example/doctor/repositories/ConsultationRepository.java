package com.example.doctor.repositories;

import com.example.doctor.models.Consultation;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ConsultationRepository extends JpaRepository<Consultation, Integer> {
}