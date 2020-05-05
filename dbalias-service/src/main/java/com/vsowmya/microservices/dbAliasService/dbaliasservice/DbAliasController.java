package com.vsowmya.microservices.dbAliasService.dbaliasservice;

import com.vsowmya.microservices.dbAliasService.dbaliasservice.bean.DbAliasConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DbAliasController {

    @Autowired
    private Configuration configuration;

    @GetMapping("/dbalias")
    public DbAliasConfiguration getDbAliasConfiguration() {
        return new DbAliasConfiguration(configuration.getAliasName(), configuration.getConnectionUrl());
    }
}
