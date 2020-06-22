package ml.sadriev.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;


@Data
@Entity
public class Unit {

    @Id
    @GeneratedValue
    private long id;

    @Column(length = 64, unique = true)
    private String name;

    private boolean active;
}
