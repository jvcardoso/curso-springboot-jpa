package br.com.jvcardoso.curso.entities.enums;

public enum PedidoStatus {
	
	AGUARDANDO_PAGAMENTO(10),
	PAGO(20),
	ENVIADO(30),
	ENTREGUE(40),
	CANCELADO(99);
	
	private int codigo;
	
	private PedidoStatus(int codigo) {
		this.codigo = codigo;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public static PedidoStatus valueOf(int code) {
		for (PedidoStatus value : PedidoStatus.values()) {
			if (value.getCodigo() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Invalid PedidoStatus code");
	} 
}
