package com.vsowmya.microservices.dbAliasService.dbaliasservice.bean;

public class DbAliasConfiguration {
    private String aliasName;

    private String connectionUrl;

    protected DbAliasConfiguration() {}
    public DbAliasConfiguration(String aliasName, String connectionUrl) {
        super();
        this.aliasName = aliasName;
        this.connectionUrl = connectionUrl;
    }

    public String getAliasName() {
        return aliasName;
    }

    public void setAliasName(String aliasName) {
        this.aliasName = aliasName;
    }

    public String getConnectionUrl() {
        return connectionUrl;
    }

    public void setConnectionUrl(String connectionUrl) {
        this.connectionUrl = connectionUrl;
    }


}
