package com.entity.util;

import javax.persistence.*;
import org.mindrot.jbcrypt.BCrypt;



@Embeddable
public class Password
{
    static String salt = BCrypt.gensalt(10);
    
    @Column(name="password", nullable=false)
    private String hash;
    
    public Password(){}
    
    public Password(String password)
    {
        set(password);
    }

    public String get()
    {
        return this.hash;
    }

    public final Password set(String password)
    {
        this.hash = BCrypt.hashpw(password, salt);
        return this;
    }
    
    public boolean equals(Password password)
    {
        return this.hash.equals(password.hash);
    }

    public boolean equals(String password)
    {
        return BCrypt.checkpw(password, hash);
    }
}
