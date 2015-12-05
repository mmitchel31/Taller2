

public class EmpleadoTest
{
    public static void main(String[] args)
    {
        Empleado a = new Empleado();
        System.out.println("Empleado 1");
        System.out.println("Nombre: "+a.Nombre);
        System.out.println("Apellido: "+a.Apellido);
        System.out.println("Salario: "+a.Salario);
        System.out.printf("%n");
        
        Empleado b = new Empleado();
        System.out.println("Empleado 2");
        System.out.println("Nombre: "+b.Nombre);
        System.out.println("Apellido: "+b.Apellido);
        System.out.println("Salario: "+b.Salario);
        System.out.printf("%n");
        
        Empleado c = new Empleado();
        System.out.println("Empleado 3");
        System.out.println("Nombre: "+c.Nombre);
        System.out.println("Apellido: "+c.Apellido);
        System.out.println("Salario: "+c.Salario);
        System.out.printf("%n");
        
        Empleado d = new Empleado();
        System.out.println("Empleado 4");
        System.out.println("Nombre: "+d.Nombre);
        System.out.println("Apellido: "+d.Apellido);
        System.out.println("Salario: "+d.Salario);
        System.out.printf("%n");
        
        Empleado e = new Empleado();
        System.out.println("Empleado 5");
        System.out.println("Nombre: "+e.Nombre);
        System.out.println("Apellido: "+e.Apellido);
        System.out.println("Salario: "+e.Salario);
        System.out.printf("%n");
        
        System.out.println("Empleado 1: "+a.Nombre);
        System.out.println("Salario proximo año: "+(a.Incremento()));
        System.out.println("Salario proximos 2 años: "+(a.Incremento2()));
        System.out.println("Salario proximos 3 años: "+(a.Incremento3()));
        System.out.println("Salario proximos 4 años: "+(a.Incremento4()));
        System.out.println("Salario proximos 5 años: "+(a.Incremento5()));
        System.out.printf("%n");
        
        System.out.println("Empleado 2: "+b.Nombre);
        System.out.println("Salario proximo año: "+(b.Incremento()));
        System.out.println("Salario proximos 2 años: "+(b.Incremento2()));
        System.out.println("Salario proximos 3 años: "+(b.Incremento3()));
        System.out.println("Salario proximos 4 años: "+(b.Incremento4()));
        System.out.println("Salario proximos 5 años: "+(b.Incremento5()));
        System.out.printf("%n");
        
        System.out.println("Empleado 3: "+c.Nombre);
        System.out.println("Salario proximo año: "+(c.Incremento()));
        System.out.println("Salario proximos 2 años: "+(c.Incremento2()));
        System.out.println("Salario proximos 3 años: "+(c.Incremento3()));
        System.out.println("Salario proximos 4 años: "+(c.Incremento4()));
        System.out.println("Salario proximos 5 años: "+(c.Incremento5()));
        System.out.printf("%n");
        
        System.out.println("Empleado 4: "+d.Nombre);
        System.out.println("Salario proximo año: "+(d.Incremento()));
        System.out.println("Salario proximos 2 años: "+(d.Incremento2()));
        System.out.println("Salario proximos 3 años: "+(d.Incremento3()));
        System.out.println("Salario proximos 4 años: "+(d.Incremento4()));
        System.out.println("Salario proximos 5 años: "+(d.Incremento5()));
        System.out.printf("%n");
        
        System.out.println("Empleado 5: "+e.Nombre);
        System.out.println("Salario proximo año: "+(e.Incremento()));
        System.out.println("Salario proximos 2 años: "+(e.Incremento2()));
        System.out.println("Salario proximos 3 años: "+(e.Incremento3()));
        System.out.println("Salario proximos 4 años: "+(e.Incremento4()));
        System.out.println("Salario proximos 5 años: "+(e.Incremento5()));
        
    }
}
