CREATE TABLE IF NOT EXISTS RECEIVED_REQUESTS (
    IDENTIFIER VARCHAR(20),
    COUNT_REQUESTS NUMBER
);

CREATE SEQUENCE RECEIVED_REQUESTS_SEQUENCE START WITH 1 INCREMENT BY 1 MINVALUE 1;
CREATE TRIGGER SELECT_TRIGGER BEFORE SELECT ON RECEIVED_REQUESTS CALL "io.celsoagra.pocCache.trigger.UpdateReceivedRequestsTrigger";