package br.com.jvcardoso.curso.resources.exceptions;

import java.io.Serializable;
import java.time.Instant;

public class ErroPadrao implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Instant timeStamp;
	private Integer status;
	private String erro;
	private String menssagem;
	private String path;
	
	public ErroPadrao() {
		
	}

	public ErroPadrao(Instant timeStamp, Integer status, String erro, String menssagem, String path) {
		super();
		this.timeStamp = timeStamp;
		this.status = status;
		this.erro = erro;
		this.menssagem = menssagem;
		this.path = path;
	}

	public Instant getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Instant timeStamp) {
		this.timeStamp = timeStamp;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getErro() {
		return erro;
	}

	public void setErro(String erro) {
		this.erro = erro;
	}

	public String getMenssagem() {
		return menssagem;
	}

	public void setMenssagem(String menssagem) {
		this.menssagem = menssagem;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	
	
	
	
	

}
