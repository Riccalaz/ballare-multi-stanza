package discotecam;

public class cp {
	private int[] c;
	
	public cp() {
		c=new int[4];
	}
	
	public synchronized void entra(int n,int i){
		 c[i]+=n;
	}

	public synchronized void esce(int n,int i) {
		c[i]-=n;
	}
	
	public int getc(int i) {
		return c[i];
	}

}
