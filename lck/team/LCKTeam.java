package team;

public class LCKTeam {
	private String tname;
	private String manager;
	private String coach;
	private String top;
	private String jungle;
	private String mid;
	private String adc;
	private String spt;
	
	public LCKTeam(
			String tname, 
			String manager, 
			String coach,
			String top,
			String jungle,
			String mid,
			String adc,
			String spt) {
		this.tname = tname;
		this.manager = manager;
		this.coach = coach;
		this.top = top;
		this.jungle = jungle;
		this.mid = mid;
		this.adc = adc;
		this.spt = spt;
	}
	
	public String getTname() {
		return tname;
	}
	
	public void setTname(String tname) {
		this.tname = tname;
	}
	
	public String getManager() {
		return manager;
	}
	
	public void setManager(String manager) {
		this.manager = manager;
	}
	
	public String getCoach() {
		return coach;
	}
	
	public void setCoach(String coach) {
		this.coach = coach;
	}
	
	public String getTop() {
		return top;
	}
	
	public void setTop(String top) {
		this.top = top;
	}
	
	public String getJungle() {
		return jungle;
	}
	
	public void setJungle(String jungle) {
		this.jungle = jungle;
	}
	public String getMid() {
		return mid;
	}
	
	public void setMid(String mid) {
		this.mid = mid;
	}
	
	public String getAdc() {
		return adc;
	}
	
	public void setAdc(String adc) {
		this.adc = adc;
	}
	
	public String getSpt() {
		return spt;
	}
	
	public void setSpt(String spt) {
		this.spt = spt;
	}
	
	public void displayInfo() {
		System.out.println("팀명:" + tname);
		System.out.println("감독:" + manager);
		System.out.println("코치:" + coach);
		System.out.println("탑:" + top);
		System.out.println("정글:" + jungle);
		System.out.println("미드:" + mid);
		System.out.println("원딜:" + adc);
		System.out.println("서포터:" + spt);
	}
}
