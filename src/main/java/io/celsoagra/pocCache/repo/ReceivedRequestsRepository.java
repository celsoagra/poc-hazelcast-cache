package io.celsoagra.pocCache.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import io.celsoagra.pocCache.entity.ReceivedRequests;

public interface ReceivedRequestsRepository extends JpaRepository<ReceivedRequests, String> {

}
