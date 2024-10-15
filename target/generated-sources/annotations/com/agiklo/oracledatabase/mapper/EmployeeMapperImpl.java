package com.agiklo.oracledatabase.mapper;

import com.agiklo.oracledatabase.entity.Departments;
import com.agiklo.oracledatabase.entity.Employee;
import com.agiklo.oracledatabase.entity.dto.EmployeeDTO;
import com.agiklo.oracledatabase.entity.dto.EmployeeDTO.EmployeeDTOBuilder;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-15T11:38:08+0530",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.12 (Ubuntu)"
)
@Component
public class EmployeeMapperImpl implements EmployeeMapper {

    @Override
    public EmployeeDTO mapEmployeeToDto(Employee employee) {
        if ( employee == null ) {
            return null;
        }

        EmployeeDTOBuilder employeeDTO = EmployeeDTO.builder();

        if ( employee.getUserRole() != null ) {
            employeeDTO.role( employee.getUserRole().name() );
        }
        employeeDTO.departmentId( employeeDepartmentId( employee ) );
        employeeDTO.departmentName( employeeDepartmentDepartmentName( employee ) );
        employeeDTO.id( employee.getId() );
        employeeDTO.firstName( employee.getFirstName() );
        employeeDTO.lastName( employee.getLastName() );
        employeeDTO.email( employee.getEmail() );
        employeeDTO.salary( employee.getSalary() );

        return employeeDTO.build();
    }

    private Long employeeDepartmentId(Employee employee) {
        if ( employee == null ) {
            return null;
        }
        Departments department = employee.getDepartment();
        if ( department == null ) {
            return null;
        }
        Long id = department.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String employeeDepartmentDepartmentName(Employee employee) {
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
}
