
package academia;

import java.time.LocalDate;
import java.util.GregorianCalendar;

public class Treino {
    private int id;
    private int aluno_id;
    private String tipo_treino;
    private String descricao;
    private int duracao_minutos; 
    private GregorianCalendar data_inicio;
    
    public Treino(String tipo_treino, String descricao, int duracao_minutos, GregorianCalendar data_inicio){
        
        this.tipo_treino = tipo_treino;
        this.descricao = descricao;
        this.duracao_minutos = duracao_minutos;
        this.data_inicio = data_inicio;
    }

    public Treino() {
    }
    
    public int getId(){
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAlunoId() {
        return aluno_id;
    }
    
    public void setAlunoId(int aluno_id) {
        this.aluno_id = aluno_id;
    }

    public String getTipo_treino() {
        return tipo_treino;
    }

    public void setTipo_treino(String tipo_treino) {
        this.tipo_treino = tipo_treino;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getDuracao_minutos() {
        return duracao_minutos;
    }

    public void setDuracao_minutos(int duracao_minutos) {
        this.duracao_minutos = duracao_minutos;
    }

    public GregorianCalendar getData_inicio() {
        return data_inicio;
    }

    public void setData_inicio(GregorianCalendar data_inicio) {
        this.data_inicio = data_inicio;
    }

       
}
