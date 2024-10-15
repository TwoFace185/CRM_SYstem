package com.agiklo.oracledatabase.mapper;

import com.agiklo.oracledatabase.entity.Customers;
import com.agiklo.oracledatabase.entity.Product;
import com.agiklo.oracledatabase.entity.Purchases;
import com.agiklo.oracledatabase.entity.PurchasesPositions;
import com.agiklo.oracledatabase.entity.dto.PurchasesPositionsDTO;
import com.agiklo.oracledatabase.entity.dto.PurchasesPositionsDTO.PurchasesPositionsDTOBuilder;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-15T10:28:19+0530",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.12 (Ubuntu)"
)
@Component
public class PurchasesPositionsMapperImpl implements PurchasesPositionsMapper {

    @Override
    public PurchasesPositionsDTO mapPurchasesPositionsToDTO(PurchasesPositions purchasesPositions) {
        if ( purchasesPositions == null ) {
            return null;
        }

        PurchasesPositionsDTOBuilder purchasesPositionsDTO = PurchasesPositionsDTO.builder();

        purchasesPositionsDTO.productId( purchasesPositionsProductId( purchasesPositions ) );
        purchasesPositionsDTO.productName( purchasesPositionsProductName( purchasesPositions ) );
        purchasesPositionsDTO.purchaseId( purchasesPositionsPurchasesId( purchasesPositions ) );
        purchasesPositionsDTO.customerId( purchasesPositionsPurchasesCustomerId( purchasesPositions ) );
        Date purchaseDate = purchasesPositionsPurchasesPurchaseDate( purchasesPositions );
        if ( purchaseDate != null ) {
            purchasesPositionsDTO.purchaseDate( new SimpleDateFormat().format( purchaseDate ) );
        }
        Double sellingPrice = purchasesPositionsProductSellingPrice( purchasesPositions );
        if ( sellingPrice != null ) {
            purchasesPositionsDTO.sellingPrice( String.valueOf( sellingPrice ) );
        }
        purchasesPositionsDTO.id( purchasesPositions.getId() );
        purchasesPositionsDTO.amount( purchasesPositions.getAmount() );
        purchasesPositionsDTO.reclamationExist( purchasesPositions.getReclamationExist() );

        return purchasesPositionsDTO.build();
    }

    private Long purchasesPositionsProductId(PurchasesPositions purchasesPositions) {
        if ( purchasesPositions == null ) {
            return null;
        }
        Product product = purchasesPositions.getProduct();
        if ( product == null ) {
            return null;
        }
        Long id = product.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String purchasesPositionsProductName(PurchasesPositions purchasesPositions) {
        if ( purchasesPositions == null ) {
            return null;
        }
        Product product = purchasesPositions.getProduct();
        if ( product == null ) {
            return null;
        }
        String name = product.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }

    private Long purchasesPositionsPurchasesId(PurchasesPositions purchasesPositions) {
        if ( purchasesPositions == null ) {
            return null;
        }
        Purchases purchases = purchasesPositions.getPurchases();
        if ( purchases == null ) {
            return null;
        }
        Long id = purchases.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long purchasesPositionsPurchasesCustomerId(PurchasesPositions purchasesPositions) {
        if ( purchasesPositions == null ) {
            return null;
        }
        Purchases purchases = purchasesPositions.getPurchases();
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

    private Date purchasesPositionsPurchasesPurchaseDate(PurchasesPositions purchasesPositions) {
        if ( purchasesPositions == null ) {
            return null;
        }
        Purchases purchases = purchasesPositions.getPurchases();
        if ( purchases == null ) {
            return null;
        }
        Date purchaseDate = purchases.getPurchaseDate();
        if ( purchaseDate == null ) {
            return null;
        }
        return purchaseDate;
    }

    private Double purchasesPositionsProductSellingPrice(PurchasesPositions purchasesPositions) {
        if ( purchasesPositions == null ) {
            return null;
        }
        Product product = purchasesPositions.getProduct();
        if ( product == null ) {
            return null;
        }
        Double sellingPrice = product.getSellingPrice();
        if ( sellingPrice == null ) {
            return null;
        }
        return sellingPrice;
    }
}
