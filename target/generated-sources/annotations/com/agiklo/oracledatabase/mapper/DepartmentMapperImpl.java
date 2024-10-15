package com.agiklo.oracledatabase.mapper;

import com.agiklo.oracledatabase.entity.Departments;
import com.agiklo.oracledatabase.entity.Employee;
import com.agiklo.oracledatabase.entity.dto.DepartmentDTO;
import com.agiklo.oracledatabase.entity.dto.DepartmentDTO.DepartmentDTOBuilder;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-15T11:38:08+0530",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.12 (Ubuntu)"
)
@Component
public class DepartmentMapperImpl implements DepartmentMapper {

    @Override
    public DepartmentDTO mapDepartmentToDto(Departments departments) {
        if ( departments == null ) {
            return null;
        }

        DepartmentDTOBuilder departmentDTO = DepartmentDTO.builder();

        departmentDTO.departmentId( departments.getId() );
        departmentDTO.departmentName( departments.getDepartmentName() );
        departmentDTO.managerFirstName( departmentsManagersFirstName( departments ) );
        departmentDTO.managerLastName( departmentsManagersLastName( departments ) );
        departmentDTO.city( departments.getCity() );

        return departmentDTO.build();
    }

    private String departmentsManagersFirstName(Departments departments) {
        if ( departments == null ) {
            return null;
        }
        Employee managers = departments.getManagers();
        if ( managers == null ) {
            return null;
        }
        String firstName = managers.getFirstName();
        if ( firstName == null ) {
            return null;
        }
        return firstName;
    }

    private String departmentsManagersLastName(Departments departments) {
        if ( departments == null ) {
            return null;
        }
        Employee managers = departments.getManagers();
        if ( managers == null ) {
            return null;
        }
        String lastName = managers.getLastName();
        if ( lastName == null ) {
            return null;
        }
        return lastName;
    }
}
