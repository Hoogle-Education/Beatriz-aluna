// criar a classe shape
// criar 4 variáveis para serem os lados do quadrilátero
// criar construtor seletivo
// método: retornar o perímetro da figura
// método: retornar área do quadrilátero baseado no seu modelo
// modelo será descoberto pelos contrutores

class Shape{
    
    //Atributos
    double lado1;
    double lado2;
    double lado3;
    double lado4;
    
    //Construtor
    public Shape(double lado1){
        this.lado1=lado1;
        lado2 = lado1;
        lado3 = lado1;
        lado4 = lado1;
    }
    
    
    public Shape(double lado1, double lado2){
        this.lado1=lado1;
        this.lado2=lado2;
        lado3=lado1;
        lado4=lado2;
    }

    public Shape(double lado1, double lado2, double lado3, double lado4){
        this.lado1=lado1;
        this.lado2=lado2;
        this.lado3=lado3;
        this.lado4=lado4;
    }

    //Métodos
    public double perimetro(){
        return lado1 + lado2 + lado3 + lado4;
    }

    public double area(){
        if(lado1 == lado3) return lado1*lado2;
        else {
            double sp = perimetro()/2;
            double area = (sp-lado1)*(sp-lado2)*(sp-lado3)*(sp-lado4);
            return Math.sqrt(area);
        }
    }

    @Override
    public String toString() {
        return "Shape [lado1=" + lado1 + ", lado2=" + lado2 + ", lado3=" + lado3 + ", lado4=" + lado4 + "]";
    }

}

public class App2 {
    public static void main(String[] args) {
        
        Shape forma1 = new Shape(3.0);
        Shape forma2 = new Shape(3.0, 5.0);
        Shape forma3 = new Shape(3.0, 6.0, 3.5, 6.0);

        System.out.println("area da forma 1: " + forma1.area());
        System.out.println("area da forma 2: " + forma2.area());
        System.out.println("area da forma 3: " + forma3.area());
        System.out.println(forma1);
        System.out.println(forma2);
    }
}
