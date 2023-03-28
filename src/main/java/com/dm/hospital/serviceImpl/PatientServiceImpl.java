package com.dm.hospital.serviceImpl;

import com.dm.hospital.entity.PatientEntity;
import com.dm.hospital.mapper.PatientMapper;
import com.dm.hospital.model.BaseResponse;
import com.dm.hospital.model.Patient;
import com.dm.hospital.repository.PatientRepository;
import com.dm.hospital.service.PatientService;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    private PatientRepository patientRepository;

    private PatientMapper mapper = Mappers.getMapper(PatientMapper.class);

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
        Patient patientData = mapper.patientEntityToPatientDTO(patient);
        System.out.println(patientData);
        return new BaseResponse<Patient>(patientData);
    }

}
