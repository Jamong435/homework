package homework2;

public class Japan extends Korea {

	String Location; // 관광지
	String sushi; //일본 음식
	String gimo; //일본 기모노
	public Japan(int sGI, long tS, boolean dockdo, String location, String sushi, String gimo) {
		super(sGI, tS, dockdo);
		Location = location;
		this.sushi = sushi;
		this.gimo = gimo;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	public String getSushi() {
		return sushi;
	}
	public void setSushi(String sushi) {
		this.sushi = sushi;
	}
	public String getGimo() {
		return gimo;
	}
	public void setGimo(String gimo) {
		this.gimo = gimo;
	}
	
	
	
}
