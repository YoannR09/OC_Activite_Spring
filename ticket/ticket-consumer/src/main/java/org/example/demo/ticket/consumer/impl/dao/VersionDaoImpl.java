package org.example.demo.ticket.consumer.impl.dao;

import org.example.demo.ticket.consumer.contract.dao.VersionDao;
import org.example.demo.ticket.model.bean.projet.Version;
import org.example.demo.ticket.model.bean.ticket.Evolution;
import org.example.demo.ticket.model.exception.NotFoundException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.inject.Named;
import java.util.List;

@Named
public class VersionDaoImpl extends AbstractDaoImpl implements VersionDao {
    @Override
    public Version getVersion(Integer pId) throws NotFoundException {
        String vSQL = "SELECT * FROM version WHERE ="+pId;
        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());

        RowMapper<Version> rowMapper = mapper();

        Version version = (Version) vJdbcTemplate.query(vSQL, rowMapper);

        return version;
    }

    @Override
    public List<Version> getListVersion() {
        String vSQL = "SELECT * FROM version";
        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());

        RowMapper<Version> rowMapper = mapper();

        List<Version> vListVersion = vJdbcTemplate.query(vSQL, rowMapper);

        return vListVersion;
    }

    @Override
    public int getCountVersion() {
        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
        int vNbrVersion = vJdbcTemplate.queryForObject(
                "SELECT COUNT(*) FROM version",
                Integer.class);
        return vNbrVersion;
    }

    public RowMapper<Version> mapper(){
        RowMapper<Version> rowMapper = (rs, i) -> {
            Version version = new Version();
            ProjetDaoImpl projet = new ProjetDaoImpl();
            version.setNumero(String.valueOf(rs.getLong("numero")));
            try {
                version.setProjet(projet.getProjet(rs.getInt("projet_id")));
            } catch (NotFoundException e) {
                e.printStackTrace();
            }
            return version;
        };
        return rowMapper;
    }
}
