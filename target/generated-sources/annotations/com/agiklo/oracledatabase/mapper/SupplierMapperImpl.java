package com.agiklo.oracledatabase.mapper;

import com.agiklo.oracledatabase.entity.Supplier;
import com.agiklo.oracledatabase.entity.TypesOfTransport;
import com.agiklo.oracledatabase.entity.dto.SupplierDTO;
import com.agiklo.oracledatabase.entity.dto.SupplierDTO.SupplierDTOBuilder;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-15T11:38:08+0530",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.12 (Ubuntu)"
)
@Component
public class SupplierMapperImpl implements SupplierMapper {

    @Override
    public SupplierDTO mapSupplierToDTO(Supplier supplier) {
        if ( supplier == null ) {
            return null;
        }

        SupplierDTOBuilder supplierDTO = SupplierDTO.builder();

        supplierDTO.typeOfTransport( supplierModeOfTransportCodeFullName( supplier ) );
        supplierDTO.supplierId( supplier.getSupplierId() );
        supplierDTO.supplierName( supplier.getSupplierName() );
        supplierDTO.activityStatus( supplier.getActivityStatus() );

        return supplierDTO.build();
    }

    private String supplierModeOfTransportCodeFullName(Supplier supplier) {
        if ( supplier == null ) {
            return null;
        }
        TypesOfTransport modeOfTransportCode = supplier.getModeOfTransportCode();
        if ( modeOfTransportCode == null ) {
            return null;
        }
        String fullName = modeOfTransportCode.getFullName();
        if ( fullName == null ) {
            return null;
        }
        return fullName;
    }
}
