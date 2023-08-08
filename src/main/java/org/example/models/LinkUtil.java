package org.example.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tb_links")
public class LinkUtil {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;

    private String descricao;
    private String url;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "questao_id")
    private Questao questao;
}
