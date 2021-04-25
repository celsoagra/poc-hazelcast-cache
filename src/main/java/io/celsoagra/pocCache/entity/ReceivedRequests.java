package io.celsoagra.pocCache.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ReceivedRequests implements Serializable {

    @Id
    private String identifier;
    private Integer countRequests;

}