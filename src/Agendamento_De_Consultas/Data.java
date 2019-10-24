/**
* IF62C: Fundamentos de Programação 2
* Programação Orientada a Objetos
*/

package Agendamento_De_Consultas;

import java.util.Calendar;

public class Data
{
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    // Polimorfismo por sobrecarga
    public Data() {
        Calendar hoje = Calendar.getInstance();
        dia = hoje.get(Calendar.DAY_OF_MONTH);
        mes = hoje.get(Calendar.MONTH);
        ano = hoje.get(Calendar.YEAR);
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public int calculaIdade()
    {
        Data hoje = new Data();
    
        int idade;
    
        idade = hoje.getAno() - ano;
        
        if ((hoje.getMes() < mes) || ((hoje.getMes() == mes) && (hoje.getDia() < ano)))
        {
            idade = idade - 1; // Ainda não fez aniversário no ano
        }
          
        return(idade);
    }
    
    public String nomeMes(boolean abreviado)
    {
        String meses[] = {"", "janeiro", "fevereiro", "março", "abril", "maio", "junho",
        "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};
        if (abreviado)
        {
            return(meses[mes].substring(0, 3)); // Função para abreviar!!
        }
        else
        {
            return(meses[mes]);
        }
    }  
    
  public String mostrarData(int tipo)
  {
    switch (tipo)
    {
        case 0:  if(mes < 10) return (dia + "/0" + mes + "/" + ano);
                 else return(dia + "/" + mes + "/" + ano);
        case 1: return(dia + "/" + nomeMes(true) + "/" + ano);
        default: return(dia + "/" + nomeMes(false) + "/" + ano);
    }
  } 

    @Override
    public String toString() {
        return (mostrarData(0));
    }
    
}
