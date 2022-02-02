import java.time.LocalDate;

import dominio.bootcamp.Bootcamp;
import dominio.conteudo.Curso;
import dominio.conteudo.Mentoria;
import dominio.dev.Dev;
import fabricas.FabricaBootcamp;
import fabricas.FabricaCurso;
import fabricas.FabricaMentoria;
import servicos.DevServicos;

public class App {
    public static void main(String[] args) throws Exception {
        
        Curso cursoJava = FabricaCurso.novo("Java", "Curso de Java", 8);
        Curso cursoJS = FabricaCurso.novo("JavaScript", "Curso de JavaScript", 4);
        Mentoria mentoriaJava = FabricaMentoria.novo("Mentoria de Java", "Mentoria de Java");
        Bootcamp bootcamp = FabricaBootcamp.novo("Bootcamp de Java", "Bootcamp de Java", cursoJava, cursoJS, mentoriaJava);
        
        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        //devCamila.inscriverBootacamp(bootcamp);
        DevServicos.inscriverBootacamp(bootcamp, devCamila, devCamila.getInscritos());
        System.out.println("Conteúdos inscritos de Camila: "+devCamila.getInscritos());
        
        //devCamila.progredir();
        //devCamila.progredir();
        System.out.println(DevServicos.progredir(devCamila, devCamila.getInscritos()));
        System.out.println(DevServicos.progredir(devCamila, devCamila.getInscritos()));
        
        System.out.println("-");
        System.out.println("Conteúdos inscritos de Camila: "+devCamila.getInscritos());
        System.out.println("Conteúdos concluidos de Camila: "+devCamila.getConcluidos());
        //System.out.println("XP de Camila: "+devCamila.calcularTotalXP());
        System.out.println("XP de Camila: "+DevServicos.calcularTotalXP(devCamila));
        

        System.out.println("-----------------------------------------------------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        //devJoao.inscriverBootacamp(bootcamp);
        DevServicos.inscriverBootacamp(bootcamp, devJoao, devJoao.getInscritos());
        System.out.println("Conteúdos inscritos de Joao: "+devJoao.getInscritos());
        
        //devJoao.progredir();
        //devJoao.progredir();
        //devJoao.progredir();
        System.out.println(DevServicos.progredir(devJoao, devJoao.getInscritos()));
        System.out.println(DevServicos.progredir(devJoao, devJoao.getInscritos()));
        System.out.println(DevServicos.progredir(devJoao, devJoao.getInscritos()));
        System.out.println("-");
        System.out.println("Conteúdos inscritos de Joao: "+devJoao.getInscritos());
        System.out.println("Conteúdos concluidos de Joao: "+devJoao.getConcluidos());
        //System.out.println("XP de Joao: "+devJoao.calcularTotalXP()); 
        System.out.println("XP de Joao: "+DevServicos.calcularTotalXP(devJoao));

    }
}
