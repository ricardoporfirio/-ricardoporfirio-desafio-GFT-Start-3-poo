package dominio.conteudo;

public class Curso extends Conteudo {

    private int carga_horaria;

    public int getCarga_horaria() {
        return carga_horaria;
    }

    public void setCarga_horaria(int carga_horaria) {
        this.carga_horaria = carga_horaria;
    }
    
    @Override
    public double calculaXP() {
        return XP_PADRAO * carga_horaria;
    }
    
    @Override
    public String toString() {
        return "Curso{" + "titulo=" + titulo + ", descricao=" + descricao + ", carga_horaria=" + carga_horaria + '}';
    }
}
