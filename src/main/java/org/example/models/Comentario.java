package org.example.models;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tb_comentarios")
public class Comentario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String usuario;

    private String comentario;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "questao_id")
    private Questao questao;

}
