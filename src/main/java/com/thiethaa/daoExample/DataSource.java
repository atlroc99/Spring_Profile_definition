package com.thiethaa.daoExample;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DataSource {
    @Value("${dbProps.driverName}")
    private String driverName;
    @Value("${dbProps.url}")
    private String url;
    @Value("${dbProps.username}")
    private String username;
    @Value("${dbProps.password}")
    private String password;

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "\nDataSource: " +
                "\n\tdriverName='" + driverName + '\'' +
                "\n\turl='" + url + '\'' +
                "\n\tusername='" + username + '\'' +
                "\n\tpassword='" + password;
    }
}
