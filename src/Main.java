
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FilaDeAtendimento fila = new FilaDeAtendimento();
		
		
		int atendidasC = 0;
		int atendidasR = 0;
		
		fila.inserePacientes();

	
		fila.percorreFilaC();

		System.out.println(" \n " );
		System.out.println(" \n " );
		System.out.println(" \n " );

		fila.getCoracao();

		fila.percorreFilaR();

		System.out.println(" \n " );
		System.out.println(" \n " );
		System.out.println(" \n " );

		fila.getRim();

		

		int coracoes = fila.getCoracao();
		int rins = fila.getRim();
		int contadorC = 0;
		int contadorR = 0;


		fila.inserePacientes();

		System.out.println("Faremos todas as operações possíveis no momento");
		
		System.out.println(" \n " );
		System.out.println(" \n " );
		System.out.println(" \n " );


		while(coracoes > 0){
			contadorC++;
			coracoes--;
			atendidasC++;
			fila.removeFilaC();

		}

		System.out.println("Pessoas restantes na fila dos corações: ");
		fila.percorreFilaC();


		while(rins > 0) {
			contadorR++;
			rins--;
			fila.removeFilaR();
			atendidasR++;
		}
		System.out.println(" \n " );
		System.out.println(" \n " );
		System.out.println(" \n " );

		System.out.println("Pessoas restantes na fila dos rins: ");
		fila.percorreFilaR();
		
		int atendidas = atendidasC + atendidasR;
		
		System.out.println("Pessoas atendidas: \n" + "Coração:" + atendidasC + "\n"+ "Rins:"
				+ atendidasR + "\n" + "Atendidas no total: " + atendidas);
	}
	


	}


