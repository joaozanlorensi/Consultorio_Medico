/**
* IF62C: Fundamentos de Programação 2
* Programação Orientada a Objetos
*/

package Agendamento_De_Consultas;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Profissional extends Pessoa
{   
    private String especializacao;
    private String tipoIdent;
    private String ident;
    private String turnosDeTrab;

    public Profissional(String especializacao, String tipoIdent, String ident, String nome, String cpf, Data dtNasc, char sexo, String telefone, String eMail, String turnosDeTrab) {
        super(nome, cpf, dtNasc, sexo, telefone, eMail);
        this.especializacao = especializacao;
        this.tipoIdent = tipoIdent;
        this.ident = ident;
        this.turnosDeTrab = turnosDeTrab;
    }
    
    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }

    public String getTipoIdent() {
        return tipoIdent;
    }

    public void setTipoIdent(String tipoIdent) {
        this.tipoIdent = tipoIdent;
    }

    public String getIdent() {
        return ident;
    }

    public void setIdent(String ident) {
        this.ident = ident;
    }

    public String getTurnosDeTrab() {
        return turnosDeTrab;
    }

    public void setTurnosDeTrab(String turnosDeTrab) {
        this.turnosDeTrab = turnosDeTrab;
    }
    
    
    public void gravarCadastroProfissional() throws IOException{
        FileWriter arq = new FileWriter(super.getNome() +".txt");
        PrintWriter gravarArq = new PrintWriter(arq);
        
        String s;
        
        s = super.toString() + String.format("Especialização: %s%n"
                                           + "%s: %s%n"
                                           + "Turnos: %s", 
                                           especializacao,
                                           tipoIdent,
                                           ident,
                                           turnosDeTrab);
                  
        gravarArq.printf("%s", s);
        gravarArq.close();
        
    }
    
}
