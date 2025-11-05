package academia;

import java.time.LocalDate;
import java.util.GregorianCalendar;

public class Aluno {
    private int id;
    private String nome;
    private String cpf;
    private GregorianCalendar data_nascimento;
    private String telefone;
    private String email;
    private String endereco;
    
    public Aluno() {
    
    }
    
    public Aluno(String nome, 
            String cpf, GregorianCalendar data_nascimento,
            String telefone, String email, String endereco){
        
        this.nome = nome;
        this.cpf = cpf;
        this.data_nascimento = data_nascimento;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }
    
    public int getId(){
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public GregorianCalendar getDataNascimento() {
        return data_nascimento;
    }

    public void setDataNascimento(GregorianCalendar data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}