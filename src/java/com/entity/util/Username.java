package com.entity.util;

import javax.persistence.*;


@Embeddable
public class Username
{
    @Column(name="username", nullable=false)
    private String username;
    
    public Username()
    {
    }

    public Username(String username)
    {
        set(username);
    }

    public final boolean set(String username)
    {
        boolean userAlreadyExists = false;

        // Find user by username. Assign to userAlreadyExists user existence.
        
        if (!userAlreadyExists) {
            this.username = username;
        }

        return userAlreadyExists;
    }
    
    public String get()
    {
        return this.username;
    }
}
