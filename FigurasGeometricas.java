public class FigurasGeometricas {
    
    double radio;
    double base, altura;
    double lado;
    double area, perimetro;
    String tipoFigura, tipoTriangulo;
    
    public FigurasGeometricas(double radio, String tipo) {
        if (tipo.equals("Circulo")) {
            this.radio = radio;
            this.tipoFigura = "Circulo";
        }
    }
    
    public FigurasGeometricas(double base, double altura, String tipo) {
        this.base = base;
        this.altura = altura;
        this.tipoFigura = tipo;
    }
    
    public FigurasGeometricas(double lado) {
        this.lado = lado;
        this.tipoFigura = "Cuadrado";
    }
    
    public double calcularAreaCirculo() {
        area = Math.PI * Math.pow(radio, 2);
        return area;
    }
    
    public double calcularPerimetroCirculo() {
        perimetro = 2 * Math.PI * radio;
        return perimetro;
    }
    
    public double calcularAreaRectangulo() {
        area = base * altura;
        return area;
    }
    
    public double calcularPerimetroRectangulo() {
        perimetro = 2 * (base + altura);
        return perimetro;
    }
    
    public double calcularAreaCuadrado() {
        area = Math.pow(lado, 2);
        return area;
    }
    
    public double calcularPerimetroCuadrado() {
        perimetro = 4 * lado;
        return perimetro;
    }
    
    public double calcularHipotenusa() {
        return Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
    }
    
    public double calcularAreaTriangulo() {
        area = (base * altura) / 2;
        return area;
    }
    
    public double calcularPerimetroTriangulo() {
        double hipotenusa = calcularHipotenusa();
        perimetro = base + altura + hipotenusa;
        return perimetro;
    }
    
    public String determinarTipoTriangulo() {
        double tolerancia = 0.0001;
        
        if (Math.abs(base - altura) < tolerancia) {
            tipoTriangulo = "Isósceles";
        } else {
            tipoTriangulo = "Escaleno";
        }
        
        return tipoTriangulo;
    }
    
    public void mostrarCirculo() {
        System.out.println("\nDatos del Círculo: ");
        System.out.println("Radio: " +String.format("%.1f", radio)+ " cm");
        System.out.println("Área: " +String.format("%.1f", area)+ " cm²");
        System.out.println("Perímetro: " +String.format("%.1f", perimetro)+ " cm");
    }
    
    public void mostrarRectangulo() {
        System.out.println("\nDatos del Rectángulo: ");
        System.out.println("Base: " +String.format("%.1f", base)+ " cm");
        System.out.println("Altura: " +String.format("%.1f", altura)+ " cm");
        System.out.println("Área: " +String.format("%.1f", area)+ " cm²");
        System.out.println("Perímetro: " +String.format("%.1f", perimetro)+ " cm");
    }
    
    public void mostrarCuadrado() {
        System.out.println("\nDats del Cuadrado: ");
        System.out.println("Lado: " +String.format("%.1f", lado)+ " cm");
        System.out.println("Área: " +String.format("%.1f", area)+ " cm²");
        System.out.println("Perímetro: " +String.format("%.1f", perimetro)+ " cm");
    }
    
    public void mostrarTriangulo() {
        System.out.println("\nDatos del Triángulo Rectángulo: ");
        System.out.println("Base: " +String.format("%.1f", base)+ " cm");
        System.out.println("Altura: " +String.format("%.1f", altura)+ " cm");
        System.out.println("Hipotenusa: " +String.format("%.1f", calcularHipotenusa())+ " cm");
        System.out.println("Área: " +String.format("%.1f", area)+ " cm²");
        System.out.println("Perímetro: " +String.format("%.1f", perimetro)+ " cm");
        System.out.println("Tipo de triángulo: " +tipoTriangulo);
    }
}