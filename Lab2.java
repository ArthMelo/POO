package principal;
import java.util.*;

public class Funcionario {
	private String nome;
	private double salarioHora;
	private final int ID_FUNC;
	public static final double SALARIO_HORA_MINIMO = 12.50;
	private double horasTrabalhadasMes;
	
	public Funcionario(String name) {
		this.nome = name;
		this.ID_FUNC = getProximoID();
	}
	
	public Funcionario(String name, double _salarioHora) {
		this.nome = name;
		this.salarioHora = _salarioHora;
		this.ID_FUNC = getProximoID();
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public int getID() {
		return this.ID_FUNC;
	}
	
	public double getSalarioHora() {
		return this.salarioHora;
	}
	
	public double calculaSalarioMes() {
		return this.horasTrabalhadasMes * this.salarioHora;
	}
	
	public void reiniciaMesTrabalho() {
		
	}
	
	public void atualizaNome(String nome) {
		
	}
	
	public void atualizaSalarioHora(double salario) {
		
	}
	
	public int getProximoID() {
		return this.ID_FUNC;
	}
	
	public void adicionaDiaDeTrabalho(double horasTrabalhadas) {
		
	}

}
