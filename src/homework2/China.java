package homework2;

public class China extends Country {

	
	private String fd; //fine dust 미세먼지
	private String Ct; //cloning technology 복제기술
	private boolean GongYN; //중국만의공산주의
	
	//상속: 상속이란 자신의 부모클래스가 가지고있는 변수 및 메소드들의 특성을
	// 메소드들의 특성을 자신의 클래스 안으로 물려받는것입니다
	// 많은 클래스를 만들떄 중복되는 값이 있다면 부모클래스에 초기화를 시킨후
	// 자식클래스들에게 상속시킨다면 부모클래스 안에있는 특성을 공유 시킬수있습니다.
	// 그리고 또한 자식클래스는 자신의 특성을 따로 가질수 있습니다. 
	
	//상속받은 특성 자식클래스의 특성들은 getter와 setter로 인해서 모든 특성들은 value를 받을수있습니다
	
	public China(String name, String phone, String gender, String address, String email, int age, int height,
			boolean corona, String cn, String nf, String cp, Long pn, Long cs, int gDP, int corona2, float tex,
			String fd, String ct, boolean gongYN) {
		super(name, phone, gender, address, email, age, height, corona, cn, nf, cp, pn, cs, gDP, corona2, tex);
		this.fd = fd;
		Ct = ct;
		GongYN = gongYN;
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

	public boolean isGongYN() {
		return GongYN;
	}

	public void setGongYN(boolean gongYN) {
		GongYN = gongYN;
	}
	
	
	
	
}
