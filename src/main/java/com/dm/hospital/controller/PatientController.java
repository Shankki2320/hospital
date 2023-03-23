package com.dm.hospital.controller;

import com.dm.hospital.model.BaseResponse;
import com.dm.hospital.model.Patient;
import com.dm.hospital.service.PatientService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@AllArgsConstructor
@RestController
public class PatientController {

    //TODO: EntityMapper on ServiceImpl
    //TODO: configure H2
    //TODO: Create docker image
    //TODO: Spring Security - Basic SSO

    private PatientService patientService;

    @GetMapping("patient/{id}")
    public BaseResponse<Patient> fetchPatient(@PathVariable int id){
        log.info("Inside controller PatientCont");
        return patientService.fetchPatient(id);
    }

/*
    @PostMapping("patient")
    public Boolean registerPatient(@RequestBody Patient patient){
        patientService.registerPatient(patient);
    }


    @PutMapping("patient")
    public Boolean updatePatientDetails(@RequestBody Patient patient){
        patientService.updatePatientDetails(patient);
    }


    public List<Patient> fetchPatients(){
        log.info("Inside controller PatientCont");
        patientService.fetchPatients();
    }
*/


}
