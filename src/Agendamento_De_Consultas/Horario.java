/**
* IF62C: Fundamentos de Programação 2
* Programação Orientada a Objetos
*/

package Agendamento_De_Consultas;

import java.util.Calendar;

public class Horario
{
    private int hora;
    private int minuto;

    public Horario(int hora, int minuto) {
        this.hora = hora;
        this.minuto = minuto;
    }
    
    // Polimorfismo por sobrecarga
    public Horario(){
        Calendar agora = Calendar.getInstance();
        hora = agora.get(Calendar.HOUR_OF_DAY);
        hora = agora.get(Calendar.MINUTE);
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }   

    @Override
    public String toString() {
        if(hora < 10)
        {
            if(minuto < 10)
            {
                return(String.format("0%d:0%d", hora, minuto));
            }
            else
            {
                return (String.format("0%d:%d", hora, minuto));
            }
        }
        
        else
        {
           if(minuto < 10)
           {
               return(String.format("%d:0%d", hora, minuto));
           }
           else
           {
               return (String.format("%d:%d", hora, minuto));
           }
            
        }
        
    }
    
}
