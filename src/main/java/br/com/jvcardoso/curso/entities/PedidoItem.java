package br.com.jvcardoso.curso.entities;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnore;

import br.com.jvcardoso.curso.entities.pk.PedidoItemPK;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_pedido_item")
public class PedidoItem implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private PedidoItemPK id = new PedidoItemPK();
	
	private Integer quantidade;
	private Double valor;
	
	
	public PedidoItem() {
		
	}


	public PedidoItem(Pedido pedido, Produto produto, Integer quantidade, Double valor) {
		super();
		id.setPedido(pedido);
		id.setProduto(produto);
		this.quantidade = quantidade;
		this.valor = valor;
	}
	
	

	@JsonIgnore //caso nao colocar entra em looop
	public Pedido getPedido() {
		return id.getPedido();
	}

	public void setPedido(Pedido pedido) {
		id.setPedido(pedido);
	}
	
	
	public Produto getProduto() {
		return id.getProduto();
	}
	
	public void setProduto(Produto produto) {
		id.setProduto(produto);
	}
	/*
	public PedidoItemPK getId() {
		return id;
	}


	public void setId(PedidoItemPK id) {
		this.id = id;
	}
	*/

	public Integer getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}


	public Double getValor() {
		return valor;
	}


	public void setValor(Double valor) {
		this.valor = valor;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PedidoItem other = (PedidoItem) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	

}
