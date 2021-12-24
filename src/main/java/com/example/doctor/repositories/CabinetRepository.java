package com.example.doctor.repositories;

import com.example.doctor.models.Cabinet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CabinetRepository extends JpaRepository<Cabinet, Integer> {
}
