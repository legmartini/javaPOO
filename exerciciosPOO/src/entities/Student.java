package entities;

public class Student {
	
	public String name;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double media() {
		return (nota1 + nota2 + nota3);
	}
	public double missed() {
		return (media() - 60) * -1;
	}
}
