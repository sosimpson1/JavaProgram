package com.esl.demos;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class Car {
    @GeneratedValue @Id
    private Long id;
    private @NonNull String name;

}
