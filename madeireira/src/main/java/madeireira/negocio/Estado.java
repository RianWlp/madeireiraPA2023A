package madeireira.negocio;

public class Estado implements Comparable<Estado>
{
    private String sigla;
    private String nome;

    public Estado(String sigla, String nome)
    {
        this.sigla = sigla;
        this.nome = nome;
    }
    
    public Estado()
    {
        this.sigla = "";
        this.nome = "";
    }

    public String getSigla()
    {
        return sigla;
    }

    public void setSigla(String sigla)
    {
        this.sigla = sigla;
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
        Estado outroEstado = (Estado)objeto;
        return ( this.getSigla().equalsIgnoreCase(outroEstado.getSigla()) );
    }
    
    @Override
    public String toString()
    {
        return this.sigla;
    }
    
    @Override
    public int compareTo(Estado estado)
    {
        return (this.sigla.compareTo(estado.sigla));
    }
    
    @Override
    public Estado clone()
    {
        return new Estado(this.sigla,this.nome);
    }
}
