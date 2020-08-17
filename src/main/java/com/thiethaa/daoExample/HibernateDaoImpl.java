package com.thiethaa.daoExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Repository;

@Repository
@Profile({"hibernate","default"})
@PropertySource("hibernate.properties")
public class HibernateDaoImpl implements DAO{
    private DataSource dataSource;

    @Autowired
    public HibernateDaoImpl(DataSource dataSource) {
        this.dataSource=dataSource;
        hello();
        System.out.println(this.toString());
    }

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void hello() {
        System.out.println("hibernateDaoImpl...");
    }

    @Override
    public String toString() {
        return "\t\t--Hibernate Configuration :-- "+ dataSource;
    }
}
