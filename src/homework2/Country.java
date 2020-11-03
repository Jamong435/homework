package homework2;

public class Country extends Person {
	
	
	private String Cn;//Country Name 나라이름
	private String Nf; // national flag 자신의나라국기
	private String Cp; //country position 자신의나라위치
	private Long Pn; //population number 자신의나라 인구수
	private Long Cs; //country size 나라크기
	private int GDP; //개인 GDP
	private int Corona; //코로나 감염자 수
	private float Tex; // 세율
	
	
	public Country(String name, String phone, String gender, String address, String email, int age, int height,
			boolean corona, String cn, String nf, String cp, Long pn, Long cs, int gDP, int corona2, float tex) {
		super(name, phone, gender, address, email, age, height, corona);
		Cn = cn;
		Nf = nf;
		Cp = cp;
		Pn = pn;
		Cs = cs;
		GDP = gDP;
		Corona = corona2;
		Tex = tex;
	}
	public String getCn() {
		return Cn;
	}
	public void setCn(String cn) {
		Cn = cn;
	}
	public String getNf() {
		return Nf;
	}
	public void setNf(String nf) {
		Nf = nf;
	}
	public String getCp() {
		return Cp;
	}
	public void setCp(String cp) {
		Cp = cp;
	}
	public Long getPn() {
		return Pn;
	}
	public void setPn(Long pn) {
		Pn = pn;
	}
	public Long getCs() {
		return Cs;
	}
	public void setCs(Long cs) {
		Cs = cs;
	}
	public int getGDP() {
		return GDP;
	}
	public void setGDP(int gDP) {
		GDP = gDP;
	}
	public int getCorona() {
		return Corona;
	}
	public void setCorona(int corona) {
		Corona = corona;
	}
	public float getTex() {
		return Tex;
	}
	public void setTex(float tex) {
		Tex = tex;
	}
	
	
	
	
}
