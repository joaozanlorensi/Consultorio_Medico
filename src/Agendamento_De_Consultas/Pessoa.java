/**
* IF62C: Fundamentos de Programação 2
* Programação Orientada a Objetos
*/

package Agendamento_De_Consultas;

public class Pessoa
{
    private String nome;
    private String cpf;
    private Data dtNasc;
    private char sexo;
    private String telefone;
    private String eMail;

    public Pessoa(String nome, String cpf, Data dtNasc, char sexo, String telefone, String eMail) {
        this.nome = nome;
        this.cpf = cpf;
        this.dtNasc = dtNasc;
        this.sexo = sexo;
        this.telefone = telefone;
        this.eMail = eMail;
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

    public Data getDtNasc() {
        return dtNasc;
    }

    public void setDtNasc(Data dtNasc) {
        this.dtNasc = dtNasc;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    @Override
    public String toString() {
        return (String.format("Nome: %s%n"
                            + "Sexo: %c%n"
                            + "Data de nascimento: %s%n"
                            + "CPF: %s%n"
                            + "E-mail: %s%n"
                            + "Telefone: %s%n",
                            nome,
                            sexo,
                            dtNasc.toString(),
                            cpf,
                            eMail,
                            telefone));
    }
       
}
