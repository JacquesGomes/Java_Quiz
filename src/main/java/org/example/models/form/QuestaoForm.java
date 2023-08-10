package org.example.models.form;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.List;

@Data
public class QuestaoForm {

    private String titulo;
    private List<String> opcoes;
    private String resposta;
    private List<String> gabaritoComentado;

    public String getTitulo() {
        return titulo;
    }

    public List<String> getOpcoes() {
        return opcoes;
    }

    public String getResposta() {
        return resposta;
    }

    public List<String> getGabaritoComentado() {
        return gabaritoComentado;
    }
}
