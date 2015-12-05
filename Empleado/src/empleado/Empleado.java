import java.util.Scanner;

public class Empleado
{
    Scanner dato = new Scanner(System.in);
    String Nombre = dato.nextLine();
    String Apellido = dato.nextLine();
    double Salario = dato.nextInt();
    
    double Incremento()
    {
        return Salario+(Salario*0.1);
    }
    double Incremento2()
    {
        return (Salario+(Salario*0.1))+(Salario*0.1);
    }
    double Incremento3()
    {
        return ((Salario+(Salario*0.1))+(Salario*0.1))+(Salario*0.1);
    }
    double Incremento4()
    {
        return (((Salario+(Salario*0.1))+(Salario*0.1))+(Salario*0.1))+(Salario*0.1);
    }
    double Incremento5()
    {
        return ((((Salario+(Salario*0.1))+(Salario*0.1))+(Salario*0.1))+(Salario*0.1))+(Salario*0.1);
    }
}
