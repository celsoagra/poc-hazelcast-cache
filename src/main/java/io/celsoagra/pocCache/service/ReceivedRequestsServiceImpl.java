package io.celsoagra.pocCache.service;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import io.celsoagra.pocCache.entity.ReceivedRequests;
import io.celsoagra.pocCache.repo.ReceivedRequestsRepository;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ReceivedRequestsServiceImpl implements ReceivedRequestsService {
    
    private static final String REQUEST_IDENTIFIER = "request";
    
    @Autowired
    private ReceivedRequestsRepository repository;
    
    @Cacheable(value = REQUEST_IDENTIFIER)
    public ReceivedRequests findWithCache() {
        return findWithNoCache();
    }
  
    public ReceivedRequests findWithNoCache() {
        return repository.findById(REQUEST_IDENTIFIER).orElseThrow(() -> new EntityNotFoundException() );
    }

}
