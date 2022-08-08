import java.util.PriorityQueue;


public class FilaDeAtendimento {
	
	public PriorityQueue<Paciente> filaC = new PriorityQueue<Paciente>();
	public PriorityQueue<Paciente> filaR = new PriorityQueue<Paciente>();
	
	private int coracao = 4;
	private int rim = 7;
	
	
	
	
	
	public void inserePacientes() {
	
		Paciente jose = new Paciente("José de Almeida" , "Rim" ,0 ,25);
		Paciente ludmila = new Paciente("Ludmila dos Santos" ,"Coracao" ,2 ,40);
		Paciente wagner = new Paciente("Wagner Rodrigues" ,"Rim", 1 ,39);
		Paciente zuleica = new Paciente("Zuleica Braga","Coracao", 2 ,48);
		Paciente mauricio = new Paciente("Maurício da Costa", "Coracao", 8 ,70);
		Paciente carlos = new Paciente("Carlos de Assis" ,"Coracao", 9 ,78);
		
		
		Paciente moacir = new Paciente("Moacir Silveira " ,"Rim", 0 ,28);
		Paciente daniel = new Paciente("Daniel Pereira" ,"Rim", 1 ,31);
		
		
		
		Paciente daniele = new Paciente("Daniela Pêra" ,
				"Coracao", 1 ,34);
		Paciente daniela = new Paciente("Daniela Pinto" ,
				"Rim", 1 ,32);
		Paciente daniely = new Paciente("Daniely Pontes" ,
				"Rim", 1 ,38);
		Paciente danubio = new Paciente("Danúbio Passos" ,
				"Coracao", 2 ,42);
		Paciente danilo = new Paciente("Danilo Pinheiro" ,
				"Coracao", 4 ,50);
	

		Paciente dante = new Paciente("Dante Polonio" ,
				"Rim", 2 ,41);
		Paciente dorothy = new Paciente("Dorothy Pimentel" ,
				"Rim", 3 ,49);
		Paciente dmitri = new Paciente("Dmitri Petrov" ,
				"Rim", 2 ,31);
		Paciente fabio = new Paciente("Fabio Firmino" ,
				"Rim", 7 ,31);
		
		
		filaC.add(dorothy); 
		filaC.add(danilo);
		filaC.add(danubio);
		filaC.add(mauricio);
		filaC.add(daniele);
		filaC.add(carlos);
		filaC.add(ludmila);
		filaC.add(zuleica); 
		
		filaR.add(dante);
		filaR.add(daniely);
		filaR.add(daniela);
		filaR.add(dmitri);
		filaR.add(jose);
		filaR.add(wagner);
		filaR.add(moacir);
		filaR.add(daniel);
		filaR.add(fabio);

		
		
	}
	
	
	

	public int getCoracao() {
		return coracao;
	}

	public void setCoracao(int coracao) {
		this.coracao = coracao;
	}

	public int getRim() {
		return rim;
	}

	public void setRim(int rim) {
		this.rim = rim;
	}

	public void removeFilaC() {
		filaC.poll();
	}
	
	public void removeFilaR() {
		filaR.poll();
	}

	
	public void percorreFilaC() {
		while(!filaC.isEmpty()) {
			System.out.println(filaC.remove());
			
			
		}
	}
	
	public void percorreFilaR() {
		while(!filaR.isEmpty()) {
			System.out.println(filaR.remove());
		}
	}

}
