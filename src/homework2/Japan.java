package homework2;

public class Japan extends Country {

	String Location; // 관광지
	String JPfd; //일본 음식
	String JPCT; //일본 기모노
	public Japan(String name, String phone, String gender, String address, String email, int age, int height,
			boolean corona, String cn, String nf, String cp, Long pn, Long cs, int gDP, int corona2, float tex,
			String location, String jPfd, String jPCT) {
		super(name, phone, gender, address, email, age, height, corona, cn, nf, cp, pn, cs, gDP, corona2, tex);
		Location = location;
		JPfd = jPfd;
		JPCT = jPCT;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	public String getJPfd() {
		return JPfd;
	}
	public void setJPfd(String jPfd) {
		JPfd = jPfd;
	}
	public String getJPCT() {
		return JPCT;
	}
	public void setJPCT(String jPCT) {
		JPCT = jPCT;
	}
	
	
	
	
	
}
