package com.hcl.admin.admin_management.config;
import org.hibernate.boot.MetadataBuilder;
import org.hibernate.boot.spi.MetadataBuilderContributor;
import org.hibernate.dialect.function.StandardSQLFunction;
import org.hibernate.type.StandardBasicTypes;
import org.springframework.stereotype.Component;
@Component
public class SqlFunctionsMetadataBuilderContributor implements MetadataBuilderContributor {

        @Override
        public void contribute(MetadataBuilder metadataBuilder) {
          metadataBuilder.applySqlFunction(
              "GROUP_CONCAT",
              new StandardSQLFunction(
                  "GROUP_CONCAT",
                  StandardBasicTypes.STRING
              )
          );
        }

}