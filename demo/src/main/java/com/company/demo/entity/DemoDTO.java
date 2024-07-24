package com.company.demo.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.entity.annotation.JmixId;
import io.jmix.core.metamodel.annotation.JmixEntity;

import java.util.UUID;

@JmixEntity(name = "d1_DemoDTO")
public class DemoDTO {
    @JmixGeneratedValue
    @JmixId
    private UUID id;

    private String demoName;

    private String demoAccount;

    public String getDemoAccount() {
        return demoAccount;
    }

    public void setDemoAccount(String demoAccount) {
        this.demoAccount = demoAccount;
    }

    public String getDemoName() {
        return demoName;
    }

    public void setDemoName(String demoName) {
        this.demoName = demoName;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}