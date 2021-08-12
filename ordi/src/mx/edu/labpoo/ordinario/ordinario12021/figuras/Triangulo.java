package figuras;
import figuras.Figura;
public class Triangulo extends Figura{
    private final int lado1;
    private final int lado2;
    private final int lado3;
 
    public Triangulo(int lado1,int lado2,int lado3) {
        //lado1 = Base lado2 = Altura
        super(lado1,lado2);
        this.lado1 = base;
        this.lado2= altura;
        this.lado3 = lado3;
    }
    public float CalculArarea(){
        int area=(lado1*lado2)/2;
        return area;
    }
    public float caluclarPerimetro(){
        int perimetro=lado1+lado2+lado3;
        return perimetro;
    }
    public String toString(){
        
        return super.toString()+"Triangulo Area:"+area+"Perimetro:"+perimetro+"Lados:"+lado1+""+lado2+""+lado3;
    }
}
