package harsh.singh.dynamic_Backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import javax.annotation.processing.Generated;

@Entity
@Data
@NoArgsConstructor@AllArgsConstructor
public class User {

    private String name;
    @Id
    private String email;
    private long number;
    private String address;
}
