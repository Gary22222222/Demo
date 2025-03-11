package com.grooming.pet.controller;

import com.grooming.pet.model.Appointment;
import com.grooming.pet.repository.AppointmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class AppointmentController {
    @Autowired
    private AppointmentRepo appointmentRepo;
    @GetMapping("/api/appointments")
    public List<Appointment> getAppointment(){

        return appointmentRepo.findAll();

    }
}
