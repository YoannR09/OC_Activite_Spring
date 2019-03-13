package org.example.demo.ticket.consumer.rowmapper;

import org.example.demo.ticket.model.bean.ticket.Evolution;
import org.springframework.jdbc.core.RowMapper;

import javax.inject.Named;
import java.sql.ResultSet;
import java.sql.SQLException;

@Named
public class EvolutionRM implements RowMapper<Evolution> {
    @Override
    public Evolution mapRow(ResultSet rs, int i) throws SQLException {
        Evolution evolution = new Evolution();
        evolution.setPriorite(rs.getInt("priorite"));
        return evolution;
    }
}
