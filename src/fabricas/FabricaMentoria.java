package fabricas;

import java.time.LocalDate;

import dominio.conteudo.Mentoria;

public class FabricaMentoria {
    
    public static Mentoria novo(String nome, String descricao) {
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo(nome);
        mentoria.setDescricao(descricao);
        mentoria.setData(LocalDate.now());
        return mentoria;
    }
}
