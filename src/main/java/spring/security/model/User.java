package spring.security.model;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Timestamp;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Data
public class User {

    @Id @GeneratedValue(strategy = IDENTITY)
    private Long id;
    private String username;
    private String password;
    private String email;
    private String role;
    @CreationTimestamp
    private Timestamp createDate;



}
