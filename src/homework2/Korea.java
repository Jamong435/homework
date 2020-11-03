package homework2;

public class Korea {

	int SGI; //semiconductor growth index 반도체 성장지수 
	long TS; //train speed 기차 최대속력
	boolean Dockdo; //독도유무
	
	public Korea(int sGI, long tS, boolean dockdo) {
		super();
		SGI = sGI;
		TS = tS;
		Dockdo = dockdo;
	}
	public int getSGI() {
		return SGI;
	}
	public void setSGI(int sGI) {
		SGI = sGI;
	}
	public long getTS() {
		return TS;
	}
	public void setTS(long tS) {
		TS = tS;
	}
	public boolean isDockdo() {
		return Dockdo;
	}
	public void setDockdo(boolean dockdo) {
		Dockdo = dockdo;
	}
	
	
	
	
	
}
