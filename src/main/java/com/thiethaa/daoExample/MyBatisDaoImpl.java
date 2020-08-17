package com.thiethaa.daoExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Repository;

@Repository
@Profile({"mybatis"})
@PropertySource("mybatis.properties")
public class MyBatisDaoImpl implements DAO {
    private DataSource dataSource;

    @Autowired
    public MyBatisDaoImpl(DataSource dataSource) {
        this.dataSource = dataSource;
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
        System.out.println("myBatisDaoImpl...");
    }

    @Override
    public String toString() {
        return "\t\t--MyBatis Configuration:--  " + dataSource;
    }
}
