package com.agiklo.oracledatabase.mapper;

import com.agiklo.oracledatabase.entity.Absenteeism;
import com.agiklo.oracledatabase.entity.Departments;
import com.agiklo.oracledatabase.entity.Employee;
import com.agiklo.oracledatabase.entity.ReasonsOfAbsenteeism;
import com.agiklo.oracledatabase.entity.dto.AbsenteeismDTO;
import com.agiklo.oracledatabase.entity.dto.AbsenteeismDTO.AbsenteeismDTOBuilder;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-15T10:28:19+0530",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.12 (Ubuntu)"
)
@Component
public class AbsenteeismMapperImpl implements AbsenteeismMapper {

    @Override
    public AbsenteeismDTO mapAbsenteeismToDto(Absenteeism absenteeism) {
        if ( absenteeism == null ) {
            return null;
        }

        AbsenteeismDTOBuilder absenteeismDTO = AbsenteeismDTO.builder();

        Long id = absenteeismEmployeeId( absenteeism );
        if ( id != null ) {
            absenteeismDTO.employeeId( String.valueOf( id ) );
        }
        absenteeismDTO.firstName( absenteeismEmployeeFirstName( absenteeism ) );
        absenteeismDTO.lastName( absenteeismEmployeeLastName( absenteeism ) );
        absenteeismDTO.departmentName( absenteeismEmployeeDepartmentDepartmentName( absenteeism ) );
        absenteeismDTO.absenteeismName( absenteeismReasonOfAbsenteeismCodeAbsenteeismName( absenteeism ) );
        absenteeismDTO.dateFrom( absenteeism.getDateFrom() );
        absenteeismDTO.dateTo( absenteeism.getDateTo() );

        return absenteeismDTO.build();
    }

    private Long absenteeismEmployeeId(Absenteeism absenteeism) {
        if ( absenteeism == null ) {
            return null;
        }
        Employee employee = absenteeism.getEmployee();
        if ( employee == null ) {
            return null;
        }
        Long id = employee.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String absenteeismEmployeeFirstName(Absenteeism absenteeism) {
        if ( absenteeism == null ) {
            return null;
        }
        Employee employee = absenteeism.getEmployee();
        if ( employee == null ) {
            return null;
        }
        String firstName = employee.getFirstName();
        if ( firstName == null ) {
            return null;
        }
        return firstName;
    }

    private String absenteeismEmployeeLastName(Absenteeism absenteeism) {
        if ( absenteeism == null ) {
            return null;
        }
        Employee employee = absenteeism.getEmployee();
        if ( employee == null ) {
            return null;
        }
        String lastName = employee.getLastName();
        if ( lastName == null ) {
            return null;
        }
        return lastName;
    }

    private String absenteeismEmployeeDepartmentDepartmentName(Absenteeism absenteeism) {
        if ( absenteeism == null ) {
            return null;
        }
        Employee employee = absenteeism.getEmployee();
        if ( employee == null ) {
            return null;
        }
        Departments department = employee.getDepartment();
        if ( department == null ) {
            return null;
        }
        String departmentName = department.getDepartmentName();
        if ( departmentName == null ) {
            return null;
        }
        return departmentName;
    }

    private String absenteeismReasonOfAbsenteeismCodeAbsenteeismName(Absenteeism absenteeism) {
        if ( absenteeism == null ) {
            return null;
        }
        ReasonsOfAbsenteeism reasonOfAbsenteeismCode = absenteeism.getReasonOfAbsenteeismCode();
        if ( reasonOfAbsenteeismCode == null ) {
            return null;
        }
        String absenteeismName = reasonOfAbsenteeismCode.getAbsenteeismName();
        if ( absenteeismName == null ) {
            return null;
        }
        return absenteeismName;
    }
}
