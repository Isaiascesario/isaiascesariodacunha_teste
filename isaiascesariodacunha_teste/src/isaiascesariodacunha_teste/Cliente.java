package isaiascesariodacunha_teste;

public class Cliente {
	private int idCustomer, isActive;
	private String cpfCnpj, nome;
	private double vlTotal;
	
	public Cliente(int ic,String cpf,String nome,int ia,double vltotal) {
		this.idCustomer = ic;
		this.isActive = ia;
		this.cpfCnpj = cpf;
		this.nome = nome;
		this.vlTotal = vltotal;
	}
	public int getIdCustomer() {
		return idCustomer;
	}
	public void setIdCustomer(int idCustomer) {
		this.idCustomer = idCustomer;
	}
	public int getIsActive() {
		return isActive;
	}
	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}
	public String getCpfCnpj() {
		return cpfCnpj;
	}
	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getVlTotal() {
		return vlTotal;
	}
	public void setVlTotal(double vlTotal) {
		this.vlTotal = vlTotal;
	}
	@Override
	public String toString() {
		return "Cliente [idCustomer=" + idCustomer + ", isActive=" + isActive + ", cpfCnpj=" + cpfCnpj + ", nome="
				+ nome + ", vlTotal=" + vlTotal + "]";
	}
	
	
}
