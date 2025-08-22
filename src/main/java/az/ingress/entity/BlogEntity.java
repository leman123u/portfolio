package az.ingress.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Data
@Table(name = "blogs")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class BlogEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

      private Long id ;

      private String title ;

      private String content;
      private  String  author ;

      private String imageUrl;

      private LocalDateTime createdAt ;



}
