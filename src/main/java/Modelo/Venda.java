/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author thiag
 */
public class Venda {
    
 Integer id;
 Integer item;
  Integer IdCliente;
  Integer idFuncionario;
  Integer IdProduto;
  String numeroSerie;
  String descricao;
  String fechamento;
  Double preco;
  Integer quantidade;
  Double subtotal;
  Double montante;
  String estado;

    public Venda() {
    }

    public Venda(Integer id, Integer item, Integer IdCliente, Integer idFuncionario, Integer IdProduto, String numeroSerie, String descricao, String fechamento, Double preco, Integer quantidade, Double subtotal, Double montante, String estado) {
        this.id = id;
        this.item = item;
        this.IdCliente = IdCliente;
        this.idFuncionario = idFuncionario;
        this.IdProduto = IdProduto;
        this.numeroSerie = numeroSerie;
        this.descricao = descricao;
        this.fechamento = fechamento;
        this.preco = preco;
        this.quantidade = quantidade;
        this.subtotal = subtotal;
        this.montante = montante;
        this.estado = estado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getItem() {
        return item;
    }

    public void setItem(Integer item) {
        this.item = item;
    }

    public Integer getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(Integer IdCliente) {
        this.IdCliente = IdCliente;
    }

    public Integer getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(Integer idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public Integer getIdProduto() {
        return IdProduto;
    }

    public void setIdProduto(Integer IdProduto) {
        this.IdProduto = IdProduto;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getFechamento() {
        return fechamento;
    }

    public void setFechamento(String fechamento) {
        this.fechamento = fechamento;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    public Double getMontante() {
        return montante;
    }

    public void setMontante(Double montante) {
        this.montante = montante;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
          
          
}
