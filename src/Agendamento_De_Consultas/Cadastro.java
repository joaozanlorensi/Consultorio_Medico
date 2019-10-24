/**
* IF62C: Fundamentos de Programação 2
* Programação Orientada a Objetos
*/

package Agendamento_De_Consultas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class Cadastro
{
    private String login;
    private String senha;

    public Cadastro(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public void registraCadastro() throws IOException
    {
        FileWriter arq = new FileWriter("Registros.txt", true);
        PrintWriter gravarArq = new PrintWriter(arq);
        
        gravarArq.printf("%s\t\t%s%n", login, senha);
        
        gravarArq.close();
        arq.close();
    }
    
    public static boolean verificaLogin(String loginInput, String senhaInput) throws IOException
    {
        FileReader arq = new FileReader("Registros.txt");
        BufferedReader lerArq = new BufferedReader(arq);
        
        String linha;
        linha = lerArq.readLine();
        boolean acertouLogin = false;
        
        while(linha != null)
        {
            if(linha.equals(loginInput + "\t" + senhaInput))
            {
                acertouLogin = true;
                break;
            }
            linha = lerArq.readLine();
        }
        
        lerArq.close();
        arq.close();
        
        return acertouLogin;

    }

}

