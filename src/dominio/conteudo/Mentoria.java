package dominio.conteudo;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

    LocalDate data;

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public double calculaXP() {
        return XP_PADRAO + 20d;
    }

    
    @Override
    public String toString() {
        return "Mentoria{" + "titulo=" + titulo + ", descricao=" + descricao + ", data=" + data + '}';
    }
    
}
    
    