package gestaodeStocks;

public class Entrada_Armazem {

	public Entrada_Armazem() {
		// TODO Auto-generated constructor stub
	
	
	
	}
	public int id_entrada_armazem;
	public int id_armazem;
	public int id_produto;
	public int data_Entrada_Produto;
	public int quantidade;
	public int data_validade_produto;
	public int id_cod_fornecedor_armazem;
	
	public int getId_entrada_armazem() {
		return id_entrada_armazem;
	}
	public int getId_armazem() {
		return id_armazem;
	}
	public int getId_Produto() {
		return id_produto;
	}
	public int getData_Entrada_Produto() {
		return data_Entrada_Produto;
	}
	public int getData_validade_produto() {
		return data_validade_produto;
	}
	public int getId_cod_fornecedor_armazem() {
		return id_cod_fornecedor_armazem;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setId_entrada_armazem(int id_entrada_armazem) {
		this.id_entrada_armazem = id_entrada_armazem;
	}
	public void setId_armazem(int id_armazem) {
		this.id_armazem = id_armazem;
	}
	public void setId_produto(int id_produto) {
		this.id_produto = id_produto;
	}
	public void setData_Entrada_Produto(int data_Entrada_Produto) {
		this.data_Entrada_Produto = data_Entrada_Produto;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public void setData_validade_Produto(int data_validade_produto) {
		this.data_validade_produto = data_validade_produto;
	}
	public void setId_cod_fornecedor_armazem(int id_cod_fornecedor_armazem) {
		this.id_cod_fornecedor_armazem = id_cod_fornecedor_armazem;
	}
}
