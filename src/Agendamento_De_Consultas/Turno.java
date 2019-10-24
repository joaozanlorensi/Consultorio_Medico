/**
* IF62C: Fundamentos de Programação 2
* Programação Orientada a Objetos
*/

package Agendamento_De_Consultas;

import java.util.ArrayList;

public class Turno
{
    private Horario horaInicio;
    private Horario horaFim;
    private int duracaoAtendimento; 
    private boolean temIntervalo;

    public Turno(Horario horaInicio, Horario horaFim, int duracaoAtendimento, boolean temIntervalo) {
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
        this.duracaoAtendimento = duracaoAtendimento;
        this.temIntervalo = temIntervalo;
    }
    
    public Horario getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Horario horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Horario getHoraFim() {
        return horaFim;
    }

    public void setHoraFim(Horario horaFim) {
        this.horaFim = horaFim;
    }

    public int getDuracaoAtendimento() {
        return duracaoAtendimento;
    }

    public void setDuracaoAtendimento(int duracaoAtendimento) {
        this.duracaoAtendimento = duracaoAtendimento;
    }

    public boolean isTemIntervalo() {
        return temIntervalo;
    }

    public void setTemIntervalo(boolean temIntervalo) {
        this.temIntervalo = temIntervalo;
    }
    
    // Opção A
    public ArrayList<Horario> retornaHorarios()
    {
        double minTotal = horaFim.getHora() * 60 + horaFim.getMinuto() - ( horaInicio.getHora() * 60 + horaInicio.getMinuto() ); 
        
        double totalAtendimentos = minTotal / duracaoAtendimento;
        
        ArrayList<Horario> hrs = new ArrayList();
        
        double duracaoIntervalo;
        int min; 
        int hr;
        int divisor;
        int count;
        
        if(temIntervalo)
        {
            duracaoIntervalo = totalAtendimentos - (int)totalAtendimentos;
        
            min = horaInicio.getMinuto();
            hr = horaInicio.getHora();
            hrs.add(new Horario(hr, min));
            min += duracaoAtendimento;
            divisor = (int)totalAtendimentos / 2;
            count = 0;
            
            for(int i = 0; i < (int)totalAtendimentos; i++)
            {
                if(min >= 60)
                {
                    hr++;
                    min -= 60;
                }
                
                count++;
                
                if(count != divisor)
                {
                    hrs.add(new Horario(hr, min));
                }

                if(count == divisor-1)
                {
                    min += duracaoAtendimento * duracaoIntervalo; 
                }
                else
                {
                    min += duracaoAtendimento;
                }
                
            }
        }
        
        return hrs;
    }
}
