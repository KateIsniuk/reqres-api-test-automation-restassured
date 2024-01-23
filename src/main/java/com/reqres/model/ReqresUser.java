package com.reqres.model;

public class ReqresUser {
    private String name;
    private String job;

    public ReqresUser(String name, String job) {
        this.name = name;
        setName(name);
        setJob(job);
    }
    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setName(String name) {
        this.name = name;
    }
}
