package com.dm.hospital.serviceImpl;

import com.dm.hospital.entity.PatientEntity;
import com.dm.hospital.model.BaseResponse;
import com.dm.hospital.model.Patient;
import com.dm.hospital.repository.PatientRepository;
import com.dm.hospital.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    private PatientRepository patientRepository;


    @Override
    public BaseResponse<Patient> fetchPatient(int id) {

        if (id == 0) {
            return new BaseResponse<Patient>("InvalidPatientId");
        }
        Optional<PatientEntity> patientDetails = patientRepository.findById(id);
        if (!patientDetails.isPresent()) {
            return new BaseResponse<Patient>("PatientNotFound");
        }
        PatientEntity patient = patientDetails.get();
        Patient patientData = new Patient(patient.getFName(), patient.getLName());
        return new BaseResponse<Patient>(patientData);
    }

}
