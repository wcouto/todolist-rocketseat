package br.com.willcouto.todolist.user;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

//@Getter
//@Setter
@Data
@Entity(name = "tb_users")
public class UserModel {

    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;
    
    //@Column(name = "usuario")
    //@Getter
    @Column(unique = true)
    private String username;
    //@Setter
    private String name;
    //@Data
    private String password;

    @CreationTimestamp
    private LocalDateTime createAt;

}
