package homework2;

public class China extends Country {

	
	private String fd; //fine dust 미세먼지
	private String Ct; //cloning technology 복제기술
	
	
	public China(String name, String phone, String gender, String address, String email, int age, int height,
			boolean corona, String cn, String nf, String cp, Long pn, Long cs, int gDP, int corona2, float tex) {
		super(name, phone, gender, address, email, age, height, corona, cn, nf, cp, pn, cs, gDP, corona2, tex);
		// TODO Auto-generated constructor stub
	}
	public String getFd() {
		return fd;
	}
	public void setFd(String fd) {
		this.fd = fd;
	}
	public String getCt() {
		return Ct;
	}
	public void setCt(String ct) {
		Ct = ct;
	}
	
	
	
	
	
}
