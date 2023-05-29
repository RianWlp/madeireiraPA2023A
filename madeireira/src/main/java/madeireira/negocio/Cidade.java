/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package madeireira.negocio;

public class Cidade implements Comparable<Cidade>
{
    private int id;
    private String nome;
    private Estado estado;
    /*
    private static int nextId = 0;

    public static int getNextId()
    {
        return Cidade.nextId;
    }

    public static void setNextId(int nextId)
    {
        Cidade.nextId = nextId;
    }
    */
    public Cidade(int id, String nome, Estado estado)
    {
        this.id = id;
        this.nome = nome;
        this.estado = estado;
    }
    
       
    public Cidade()
    {
        //this.id = ++Cidade.nextId;
        this.id = 0;
        this.nome = null;
        this.estado = null;
    }

    public Estado getEstado()
    {
        return estado;
    }

    public void setEstado(Estado estado)
    {
        this.estado = estado;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }
    
    @Override
    public boolean equals(Object objeto)
    {
        Cidade c = (Cidade)objeto;
        return (this.id == c.getId());
    }

    @Override
    public int compareTo(Cidade cidade)
    {
        return (this.id - cidade.id);
    }
}
