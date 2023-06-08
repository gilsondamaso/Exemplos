package classes;

public class Triaangulo {
    public double a;
    public double b;
    public double c;
    
    public double CalculoAreaTriangulo(){      
        double p = (a + b + c)/ 2.0;
        return Math.sqrt(p * (p-a) * (p-b) * (p-c)) ;
    }
}


