package com.shubhamit.dairy.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Dairy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

    @NonNull
    private String name;

    @NonNull
    private String production;
}
