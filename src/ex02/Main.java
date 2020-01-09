package ex02;

public class Main 
{
	public static void main (String[] args)
	{
		Carro carro1;
		carro1 = new Carro("Prisma", 50, 5, 200f, "Ford", 4, 2015);
		
		Aviao aviao1;
		aviao1 = new Aviao("747 Duplo", 1500, 300, 1000f, "Grande", "Transporte");
		
		carro1.statusCarro();
		System.out.println("");
		aviao1.statusAviao();
		
		/*
		carro1.setModelo("Prisma");
		carro1.setVelocidade(50);
		carro1.setPassageiros(5);
		carro1.setCombustivel(200);
		carro1.setMarca("Ford");
		carro1.setPortas(4);
		carro1.setAno(2015);
		
		aviao1.setModelo("747 Duplo");
		aviao1.setVelocidade(1500);
		aviao1.setPassageiros(300);
		aviao1.setCombustivel(1000);
		aviao1.setTipo("Grande");
		aviao1.setUso("Transporte");
		
		System.out.println("Informações sobre o carro: ");
		System.out.println("Modelo é " + carro1.getModelo() + ".");
		System.out.println("A velocidade máxima dele é de " + carro1.getVelocidade() + " Km/h.");
		System.out.println("Numero de passageiros é de " + carro1.getPassageiros() + " pessoas.");
		System.out.println("Quantidade máxima de combustível é de " + carro1.getCombustivel() + " litros.");
		System.out.println("A marca dele é " + carro1.getMarca() + ".");
		System.out.println("Ele possui " + carro1.getPortas() + " portas.");
		System.out.println("Ele é do ano de " + carro1.getAno() + ".");
		
		System.out.println("\nInformações sobre o avião: ");
		System.out.println("Modelo é " + aviao1.getModelo() + ".");
		System.out.println("A velocidade máxima dele é de " + aviao1.getVelocidade() + " Km/h.");
		System.out.println("Numero de passageiros é de " + aviao1.getPassageiros() + " pessoas.");
		System.out.println("Quantidade máxima de combustível é de " + aviao1.getCombustivel() + " litros.");
		System.out.println("O tipo dele é " + aviao1.getTipo() + ".");
		System.out.println("Seu uso é para " + aviao1.getUso() + ".");*/
		
	}
}