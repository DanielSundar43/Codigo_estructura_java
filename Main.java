import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int opcion;
        
        do {
            System.out.println("\nSeleccione la figura geométrica para calcular área y perímetro:");
            System.out.println("1. Círculo");
            System.out.println("2. Rectángulo");
            System.out.println("3. Cuadrado");
            System.out.println("4. Triángulo Rectángulo");
            System.out.println("5. Salir");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el radio del círculo (cm): ");
                    double radio = scanner.nextDouble();
                    
                    FigurasGeometricas circulo = new FigurasGeometricas(radio, "Circulo");
                    circulo.calcularAreaCirculo();
                    circulo.calcularPerimetroCirculo();
                    circulo.mostrarCirculo();
                    break;
                    
                case 2:
                    System.out.print("Ingrese la base del rectángulo (cm): ");
                    double baseRect = scanner.nextDouble();
                    System.out.print("Ingrese la altura del rectángulo (cm): ");
                    double alturaRect = scanner.nextDouble();
                    
                    FigurasGeometricas rectangulo = new FigurasGeometricas(baseRect, alturaRect, "Rectangulo");
                    rectangulo.calcularAreaRectangulo();
                    rectangulo.calcularPerimetroRectangulo();
                    rectangulo.mostrarRectangulo();
                    break;
                    
                case 3:
                    System.out.print("Ingrese el lado del cuadrado (cm): ");
                    double ladoCuad = scanner.nextDouble();
                    
                    FigurasGeometricas cuadrado = new FigurasGeometricas(ladoCuad);
                    cuadrado.calcularAreaCuadrado();
                    cuadrado.calcularPerimetroCuadrado();
                    cuadrado.mostrarCuadrado();
                    break;
                    
                case 4:
                    System.out.print("Ingrese la base del triángulo (cm): ");
                    double baseTri = scanner.nextDouble();
                    System.out.print("Ingrese la altura del triángulo (cm): ");
                    double alturaTri = scanner.nextDouble();
                    
                    FigurasGeometricas triangulo = new FigurasGeometricas(baseTri, alturaTri, "Triangulo");
                    triangulo.calcularAreaTriangulo();
                    triangulo.calcularPerimetroTriangulo();
                    triangulo.determinarTipoTriangulo();
                    triangulo.mostrarTriangulo();
                    break;
                    
                case 5:
                    System.out.println("\n¡Gracias por usar el programa!");
                    break;
                    
                default:
                    System.out.println("\nOpción inválida. Intente de nuevo.");
                    break;
            }
            
        } while (opcion != 5);
        
        scanner.close();
    }
}