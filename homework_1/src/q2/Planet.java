package q2;

public class Planet {
	private String name;
	private double distance,gravity;
	
	public Planet(String name, double distance, double gravity) {
		this.name = name;
		this.distance = distance;
		this.gravity = gravity;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getDistance() {
		return distance;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}
	public double getGravity() {
		return gravity;
	}
	public void setGravity(double gravity) {
		this.gravity = gravity;
	}
	
	@Override
	public String toString() {
		return "Planet [distance=" + distance + ", gravity=" + gravity + ", name=" + name + "]";
	}
	
	
}
