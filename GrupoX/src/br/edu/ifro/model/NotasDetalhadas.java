package br.edu.ifro.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class NotasDetalhadas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nomeCliente;
    
    @ManyToMany
    private List<Produto> produtos;
    
    public NotasDetalhadas() {
        produtos = new ArrayList<Produto>();
    }
    
    public void addProduto(Produto produto) {
        produtos.add(produto);
    }
    
    public void removeProduto(Produto produto) {
        produtos.remove(produto);
    }
    
    public List<Produto> getProdutos() {
        return produtos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
}
