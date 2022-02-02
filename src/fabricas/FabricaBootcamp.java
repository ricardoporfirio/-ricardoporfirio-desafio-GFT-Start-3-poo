package fabricas;

import dominio.bootcamp.Bootcamp;
import dominio.conteudo.Conteudo;

public class FabricaBootcamp {
    public static Bootcamp novo(String nome,String descricao,Conteudo ... conteudos) {
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome(nome);
        bootcamp.setDescricao(descricao);

        for(Conteudo conteudo:conteudos) {
            bootcamp.getConteudos().add(conteudo);
        }
        

        return bootcamp;
    }
}
