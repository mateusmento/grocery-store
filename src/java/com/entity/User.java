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
    
    @Embedded
    private Username username = new Username();
    
    @Embedded
    private Password password = new Password();
    
    public User()
    {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Username getUsername() {
        return username;
    }

    public User setUsername(Username username) {
        this.username = username;
        return this;
    }

    public User setUsername(String username) {
        this.username = new Username(username);
        return this;
    }

    public Password getPassword() {
        return password;
    }

    public User setPassword(Password password) {
        this.password = password;
        return this;
    }

    public User setPassword(String password) {
        this.password = new Password(password);
        return this;
    }
}
