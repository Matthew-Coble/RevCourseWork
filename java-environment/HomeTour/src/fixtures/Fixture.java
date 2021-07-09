package fixtures;
//abstract

abstract public class Fixture {
	private String name;
	private String shortDes;
	private String longDes;
	
	public Fixture(String name, String shortDes, String longDes) {
		this.name = name;
		this.shortDes = shortDes;
		this.longDes = longDes;
		
	}
	
	public void setName (String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	
	public void setShortDes (String shortDes) {
		this.shortDes = shortDes;
	}
	public String getShortDes() {
		return this.shortDes;
	}
	
	public void setLongDes (String longDes) {
		this.longDes = longDes;
	}
	public String getLongDes() {
		return this.longDes;
	}
}
