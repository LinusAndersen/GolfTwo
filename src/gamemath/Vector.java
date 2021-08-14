package gamemath;

public class Vector {
	final double x;
	final double y;

	public Vector(){
		this.x = 0;
		this.y = 0;

	}

	public Vector(double x, double y){
		this.x = x;
		this.y = y;
	}

	public Vector add(Vector other){
		return new Vector(x + other.x, y + other.y);

	}

	public Vector sub(Vector other){
		return new Vector(x - other.x, y - other.y);

	}

	public Vector scale(double scale){
		return new Vector(x * scale, y * scale);

	}
}
