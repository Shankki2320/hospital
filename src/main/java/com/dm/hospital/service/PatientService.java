package com.dm.hospital.service;

import com.dm.hospital.model.BaseResponse;
import com.dm.hospital.model.Patient;
import org.springframework.stereotype.Component;

@Component
public interface PatientService {

    BaseResponse<Patient> fetchPatient(int patientId);

}
