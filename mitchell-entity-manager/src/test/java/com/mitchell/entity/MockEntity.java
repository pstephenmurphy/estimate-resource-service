package com.mitchell.entity;

import java.util.UUID;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "MockEntity")
public class MockEntity implements Entity<UUID> {

    @XmlElement(name = "EntityId")
    private UUID entityId;

    public MockEntity() {
        entityId = UUID.randomUUID();
    }

    @Override
    public UUID getID() {
        return this.entityId;
    }

}