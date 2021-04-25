package io.celsoagra.pocCache.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.celsoagra.pocCache.entity.ReceivedRequests;
import io.celsoagra.pocCache.service.ReceivedRequestsService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class ApplicationController {

    @Autowired
    ReceivedRequestsService receivedRequestsService;

    @GetMapping(value = "/with-cache", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ReceivedRequests> getInfoWithCacheEmbedded() {
        log.info("getInfoWithCacheEmbedded() - called");
        return ResponseEntity.status(HttpStatus.OK).body(receivedRequestsService.findWithCache());
    }

    @GetMapping(value = "/without-cache", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ReceivedRequests> getInfoWithoutCache() {
        log.info("getInfoWithoutCache() - called");
        return ResponseEntity.status(HttpStatus.OK).body(receivedRequestsService.findWithNoCache());
    }
}
