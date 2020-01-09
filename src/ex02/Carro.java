package ex02;

public class Carro extends Veiculo
{
	public Carro(String modelo, int velocidade, int passageiros, float combustivel, String ma, int po, int an)
	{
		super(modelo, velocidade, passageiros, combustivel);
		this.marca = ma;
		this.portas = po;
		this.ano = an;
	}
	private String marca;
	private int portas;
	private int ano;
	
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getPortas() {
		return portas;
	}
	public void setPortas(int portas) {
		this.portas = portas;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public void statusCarro()
	{
		this.statusVeiculo();
		System.out.println("A marca dele é " + this.getMarca() + ".");
		System.out.println("Ele possui " + this.getPortas() + " portas.");
		System.out.println("Ele é do ano de " + this.getAno() + ".");
	}
	
}
