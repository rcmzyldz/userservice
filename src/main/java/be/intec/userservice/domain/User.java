package be.intec.userservice.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;


@Data
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@Entity
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String name;
    String username;
    String password;

    @ManyToMany(fetch = FetchType.EAGER)
    Collection<Role> roles = new ArrayList();
}
