


public class Room implements Resizable{

	
	
	
	private String type, wallType;
	private int doorsQuantity, length, width, area;
	
	public Room(String type, int doorsQuantity, int length, int width, String wallType) {
		this.type = type;
		this.doorsQuantity = doorsQuantity;
		this.length = length;
		this.width = width;
		this.wallType = wallType;
		this.area = length*width;
	}
	
	@Override
	public String toString() {
		return String.format("Area = " + this.area + ",  Wall-Type = " + this.wallType);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Room)) {
			return false;
		}
		Room e = (Room) obj;		
		return this.doorsQuantity == e.doorsQuantity && this.area == e.area && this.wallType == e.wallType;
	}

	public String compare(Object obj) {
		Room c = (Room) obj;
		if(this.area == c.area) {
			return "equal in area";
		}if(this.area < c.area) {
			return "smaller";
		}else {
			return "bigger";
		}
			
	}

	@Override
	public void resize(int height, int width) {
		// TODO Auto-generated method stub
		this.area = height*width;
	}

	@Override
	public void resize(Object obj) {
		// TODO Auto-generated method stub
		Room r = (Room) obj;
		this.area = r.area;
	}
	
	
}
