package ex02;

public class Aviao extends Veiculo
{
	
	public Aviao(String modelo, int velocidade, int passageiros, float combustivel, String tipo, String uso) {
		super(modelo, velocidade, passageiros, combustivel);
		this.tipo = tipo;
		this.uso = uso;
	}

	private String tipo;
	private String uso;
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getUso() {
		return uso;
	}
	public void setUso(String uso) {
		this.uso = uso;
	}
	
	public void statusAviao()
	{
		this.statusVeiculo();
		System.out.println("O tipo dele é " + this.getTipo() + ".");
		System.out.println("Seu uso é para " + this.getUso() + ".");
	}
	
}
