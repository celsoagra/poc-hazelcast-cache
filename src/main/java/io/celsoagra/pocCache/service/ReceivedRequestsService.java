package io.celsoagra.pocCache.service;

import io.celsoagra.pocCache.entity.ReceivedRequests;

public interface ReceivedRequestsService {

    ReceivedRequests findWithCache();
    
    ReceivedRequests findWithNoCache();
}
