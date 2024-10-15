package com.agiklo.oracledatabase.mapper;

import com.agiklo.oracledatabase.entity.Customers;
import com.agiklo.oracledatabase.entity.SellingInvoice;
import com.agiklo.oracledatabase.entity.dto.SellingInvoiceDTO;
import com.agiklo.oracledatabase.entity.dto.SellingInvoiceDTO.SellingInvoiceDTOBuilder;
import java.text.SimpleDateFormat;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-15T11:38:08+0530",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.12 (Ubuntu)"
)
@Component
public class SellingInvoiceMapperImpl implements SellingInvoiceMapper {

    @Override
    public SellingInvoiceDTO mapSellingInvoiceToDTO(SellingInvoice sellingInvoice) {
        if ( sellingInvoice == null ) {
            return null;
        }

        SellingInvoiceDTOBuilder sellingInvoiceDTO = SellingInvoiceDTO.builder();

        sellingInvoiceDTO.customerId( sellingInvoiceCustomerId( sellingInvoice ) );
        sellingInvoiceDTO.customerFirstName( sellingInvoiceCustomerFirstname( sellingInvoice ) );
        sellingInvoiceDTO.customerLastName( sellingInvoiceCustomerLastname( sellingInvoice ) );
        sellingInvoiceDTO.id( sellingInvoice.getId() );
        if ( sellingInvoice.getInvoiceDate() != null ) {
            sellingInvoiceDTO.invoiceDate( new SimpleDateFormat().format( sellingInvoice.getInvoiceDate() ) );
        }
        sellingInvoiceDTO.netWorth( sellingInvoice.getNetWorth() );
        sellingInvoiceDTO.grossValue( sellingInvoice.getGrossValue() );
        sellingInvoiceDTO.taxRate( sellingInvoice.getTaxRate() );
        if ( sellingInvoice.getCurrency() != null ) {
            sellingInvoiceDTO.currency( sellingInvoice.getCurrency().name() );
        }

        return sellingInvoiceDTO.build();
    }

    private Long sellingInvoiceCustomerId(SellingInvoice sellingInvoice) {
        if ( sellingInvoice == null ) {
            return null;
        }
        Customers customer = sellingInvoice.getCustomer();
        if ( customer == null ) {
            return null;
        }
        Long id = customer.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String sellingInvoiceCustomerFirstname(SellingInvoice sellingInvoice) {
        if ( sellingInvoice == null ) {
            return null;
        }
        Customers customer = sellingInvoice.getCustomer();
        if ( customer == null ) {
            return null;
        }
        String firstname = customer.getFirstname();
        if ( firstname == null ) {
            return null;
        }
        return firstname;
    }

    private String sellingInvoiceCustomerLastname(SellingInvoice sellingInvoice) {
        if ( sellingInvoice == null ) {
            return null;
        }
        Customers customer = sellingInvoice.getCustomer();
        if ( customer == null ) {
            return null;
        }
        String lastname = customer.getLastname();
        if ( lastname == null ) {
            return null;
        }
        return lastname;
    }
}
