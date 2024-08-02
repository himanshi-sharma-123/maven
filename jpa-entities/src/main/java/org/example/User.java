package org.example;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {
   private Long id;
   private String firstName;
   private String lastName;
   private String email;
}