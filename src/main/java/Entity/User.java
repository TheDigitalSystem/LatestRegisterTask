package Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name ="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String userName;
    private String password;
    private String repeatPassword;
    private String eMail;
}
