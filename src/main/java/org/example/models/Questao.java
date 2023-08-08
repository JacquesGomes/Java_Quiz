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

    private List<String> opcoes;

    private String resposta;

    @Basic(fetch = FetchType.LAZY)
    private List<String> gabarito_comentado;

}
