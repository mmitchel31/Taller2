import java.util.Scanner;

public class RectangleArea
{
    public static void main(String[] args)
    {   
        Scanner dato = new Scanner(System.in);
        double xb;
        double yb;
        double xc;
        double yc;
        double xd;
        double yd;
        double xe;
        double ye;
        double xf;
        double yf;
        double xg;
        double yg;
        double xh;
        double yh;
        double xj;
        double yj;
        double xk;
        double yk;
        
        Rectangle a = new Rectangle();
        System.out.println("Rectangulo 1");
        a.Largo = 1;
        a.Ancho = 1;
        System.out.println("Area: "+(a.Area())+"   Perimetro: "+(a.Perimetro()));
        System.out.printf("%n");

        Rectangle b = new Rectangle();
        System.out.println("Rectangulo 2");
        System.out.printf("Largo: ");
        b.Largo = xb = dato.nextInt();
        System.out.printf("Ancho: ");
        b.Ancho = yb = dato.nextInt();
        System.out.println("Area: "+(b.Area())+"   Perimetro: "+(b.Perimetro()));
        System.out.printf("%n");
        
        Rectangle c = new Rectangle();
        System.out.println("Rectangulo 3");
        System.out.printf("Largo: ");
        c.Largo = xc = dato.nextInt();
        System.out.printf("Ancho: ");
        c.Ancho = yc = dato.nextInt();
        System.out.println("Area: "+(c.Area())+"   Perimetro: "+(c.Perimetro()));
        System.out.printf("%n");
        
        Rectangle d = new Rectangle();
        System.out.println("Rectangulo 4");
        System.out.printf("Largo: ");
        d.Largo = xd = dato.nextInt();
        System.out.printf("Ancho: ");
        d.Ancho = yd = dato.nextInt();
        System.out.println("Area: "+(d.Area())+"   Perimetro: "+(d.Perimetro()));
        System.out.printf("%n");
        
        Rectangle e = new Rectangle();
        System.out.println("Rectangulo 5");
        System.out.printf("Largo: ");
        e.Largo = xe = dato.nextInt();
        System.out.printf("Ancho: ");
        e.Ancho = ye = dato.nextInt();
        System.out.println("Area: "+(e.Area())+"   Perimetro: "+(e.Perimetro()));
        System.out.printf("%n");
        
        Rectangle f = new Rectangle();
        System.out.println("Rectangulo 6");
        System.out.printf("Largo: ");
        f.Largo = xf = dato.nextInt();
        System.out.printf("Ancho: ");
        f.Ancho = yf = dato.nextInt();
        System.out.println("Area: "+(f.Area())+"   Perimetro: "+(f.Perimetro()));
        System.out.printf("%n");
        
        Rectangle g = new Rectangle();
        System.out.println("Rectangulo 7");
        System.out.printf("Largo: ");
        g.Largo = xg = dato.nextInt();
        System.out.printf("Ancho: ");
        g.Ancho = yg = dato.nextInt();
        System.out.println("Area: "+(g.Area())+"   Perimetro: "+(g.Perimetro()));
        System.out.printf("%n");
        
        Rectangle h = new Rectangle();
        System.out.println("Rectangulo 8");
        System.out.printf("Largo: ");
        h.Largo = xh = dato.nextInt();
        System.out.printf("Ancho: ");
        h.Ancho = yh = dato.nextInt();
        System.out.println("Area: "+(h.Area())+"   Perimetro: "+(h.Perimetro()));
        System.out.printf("%n");
        
        Rectangle j = new Rectangle();
        System.out.println("Rectangulo 9");
        System.out.printf("Largo: ");
        j.Largo = xj = dato.nextInt();
        System.out.printf("Ancho: ");
        j.Ancho = yj = dato.nextInt();
        System.out.println("Area: "+(j.Area())+"   Perimetro: "+(j.Perimetro()));
        System.out.printf("%n");
        
        Rectangle k = new Rectangle();
        System.out.println("Rectangulo 10");
        System.out.printf("Largo: ");
        k.Largo = xk = dato.nextInt();
        System.out.printf("Ancho: ");
        k.Ancho = yk = dato.nextInt();
        System.out.println("Area: "+(k.Area())+"   Perimetro: "+(k.Perimetro()));
        System.out.printf("%n");
    
    }
}