package com.agiklo.oracledatabase.mapper;

import com.agiklo.oracledatabase.entity.Customers;
import com.agiklo.oracledatabase.entity.dto.CustomerDTO;
import com.agiklo.oracledatabase.entity.dto.CustomerDTO.CustomerDTOBuilder;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-15T10:28:19+0530",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.12 (Ubuntu)"
)
@Component
public class CustomerMapperImpl implements CustomerMapper {

    @Override
    public CustomerDTO mapCustomersToDto(Customers customers) {
        if ( customers == null ) {
            return null;
        }

        CustomerDTOBuilder customerDTO = CustomerDTO.builder();

        customerDTO.firstname( customers.getFirstname() );
        customerDTO.lastname( customers.getLastname() );
        customerDTO.zipCode( customers.getZipCode() );
        customerDTO.city( customers.getCity() );

        return customerDTO.build();
    }

    @Override
    public Customers mapCustomerDTOtoCustomers(CustomerDTO customerDTO) {
        if ( customerDTO == null ) {
            return null;
        }

        Customers customers = new Customers();

        customers.setFirstname( customerDTO.getFirstname() );
        customers.setLastname( customerDTO.getLastname() );
        customers.setZipCode( customerDTO.getZipCode() );
        customers.setCity( customerDTO.getCity() );

        return customers;
    }
}
