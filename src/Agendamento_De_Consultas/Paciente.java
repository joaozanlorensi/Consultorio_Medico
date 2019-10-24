/**
* IF62C: Fundamentos de Programação 2
* Programação Orientada a Objetos
*/

package Agendamento_De_Consultas;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Paciente extends Pessoa
{
    public Paciente(String nome, String cpf, Data dtNasc, char sexo, String telefone, String eMail) {
        super(nome, cpf, dtNasc, sexo, telefone, eMail); 
    }
    
    public void cadastraPaciente() throws IOException{
        FileWriter arq = new FileWriter("Pacientes.txt", true);
        PrintWriter gravarArq = new PrintWriter(arq);
                
        gravarArq.printf("%s; %s; %s; %c; %s; %s%n", super.getNome(), super.getCpf(), super.getDtNasc().toString(), super.getSexo(), super.getTelefone(), super.geteMail());
        gravarArq.close();
    }
    
    public static String verificaConsultaMarcada(Data dtConsulta, Horario hrConsulta, String profResponsavel, String obs)
    {
        Data dtHoje = new Data();
        Horario hrAgora = new Horario();
        
        if(dtHoje.getAno() <= dtConsulta.getAno()
        || dtHoje.getMes() <= dtConsulta.getMes()
        || dtHoje.getDia() <= dtConsulta.getDia()
        || hrAgora.getHora() <= hrConsulta.getHora()
        || hrAgora.getMinuto() < hrConsulta.getMinuto())
        {
            return(String.format("Tem consulta marcada: %s às %s\n"
                    + "Profissional responsável: %s\n"
                    + "Observação: %s\n",
                    dtConsulta.mostrarData(2), 
                    hrConsulta.toString(),
                    profResponsavel,
                    obs));
        }
        else
        {
            return("Não tem consulta marcada.\n");
        }
    }
    
}
