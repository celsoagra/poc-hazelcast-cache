package io.celsoagra.pocCache.trigger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.h2.tools.TriggerAdapter;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class UpdateReceivedRequestsTrigger extends TriggerAdapter {

    private static final String REQUEST_IDENTIFIER = "request";

    @Override
    public void fire(Connection conn, ResultSet oldRow, ResultSet newRow) throws SQLException {
        try (PreparedStatement stmt = conn.prepareStatement("UPDATE RECEIVED_REQUESTS SET COUNT_REQUESTS = "
                + "(SELECT RECEIVED_REQUESTS_SEQUENCE.NEXTVAL FROM DUAL) WHERE IDENTIFIER = ?")) {
            stmt.setObject(1, REQUEST_IDENTIFIER);
            stmt.executeUpdate();
        }
    }

}
