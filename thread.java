package discotecam;

import java.util.Random;


public class thread extends Thread{
	private cp contatore;
	private int npersone;
	private int stanza;
	
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
		stanza=ran.nextInt(4);
		contatore.entra(npersone,stanza);
		try {
			Thread.sleep(ran.nextInt(1000)+100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		contatore.esce(npersone,stanza);
		try {
			Thread.sleep(ran.nextInt(1000)+100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
}