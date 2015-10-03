
class Pair {
	double x, y;
	
	public Pair(double x, double y) {
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
	
	public double getDist1(Pair a, Pair b) {
		return Math.sqrt((a.x - b.x) * (a.x - b.x) + (a.y - b.y) * (a.y - b.y));
	}
	public double getDist2(Pair c, Pair d) {
		return Math.sqrt((c.x - d.x) * (c.x - d.x) + (c.y - d.y) * (c.y - d.y));
	}
	public double getHeight1(){
		return Math.sqrt((a.y - c.y)*(a.y - c.y));
	}
	public double getHeight2(){
		return Math.sqrt((b.y - d.y)*(b.y - d.y));
	}
}

class Square extends Quadrilateral {
	
	public Square(Pair sx, Pair sy, Pair sz, Pair sw) {
		super(sx, sy, sz, sw);
	}
	
	public double area() {
		double side = getDist1(p1, p2);
		return side * side;
	}

}

class Trapezoid extends Quadrilateral{
	
	public Trapezoid(Pair tx, Pair ty, Pair tz, Pair tw){
		super(tx,ty,tz,tw);
	}
	
	
	public double area() {
		double width1 = getDist1(p1, p2);
		double width2 = getDist2(p3, p4);
		double height = getHeight1;
		return (((width1)+(width2))*height)/2;
	}
	
}

class Parallelogram extends Quadrilateral{
	
	public Parallelogram(Pair px, Pair py, Pair pz, Pair pw){
		super(px,py,pz,pw);
	}
	
	public double area() {
		double width1 = getDist1(p1, p2);
		double height = getHeight1;
		return ((width1)*height);
	}
	
}