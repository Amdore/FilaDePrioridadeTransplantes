
public class Paciente implements Comparable<Paciente> {
	//nome , transpcor , transprim , prioridade, idade
	private String nome;
	private int prioridade;
	private Integer idade;
	private String transplante;
	private int comparar;
	
	public Paciente(String nome , String transplante, int prioridade , int idade ) {
		this.nome = nome;
		this.prioridade = prioridade;
		this.idade = idade;
		this.transplante = transplante;
		comparar = prioridade * 1000 + idade;
	}
	



	public int getComparar() {
		return comparar;
	}



	public void setComparar(int comparar) {
		this.comparar = comparar;
	}




	public String toString() {
		
		if(transplante.contains("Coracao")) {
			return "\n" + nome + " | " + "transplante de coracao necessario "+ " | " + prioridade  + " | " + idade;
		}else if(transplante.contains("Rim")) {
			return "\n" + nome + " | " + "transplante de rim necessario "+ " | " + prioridade  + " | " + idade;
		}else {
			return "erro";
		}
		
		
		
	}


	
		
//		o.setPrioridade(1);
//		
//		if(this.getPrioridade() < o.getPrioridade())
//			return -1;
//		
//		else if (this.equals(o.getPrioridade()))
//			return 0;
//	
//		else 
//			return 1;
//		}
	
	





	@Override
	public int compareTo(Paciente o) {
		// TODO Auto-generated method stub
		if(this.getComparar() == o.getComparar())
			return 0;
		else if(this.getComparar() > o.getComparar())
			return 1;
		else 
			return -1;
	}
}