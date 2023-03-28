package com.dm.hospital.controller;

import com.dm.hospital.model.BaseResponse;
import com.dm.hospital.model.Patient;
import com.dm.hospital.service.PatientService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class PatientController {

    //TODO: Spring Security - Basic SSO

    @Autowired
    private PatientService patientService;

    @GetMapping(value = "patient/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public BaseResponse<Patient> fetchPatient(@PathVariable int id) {
        return patientService.fetchPatient(id);
    }


}
