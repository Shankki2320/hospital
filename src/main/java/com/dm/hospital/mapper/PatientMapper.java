package com.dm.hospital.mapper;

import com.dm.hospital.entity.PatientEntity;
import com.dm.hospital.model.Patient;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface PatientMapper {

    @Mapping(source = "fName", target = "firstName")
    @Mapping(source = "lName", target = "lastName")
    Patient patientEntityToPatientDTO(PatientEntity patientEntity);

    @Mapping(source = "firstName", target = "fName")
    @Mapping(source = "lastName", target = "lName")
    PatientEntity patientDTOToPatientEntity(Patient patient);


}
