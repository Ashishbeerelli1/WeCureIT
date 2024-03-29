package com.wecureit.wecureit_service.repository;

import com.wecureit.wecureit_service.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer> {

    @Query("SELECT p FROM Patient p WHERE p.user.id = :userId")
    Patient findByUserId(@Param("userId") int userId);
}
