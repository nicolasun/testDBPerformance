package hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

@SpringBootApplication
public class Application{

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String args[]) {
        SpringApplication.run(Application.class, args);
    }

/*    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public void run(String... strings) throws Exception {

        log.info("Creating tables");

        //insert to log table
        List<Object[]> splitLogs = Arrays.asList("a1 2 self test true", "a2 3 self test false").stream()
                .map(loglist -> loglist.split(" "))
                .collect(Collectors.toList());
        splitLogs.forEach(loglist -> log.info(String.format("Inserting customer record for %s %s %s %s %s", loglist[0], loglist[1], loglist[2], loglist[3], loglist[4])));
        jdbcTemplate.batchUpdate("INSERT INTO logs(id, duration,type,host,alert) VALUES (?,?,?,?,?)", splitLogs);
        jdbcTemplate.query(
                "SELECT * FROM logs WHERE type = ?", new Object[] { "self" },
                (rs, rowNum) -> new LogElement(rs.getString("id"), rs.getInt("duration"), rs.getString("type"), rs.getString("host"), rs.getBoolean("alert"))
        ).forEach(loglist -> log.info(loglist.toString()));
        
    }*/
}