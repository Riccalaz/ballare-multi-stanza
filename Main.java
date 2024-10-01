package discotecam;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		
		System.out.print("inserisci n di gruppi: ");
		
		int T = myObj.nextInt(); //inserimento numero di thread
		thread[] th=new thread[T]; //arrey di thread
		cp c=new cp();
		
		for(int i=0;i<T;i++){
			th[i]= new thread(c);
			th[i].start();
		}
		
		while(true) {
			System.out.println("pesone in discoteca: 1)"+c.getc(0)+" 2)"+c.getc(1)+" 3)"+c.getc(2)+" 4)"+c.getc(3)); //stmpo a schermo il numero di persone presente in ogni stanza
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
