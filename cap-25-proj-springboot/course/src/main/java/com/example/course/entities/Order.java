package com.example.course.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;

@RequiredArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name = "tb_order")
public class Order implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    private Instant moment;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private User client;


}
