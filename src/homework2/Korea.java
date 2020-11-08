package homework2;

public class Korea extends Country {

	int SGI; //semiconductor growth index 반도체 성장지수 
	long TS; //train speed 기차 최대속력
	boolean Dockdo; //독도유무
	
	public Korea(String name, String phone, String gender, String address, String email, int age, int height,
			boolean corona, String cn, String nf, String cp, Long pn, Long cs, int gDP, int corona2, float tex, int sGI,
			long tS, boolean dockdo) {
		super(name, phone, gender, address, email, age, height, corona, cn, nf, cp, pn, cs, gDP, corona2, tex);
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
