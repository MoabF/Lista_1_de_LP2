package atividade2_lp2;

import java.util.Scanner;
class Carro{
    private boolean dispovivel;
    private int id; 
    public Carro(){
        this.id = (int)(Math.random()*9999);
        this.dispovivel = true;
    }
    public void setDisponivel(boolean alugar){
        if(alugar == true){
            this.dispovivel = false;
        }
        else{
            this.dispovivel = true;
        }
    }
    public int getId(){
        return this.id;
    }
    public boolean getDisponivel() {
        return this.disponivel;
    }
}
class Cliente{
    private String cliente;
    public Cliente(){
        this.cliente = "";
    }
    public Cliente(String c){
        this.cliente = c;
    }
    
    public boolean getCliente() {
        return this.cliente;
    }
}
    
}
class Reserva{
    public Reservar(Cliente client, Carro car){
        if(car.getDisponivel() == true){
        car.setDisponivel(true);
        System.out.println("O carro, " + getId() + " foi alugado para o cliente, "+
                            client.getCliente() + "!");
        
        } 
        else{
            System.out.println("O carro, " + getId() + ", não está disponível");
        }
    }
}

public class questao_2_atv2
{
	public static void main(String[] args) {
	    Scanner entrada = Scanner(System.in);
	    String nome = "";
	    boolean alugar = false;
		System.out.println("Digite o nome do cliente:");
		nome = entrada.nextLine();
		Cliente cliente = new Cliente(nome);
		Carro carro = new Carro();
		Reserva reser;
		
		
	}
}