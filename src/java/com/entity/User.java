package com.entity;

import com.entity.util.Username;
import com.entity.util.Password;
import javax.persistence.*;


@Entity
@Table(name="users")
public class User extends DAO
{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    
    @OneToOne(mappedBy="user")
    private Credential credential = new Credential();
    
    
    public User()
    {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public Credential getCredential()
    {
        return this.credential;
    }
}
