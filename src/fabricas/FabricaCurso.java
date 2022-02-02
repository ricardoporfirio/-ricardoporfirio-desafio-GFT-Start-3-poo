package fabricas;

import dominio.conteudo.Curso;

public class FabricaCurso {
    
    public static Curso novo(String nome, String descricao, int cargaHoraria) {
        Curso curso = new Curso();
        curso.setTitulo(nome);
        curso.setDescricao(descricao);
        curso.setCarga_horaria(cargaHoraria);
        return curso;
    }
}
