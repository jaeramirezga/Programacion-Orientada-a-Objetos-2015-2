public class Point2 {
	
	public static void main(String[] args) {
		
		Rectangulo a = new Rectangulo();
		System.out.println("El Area 1 es: "+ a.area() );
		System.out.println("El perimetro 1 es: "+ a.perimetro() + "\n");
		
		Rectangulo b = new Rectangulo();
		b.setLargo(13);
		b.setAncho(9);
		System.out.println("El Area 2 es: "+ b.area() );
		System.out.println("El perimetro 2 es: "+ b.perimetro() + "\n");
		
		Rectangulo c = new Rectangulo();
		c.setLargo(17);
		c.setAncho(3);
		System.out.println("El Area 3 es: "+ c.area() );
		System.out.println("El perimetro 3 es: "+ c.perimetro() + "\n");
		
		Rectangulo d = new Rectangulo();
		d.setLargo(1);
		d.setAncho(10);
		System.out.println("El Area 4 es: "+ d.area() );
		System.out.println("El perimetro 4 es: "+ d.perimetro() + "\n");
		
		Rectangulo e = new Rectangulo();
		e.setLargo(12);
		e.setAncho(15);
		System.out.println("El Area 5 es: "+ e.area() );
		System.out.println("El perimetro 5 es: "+ e.perimetro() + "\n");
		
		Rectangulo f = new Rectangulo();
		f.setLargo(2);
		f.setAncho(18);
		System.out.println("El Area 6 es: "+ f.area() );
		System.out.println("El perimetro 6 es: "+ f.perimetro() + "\n");
		
		Rectangulo g = new Rectangulo();
		g.setLargo(16);
		g.setAncho(15);
		System.out.println("El Area 7 es: "+ g.area() );
		System.out.println("El perimetro 7 es: "+ g.perimetro() + "\n");
		
		Rectangulo h = new Rectangulo();
		h.setLargo(11);
		h.setAncho(11);
		System.out.println("El Area 8 es: "+ h.area() );
		System.out.println("El perimetro 8 es: "+ h.perimetro() + "\n");
		
		Rectangulo i = new Rectangulo();
		i.setLargo(7);
		i.setAncho(14);
		System.out.println("El Area 9 es: "+ i.area() );
		System.out.println("El perimetro 9 es: "+ i.perimetro() + "\n");
		
		Rectangulo j = new Rectangulo();
		j.setLargo(18);
		j.setAncho(3);
		System.out.println("El Area 10 es: "+ j.area() );
		System.out.println("El perimetro 10 es: "+ j.perimetro() + "\n");
	}
}
