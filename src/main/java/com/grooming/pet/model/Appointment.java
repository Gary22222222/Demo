package com.grooming.pet.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int status;//0-new 1-filled 2-canceled
    @ManyToOne
    @JoinColumn(name = "id")
    private PetType petType;
    @ManyToOne
    @JoinColumn(name = "id")
    private PetSize petSize;
    private String groomer;
    private LocalDate appointmentDate;
    private LocalTime appointmentTime;
    private int userId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public PetSize getPetSize() {
        return petSize;
    }

    public void setPetSize(PetSize petSize) {
        this.petSize = petSize;
    }

    public String getGroomer() {
        return groomer;
    }

    public void setGroomer(String groomer) {
        this.groomer = groomer;
    }

    public LocalDate getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(LocalDate appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public LocalTime getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(LocalTime appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Appointment(int id, int status, PetType petType,
                       PetSize petSize, String groomer,
                       LocalDate appointmentDate,
                       LocalTime appointmentTime, int userId) {
        this.id = id;
        this.status = status;
        this.petType = petType;
        this.petSize = petSize;
        this.groomer = groomer;
        this.appointmentDate = appointmentDate;
        this.appointmentTime = appointmentTime;
        this.userId = userId;
    }

    public Appointment(int id, int status) {
        this.id = id;
        this.status = status;
    }

    public Appointment(int id) {
        this.id = id;
    }



    public Appointment() {
    }

}
