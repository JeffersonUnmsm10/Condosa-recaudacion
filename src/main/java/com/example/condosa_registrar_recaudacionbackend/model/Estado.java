package com.example.condosa_registrar_recaudacionbackend.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity()
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "estado")
public class Estado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_estado", columnDefinition = "smallint")
    private short idEstado;

    @Column(name = "descripcion", length = 15)
    @NotNull
    private String descripcion;
}
