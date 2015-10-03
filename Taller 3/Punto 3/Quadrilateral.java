
class Pair {
	int x, y;
	
	public Pair(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
}



public class Quadrilateral {
	protected Pair p1, p2, p3, p4;
	
	public Quadrilateral(Pair a, Pair b, Pair c, Pair d) {
		p1 = a;
		p2 = b;
		p3 = c;
		p4 = d;
	}
	
	public double getDist(Pair a, Pair b) {
		return Math.sqrt((a.x - b.x) * (a.x - b.x) + (a.y - b.y) * (a.y - b.y));
	}
	
}

class Square extends Quadrilateral {
	
	public Square(Pair x, Pair y, Pair z, Pair w) {
		super(x, y, z, w);
	}
	
	public double area() {
		double side = getDist(p1, p2);
		return side * side;
	}

}