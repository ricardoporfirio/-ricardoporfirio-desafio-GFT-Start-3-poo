package servicos;

import java.util.Optional;
import java.util.Set;

import dominio.bootcamp.Bootcamp;
import dominio.conteudo.Conteudo;
import dominio.dev.Dev;

public class DevServicos {
    
    public static void inscriverBootacamp(Bootcamp bootcamp,Dev dev,Set<Conteudo> inscritos) {
        inscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevs().add(dev);
    }

    public static String progredir(Dev dev,Set<Conteudo> inscritos) {
        String retorno = "";
        Optional<Conteudo> conteudo = inscritos.stream().findFirst();
        if (conteudo.isPresent()) {
            dev.getConcluidos().add(conteudo.get());
            inscritos.remove(conteudo.get());
            retorno = "Você avançou no conteudo";
        } else {
            retorno = "Você não tem mais conteudos para concluir";	
        }

        return retorno;
    }

    public static double calcularTotalXP(Dev dev) {
        return dev.getConcluidos().stream().mapToDouble(conteudo -> conteudo.calculaXP()).sum();
    }

}
