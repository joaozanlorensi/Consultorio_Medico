/**
* IF62C: Fundamentos de Programação 2
* Programação Orientada a Objetos
*/

package Agendamento_De_Consultas;

public class Consulta
{
    private Data dtConsulta;
    private Horario hrConsulta;
    private String profResponsavel;
    private String nomePaciente;
    private String cpfPaciente;
    private String observacao;

    public Consulta(Data dtConsulta, Horario hrConsulta, String profResponsavel, String nomePaciente, String cpfPaciente, String observacao) {
        this.dtConsulta = dtConsulta;
        this.hrConsulta = hrConsulta;
        this.profResponsavel = profResponsavel;
        this.nomePaciente = nomePaciente;
        this.cpfPaciente = cpfPaciente;
        this.observacao = observacao;
    }

    public Data getDtConsulta() {
        return dtConsulta;
    }

    public void setDtConsulta(Data dtConsulta) {
        this.dtConsulta = dtConsulta;
    }

    public Horario getHrConsulta() {
        return hrConsulta;
    }

    public void setHrConsulta(Horario hrConsulta) {
        this.hrConsulta = hrConsulta;
    }

    public String getProfResponsavel() {
        return profResponsavel;
    }

    public void setProfResponsavel(String profResponsavel) {
        this.profResponsavel = profResponsavel;
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public String getCpfPaciente() {
        return cpfPaciente;
    }

    public void setCpfPaciente(String cpfPaciente) {
        this.cpfPaciente = cpfPaciente;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    
    public String marcaNoLog()
    {
         return (String.format("%s\t%s\t%s\t%s\t%s\t%s%n", nomePaciente, cpfPaciente, profResponsavel, observacao, dtConsulta.toString(), hrConsulta.toString()));
    }

    @Override
    public String toString() {
        return (String.format("%s\t%s\t%s\t%s\t%s%n", profResponsavel, nomePaciente, cpfPaciente, observacao, hrConsulta.toString()));
    }
    
    
    
}
