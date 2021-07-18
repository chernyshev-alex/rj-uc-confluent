package com.rj.gd.streams.uc1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

@Log4j2
@Component
@Repository
public class LookupService {

    JdbcTemplate jdbcTemplate;
    TickerInfoRowMapper tickerMapper = new TickerInfoRowMapper();

    @Data
    @AllArgsConstructor
    public static class TickerInfo {
        String ticker;
        float open, close;
    }

    @Cacheable(cacheNames = "CCO")
    public TickerInfo getData(String ticker) {
        log.info("cache missed, get it from database key= {}" , ticker);
        return getTickerInfo(ticker).get();
    }

    @Autowired
    public void setDataSource(DataSource ds) {
        jdbcTemplate = new JdbcTemplate(ds);
    }

    public Optional<TickerInfo> getTickerInfo(String tickerId) {
        final String q = "SELECT * FROM TICKERS WHERE TICKER_ID = ?";
        List<TickerInfo> ls = jdbcTemplate.query(q, tickerMapper, tickerId);
        return Optional.ofNullable(ls.isEmpty() ? null : ls.get(0) );
    }

    public class TickerInfoRowMapper  implements RowMapper<TickerInfo> {
        @Override
        public TickerInfo mapRow(ResultSet rs, int i) throws SQLException {
             return new TickerInfo(
                    rs.getString("TICKER_ID"),
                    rs.getFloat("OPEN"),
                    rs.getFloat("CLOSED")
            );
        }
    }

}
