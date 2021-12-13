package com.example.retailer.config

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Configuration
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import javax.sql.DataSource

@Configuration
@EnableJpaRepositories(basePackages = ["com.example.retailer.storage"])
class PersistenceConfig {

    @Autowired
    lateinit var dataSource: DataSource

}