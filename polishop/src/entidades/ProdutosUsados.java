package entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutosUsados extends Produto {
		
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date dataDeFabricacao;
	
	public ProdutosUsados() {
		super();
	}
	public ProdutosUsados(String nome, double valor, Date dataDeFabricacao) {
		super(nome, valor);
		this.dataDeFabricacao = dataDeFabricacao;
	}
	
	public Date getDataDeFabricacao() {
		return dataDeFabricacao;
	}
	public void setDataDeFabricacao(Date dataDeFabricacao) {
		this.dataDeFabricacao = dataDeFabricacao;
	}
	
	public String toString() {
		return "Nome do produto: " + super.getNome() 
				+ "Preço do produto: " + super.getValor()
				+ "Data de fabricação: " + sdf.format(getDataDeFabricacao());
	}
}	

