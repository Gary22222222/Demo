package com.grooming.pet.repository;

import com.grooming.pet.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppointmentRepo extends JpaRepository<Appointment,Integer> {
    public List<Appointment> findAllByStatus(int status);
}
