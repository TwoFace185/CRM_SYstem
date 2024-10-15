package com.agiklo.oracledatabase.configuration;

import com.zaxxer.hikari.HikariDataSource;
import org.flywaydb.core.Flyway;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class PostgresDatasource {

//    @Bean
//    @ConfigurationProperties("spring.datasource")
//    public HikariDataSource hikariDataSource() {
//        return DataSourceBuilder
//                .create()
//                .type(HikariDataSource.class)
//                .build();
//    }
@Bean
public Flyway flyway(DataSource dataSource) {
    // Configure Flyway with the data source
    Flyway flyway = Flyway.configure()
            .dataSource(dataSource)
//            .locations("classpath:DDL_DML_SCRIPTS")  // Default migration script location
            .locations("classpath:db/migration")
            .baselineOnMigrate(true)  // Ensures migrations run if there is an existing schema
            .load();

    // Start the migration
    flyway.clean();
    flyway.migrate();

    return flyway;
}
}
