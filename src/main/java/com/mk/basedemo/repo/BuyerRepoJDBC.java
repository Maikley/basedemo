package com.mk.basedemo.repo;

import com.mk.basedemo.model.Buyer;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class BuyerRepoJDBC implements BuyerRepo {
    public BuyerRepoJDBC(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    private JdbcTemplate jdbcTemplate;
    @Override
    public Iterable<Buyer> findAll() {
        return jdbcTemplate.query("select id,name from Buyer",this::MapRowToBuyer );
    }

    @Override
    public Buyer findAll(String id) {

        return jdbcTemplate.queryForObject("select id,name from Buyer where id=2",this::MapRowToBuyer,id );
    }

    @Override
    public Buyer save(Buyer buyer) {

        jdbcTemplate.update("insert into buyer(id,name,country,token)valuess(?,?,?,?)",
                buyer.getId(),
                buyer.getName(),
                buyer.getCountry(),
                buyer.getTocen());
        return buyer;
    }

    private Buyer MapRowToBuyer(ResultSet rs,int RowNum)throws SQLException {
        return new Buyer(rs.getLong("od"),
                rs.getString("name"),
                rs.getString())
    }
}
