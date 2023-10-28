package br.com.atlas.atlas.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "records")
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
@ToString
@Getter
@Setter
public class Records implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "client")
    private String client;

    @NotNull
    @Column(name = "code")
    private String code;

    @NotNull
    @Column(name = "date_send")
    private LocalDate dateSend;

    @NotNull
    @Column(name = "date_register")
    private LocalDate dateRegister;

    @ManyToOne
    private Consultant consultant;

    @ManyToOne
    private Status status;

    @OneToMany
    private List<Message> messages;
}
