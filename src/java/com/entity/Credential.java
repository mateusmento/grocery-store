package com.entity;

import com.entity.util.Password;
import com.entity.util.Username;
import javax.persistence.*;


@Entity
@Table(name="credentials")
public class Credential
{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Embedded
    private Username username = new Username();
    
    @Embedded
    private Password password = new Password();
    
    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="user_id", referencedColumnName="id")
    private User user;
    
    public Credential()
    {
    }
    
    public Username getUsername() {
        return username;
    }

    public void setUsername(Username username) {
        this.username = username;
    }

    public void setUsername(String username) {
        this.username = new Username(username);
    }

    public Password getPassword() {
        return password;
    }

    public void setPassword(Password password) {
        this.password = password;
    }

    public void setPassword(String password) {
        this.password = new Password(password);
    }
}
