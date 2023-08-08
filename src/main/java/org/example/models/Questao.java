package org.example.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "tb_questions")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Questao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    private String opcoes;

    private String resposta;

    private String options;


    @Basic(fetch = FetchType.LAZY)
    private String gabarito_comentado;

    @OneToMany(mappedBy = "questao", cascade = CascadeType.ALL, fetch =
            FetchType.LAZY)
    private List<Comentario> comentarios;
    @OneToMany(mappedBy = "questao", cascade = CascadeType.ALL, fetch =
            FetchType.LAZY)
    private List<LinkUtil> links_uteis;
}
