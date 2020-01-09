package ex02;

public abstract class Veiculo 
{
	private String modelo;
	private int velocidade;
	private int passageiros;
	private float combustivel;
	
	public Veiculo(String modelo, int velocidade, int passageiros, float combustivel) {
		super();
		this.modelo = modelo;
		this.velocidade = velocidade;
		this.passageiros = passageiros;
		this.combustivel = combustivel;
	}
	
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	public int getPassageiros() {
		return passageiros;
	}
	public void setPassageiros(int passageiros) {
		this.passageiros = passageiros;
	}
	public float getCombustivel() {
		return combustivel;
	}
	public void setCombustivel(float combustivel) {
		this.combustivel = combustivel;
	}
	
	public void statusVeiculo()
	{
		System.out.println("Modelo � " + this.getModelo() + ".");
		System.out.println("A velocidade m�xima dele � de " + this.getVelocidade() + " Km/h.");
		System.out.println("Numero de passageiros � de " + this.getPassageiros() + " pessoas.");
		System.out.println("Quantidade m�xima de combust�vel � de " + this.getCombustivel() + " litros.");
	}
}