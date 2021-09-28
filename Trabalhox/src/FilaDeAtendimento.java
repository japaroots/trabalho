/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author R@f@3l_L31t3
 */
import java.util.ArrayList;
public class FilaDeAtendimento {
    private ArrayList <Pessoa> fila;
    
    public FilaDeAtendimento()  {
        this.fila = new ArrayList<>();
    }
    
    public ArrayList<Pessoa> getFila()  {
        return fila;
    }
    
    public void setFila(ArrayList<Pessoa> fila)   {
        this.fila = fila;        
    }
    
    public void adicionarPessoa(Pessoa p)   {
        this.fila.add(p);
    }
    
    public int obterQuantidadeDePessoas()   {
        return this.fila.size();
    }
    
    public Pessoa atenderPessoa()   {
        Pessoa p1 = this.fila.get(0);
        this.fila.remove(0);
        return p1;
    }
    
    public void apagarTodos()   {
        this.fila.clear();
    }
    
    public Pessoa pesquisarPeloCpf(String cpf)    {
        Pessoa p2 = null;
        for (int i = 0; i<this.fila.size(); i++)    {
            if  (this.fila.get(i).getCpf().equals(cpf))  {
                p2  = this.fila.get(i);
            }
        }
        return p2;
    }
    public ArrayList<Pessoa> pesquisarPessoaPeloInteresse(byte interesse)   {
        ArrayList<Pessoa> listaInteresse = new ArrayList<>();
        for(int i = 0; i<this.fila.size(); i++) {
            if(this.fila.get(i).getInteresse()==interesse) {
                listaInteresse.add(this.fila.get(i));
        }
    }
    return listaInteresse;
}

    @Override
    public String toString() {
        return "FilaDeAtendimento: \n" + fila;
    }
        
}
