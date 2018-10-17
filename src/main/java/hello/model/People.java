package hello.model;

public class People {
	private int id;
	private String name, city;
	
	public People() {
		
	}
	
	public People(int id, String name, String city) {
		this.id = id;
		this.name = name;
		this.city = city;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		return String.format(
				"People information [id='%d', name='%s', city='%s']",id,name,city);
	}
}
