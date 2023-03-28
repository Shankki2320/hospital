package com.dm.hospital.serviceImpl;

import com.dm.hospital.entity.PatientEntity;
import com.dm.hospital.model.BaseResponse;
import com.dm.hospital.model.Patient;
import com.dm.hospital.repository.PatientRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

@Disabled
@ExtendWith(MockitoExtension.class)
public class PatientServiceImplTest {

    @InjectMocks
    private PatientServiceImpl patientServiceImpl;

    @Mock
    private PatientRepository patientRepository;


    PatientEntity patient=null;

    @BeforeEach
    public void setup() {
        patient.setfName("Shankar");
        patient.setlName("Katkade");
        patient.setId(1);

    }


    @Test
    public void whenPatientIdIsNonZeroThen_returnSuccess() {
        Mockito.when(patientRepository.findById(1)).thenReturn(Optional.ofNullable(patient));
        BaseResponse<Patient> response = patientServiceImpl.fetchPatient(1);
        Assertions.assertNotNull(response);
        Assertions.assertNotEquals("", response.getErrorCode());
        Assertions.assertEquals(patient.getId(), response.getData().getId());
        Assertions.assertEquals(patient.getfName(), response.getData().getFirstName());
        Assertions.assertEquals(patient.getlName(), response.getData().getLastName());
    }



}
