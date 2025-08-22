package az.ingress.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Table;
import java.time.LocalDateTime;

@Data
@Table(name = "contacts")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ContactEntity {


    private Long id ;

    private String name ;

    private String email;

    private String message ;
    private LocalDateTime createdAt;
}
