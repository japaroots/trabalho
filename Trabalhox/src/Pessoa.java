/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author R@f@3l_L31t3
 */
public class Pessoa {
   private String nome;
   private String cpf;
   private byte interesse;

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public byte getInteresse() {
        return interesse;
    }

   
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setInteresse(byte interesse) {
        this.interesse = interesse;
    }

    @Override
    public String toString() {
        String texto;
        switch(this.interesse)  {
            case 1: 
                texto = "Pagamento de conta";
                break;
            case 2:
                texto = "Recebimento de salário";
                break;
            default:
                texto = "Outro";
        }
        return "Pessoa: \n" + "Nome:" + nome + "\n cpf: " + cpf + "\n interesse:" + texto;
    }
   
   
}
