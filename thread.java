package discotecam;

import java.util.Random;


public class thread extends Thread{
	private cp contatore;
	private int npersone;
	private int stanza;  //attributo che tiene il numero della stanza una volta entrati
	
	public thread(cp c){
		contatore=c;
		
		Random ran = new Random();
		
		npersone=ran.nextInt(10)+1;
		stanza=-1;
	}


public void run() {
	
	Random ran = new Random();
	System.out.println("persone nel gruppo: "+npersone);
	
	while(true) {
		stanza=ran.nextInt(4);  //numero casuale di stanza in cui entrerà il gruppo
		contatore.entra(npersone,stanza); //metodo che aggiunge in numero di persone al contatore corretto
		try {
			Thread.sleep(ran.nextInt(1000)+100); //attesa di un numero casuale di millisecondi
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		contatore.esce(npersone,stanza);
		try {
			Thread.sleep(ran.nextInt(1000)+100);  //attesa di un numero casuale di millisecondi
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
}
