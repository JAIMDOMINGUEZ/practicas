//agregar el paquete correspondiente

public class Rectangulo extends Figura {
   public Rectangulo(int base,int altura){
       super(base,altura);
   }
   public float CalculArarea(){
    int area=(lado1*lado2);
    return area;
    }
    public float calcularPerimetro(){
        int perimetro=(2*base+2*altura);
        return perimetro;
    }
    public String toString(){

        return super.toString()+"Rectangulo Area:"+area+"Perimetro:"+perimetro+"Base:"+getBase()+"Altura"+getAltura();
    }
    
}
