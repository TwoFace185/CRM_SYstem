package com.agiklo.oracledatabase.mapper;

import com.agiklo.oracledatabase.entity.Product;
import com.agiklo.oracledatabase.entity.ProductUnits;
import com.agiklo.oracledatabase.entity.dto.ProductUnitsDTO;
import com.agiklo.oracledatabase.entity.dto.ProductUnitsDTO.ProductUnitsDTOBuilder;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-15T11:38:08+0530",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.12 (Ubuntu)"
)
@Component
public class ProductUnitsMapperImpl implements ProductUnitsMapper {

    @Override
    public ProductUnitsDTO mapProductUnitsToDTO(ProductUnits productUnits) {
        if ( productUnits == null ) {
            return null;
        }

        ProductUnitsDTOBuilder productUnitsDTO = ProductUnitsDTO.builder();

        if ( productUnits.getUnitOfMeasure() != null ) {
            productUnitsDTO.unitOfMeasure( productUnits.getUnitOfMeasure().name() );
        }
        productUnitsDTO.productId( productUnitsProductId( productUnits ) );
        productUnitsDTO.productName( productUnitsProductName( productUnits ) );
        productUnitsDTO.id( productUnits.getId() );
        productUnitsDTO.alternativeUnitOfMeasure( productUnits.getAlternativeUnitOfMeasure() );
        productUnitsDTO.conversionFactor( productUnits.getConversionFactor() );

        return productUnitsDTO.build();
    }

    private Long productUnitsProductId(ProductUnits productUnits) {
        if ( productUnits == null ) {
            return null;
        }
        Product product = productUnits.getProduct();
        if ( product == null ) {
            return null;
        }
        Long id = product.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String productUnitsProductName(ProductUnits productUnits) {
        if ( productUnits == null ) {
            return null;
        }
        Product product = productUnits.getProduct();
        if ( product == null ) {
            return null;
        }
        String name = product.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }
}
