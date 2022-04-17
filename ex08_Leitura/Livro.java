package com.mycompany.leitura;

public class Livro implements Publicacao
{
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private String leitor;
    
    public void detalhes(Pessoa p1)
    {
        if(p1.getNome().equals(getLeitor()))
        {
            System.out.println("\n        ############### STATUS DE LEITURA ###############");
            
            System.out.println("" + this.leitor + " está lendo: " + this.titulo + 
                    ", do autor(a): " + this.autor + ", já leu: " + this.pagAtual + " de "
            + this.totPaginas + " páginas");
        }
        else
        {
            System.out.println("-- ERRO COM O NOME FORNECIDO --");
        }
    }
    
    //contrutor

    public Livro(String titulo, String autor, int totPaginas, int pagAtual, String leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.pagAtual = pagAtual;
        this.aberto = false;
        this.leitor = leitor;
    }

    /*public Livro() 
    {
        this.titulo = null;
        this.autor = null;
        this.totPaginas = 0;
        this.pagAtual = 0;
        this.aberto = false;
        this.leitor = null;
    }*/

    //getters and setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) 
    {
        this.titulo = titulo;
    }
    

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public String getLeitor() {
        return leitor;
    }

    public void setLeitor(String leitor) {
        this.leitor = leitor;
    }
    
    //métodos abstratos que usam a interface Publicacao
    
    @Override//sobesqcrever
    public void abrir() {
        if(getAberto() == false) //se o livro estiver fechado ele vai abrir
        {
            System.out.println("-- Livro aberto --");
            this.setAberto(true);
        }
        else
        {
            System.out.println("O livro já está aberto");
        }
    }

    @Override
    public void fechar() {
        if(getAberto() == true)//se o livro estiver aberto ele fecha
        {
            System.out.println("-- Livro fechado --");
            this.setAberto(false);
        }
        else
        {
            System.out.println("O livro já está fechado");
        }
    }

    @Override
    public void folhear() {
        
    }

    @Override
    public void avancarPag() {
        if(getAberto() == true)
        {
            this.setPagAtual(this.getPagAtual()+1);
        }
        else
        {
            System.out.println("\nO livro está fechado não é possível avançar páginas");
        }
    }

    @Override
    public void voltarPag() {
        if(getAberto() == true)
        {
            this.setPagAtual(this.getPagAtual()-1);
        }
        else
        {
            System.out.println("\nO livro está fechado não é possível voltar páginas");
        }
    }
    
}
