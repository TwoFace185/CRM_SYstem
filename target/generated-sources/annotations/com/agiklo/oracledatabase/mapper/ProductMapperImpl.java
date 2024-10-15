package com.agiklo.oracledatabase.mapper;

import com.agiklo.oracledatabase.entity.Product;
import com.agiklo.oracledatabase.entity.ProductType;
import com.agiklo.oracledatabase.entity.dto.ProductDTO;
import com.agiklo.oracledatabase.entity.dto.ProductDTO.ProductDTOBuilder;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-15T10:28:19+0530",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.12 (Ubuntu)"
)
@Component
public class ProductMapperImpl implements ProductMapper {

    @Override
    public ProductDTO mapProductToDto(Product product) {
        if ( product == null ) {
            return null;
        }

        ProductDTOBuilder productDTO = ProductDTO.builder();

        productDTO.productType( productProductTypeFullName( product ) );
        productDTO.id( product.getId() );
        productDTO.name( product.getName() );
        productDTO.sellingPrice( product.getSellingPrice() );
        productDTO.purchasePrice( product.getPurchasePrice() );
        productDTO.taxRate( product.getTaxRate() );

        return productDTO.build();
    }

    private String productProductTypeFullName(Product product) {
        if ( product == null ) {
            return null;
        }
        ProductType productType = product.getProductType();
        if ( productType == null ) {
            return null;
        }
        String fullName = productType.getFullName();
        if ( fullName == null ) {
            return null;
        }
        return fullName;
    }
}
