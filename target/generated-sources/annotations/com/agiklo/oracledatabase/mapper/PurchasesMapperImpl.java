package com.agiklo.oracledatabase.mapper;

import com.agiklo.oracledatabase.entity.Customers;
import com.agiklo.oracledatabase.entity.Purchases;
import com.agiklo.oracledatabase.entity.SellingInvoice;
import com.agiklo.oracledatabase.entity.dto.PurchasesDTO;
import com.agiklo.oracledatabase.entity.dto.PurchasesDTO.PurchasesDTOBuilder;
import com.agiklo.oracledatabase.enums.CURRENCY;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-15T11:38:08+0530",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.12 (Ubuntu)"
)
@Component
public class PurchasesMapperImpl implements PurchasesMapper {

    @Override
    public PurchasesDTO mapPurchasesToDTO(Purchases purchases) {
        if ( purchases == null ) {
            return null;
        }

        PurchasesDTOBuilder purchasesDTO = PurchasesDTO.builder();

        purchasesDTO.customerId( purchasesCustomerId( purchases ) );
        purchasesDTO.customerFirstName( purchasesCustomerFirstname( purchases ) );
        purchasesDTO.customerLastName( purchasesCustomerLastname( purchases ) );
        Long id1 = purchasesInvoiceId( purchases );
        if ( id1 != null ) {
            purchasesDTO.invoiceId( String.valueOf( id1 ) );
        }
        Date invoiceDate = purchasesInvoiceInvoiceDate( purchases );
        if ( invoiceDate != null ) {
            purchasesDTO.invoiceDate( new SimpleDateFormat().format( invoiceDate ) );
        }
        Long id2 = purchasesInvoiceCustomerId( purchases );
        if ( id2 != null ) {
            purchasesDTO.invoiceCustomerId( String.valueOf( id2 ) );
        }
        purchasesDTO.invoiceCustomerFirstName( purchasesInvoiceCustomerFirstname( purchases ) );
        purchasesDTO.invoiceCustomerLastName( purchasesInvoiceCustomerLastname( purchases ) );
        Double netWorth = purchasesInvoiceNetWorth( purchases );
        if ( netWorth != null ) {
            purchasesDTO.invoiceNetWorth( String.valueOf( netWorth ) );
        }
        Double grossValue = purchasesInvoiceGrossValue( purchases );
        if ( grossValue != null ) {
            purchasesDTO.invoiceGrossValue( String.valueOf( grossValue ) );
        }
        CURRENCY currency = purchasesInvoiceCurrency( purchases );
        if ( currency != null ) {
            purchasesDTO.invoiceCurrency( currency.name() );
        }
        purchasesDTO.id( purchases.getId() );
        if ( purchases.getPurchaseDate() != null ) {
            purchasesDTO.purchaseDate( new SimpleDateFormat().format( purchases.getPurchaseDate() ) );
        }

        return purchasesDTO.build();
    }

    private Long purchasesCustomerId(Purchases purchases) {
        if ( purchases == null ) {
            return null;
        }
        Customers customer = purchases.getCustomer();
        if ( customer == null ) {
            return null;
        }
        Long id = customer.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String purchasesCustomerFirstname(Purchases purchases) {
        if ( purchases == null ) {
            return null;
        }
        Customers customer = purchases.getCustomer();
        if ( customer == null ) {
            return null;
        }
        String firstname = customer.getFirstname();
        if ( firstname == null ) {
            return null;
        }
        return firstname;
    }

    private String purchasesCustomerLastname(Purchases purchases) {
        if ( purchases == null ) {
            return null;
        }
        Customers customer = purchases.getCustomer();
        if ( customer == null ) {
            return null;
        }
        String lastname = customer.getLastname();
        if ( lastname == null ) {
            return null;
        }
        return lastname;
    }

    private Long purchasesInvoiceId(Purchases purchases) {
        if ( purchases == null ) {
            return null;
        }
        SellingInvoice invoice = purchases.getInvoice();
        if ( invoice == null ) {
            return null;
        }
        Long id = invoice.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Date purchasesInvoiceInvoiceDate(Purchases purchases) {
        if ( purchases == null ) {
            return null;
        }
        SellingInvoice invoice = purchases.getInvoice();
        if ( invoice == null ) {
            return null;
        }
        Date invoiceDate = invoice.getInvoiceDate();
        if ( invoiceDate == null ) {
            return null;
        }
        return invoiceDate;
    }

    private Long purchasesInvoiceCustomerId(Purchases purchases) {
        if ( purchases == null ) {
            return null;
        }
        SellingInvoice invoice = purchases.getInvoice();
        if ( invoice == null ) {
            return null;
        }
        Customers customer = invoice.getCustomer();
        if ( customer == null ) {
            return null;
        }
        Long id = customer.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String purchasesInvoiceCustomerFirstname(Purchases purchases) {
        if ( purchases == null ) {
            return null;
        }
        SellingInvoice invoice = purchases.getInvoice();
        if ( invoice == null ) {
            return null;
        }
        Customers customer = invoice.getCustomer();
        if ( customer == null ) {
            return null;
        }
        String firstname = customer.getFirstname();
        if ( firstname == null ) {
            return null;
        }
        return firstname;
    }

    private String purchasesInvoiceCustomerLastname(Purchases purchases) {
        if ( purchases == null ) {
            return null;
        }
        SellingInvoice invoice = purchases.getInvoice();
        if ( invoice == null ) {
            return null;
        }
        Customers customer = invoice.getCustomer();
        if ( customer == null ) {
            return null;
        }
        String lastname = customer.getLastname();
        if ( lastname == null ) {
            return null;
        }
        return lastname;
    }

    private Double purchasesInvoiceNetWorth(Purchases purchases) {
        if ( purchases == null ) {
            return null;
        }
        SellingInvoice invoice = purchases.getInvoice();
        if ( invoice == null ) {
            return null;
        }
        Double netWorth = invoice.getNetWorth();
        if ( netWorth == null ) {
            return null;
        }
        return netWorth;
    }

    private Double purchasesInvoiceGrossValue(Purchases purchases) {
        if ( purchases == null ) {
            return null;
        }
        SellingInvoice invoice = purchases.getInvoice();
        if ( invoice == null ) {
            return null;
        }
        Double grossValue = invoice.getGrossValue();
        if ( grossValue == null ) {
            return null;
        }
        return grossValue;
    }

    private CURRENCY purchasesInvoiceCurrency(Purchases purchases) {
        if ( purchases == null ) {
            return null;
        }
        SellingInvoice invoice = purchases.getInvoice();
        if ( invoice == null ) {
            return null;
        }
        CURRENCY currency = invoice.getCurrency();
        if ( currency == null ) {
            return null;
        }
        return currency;
    }
}
