//agregar el paquete correspondiente
package figuras;

import jdk.nashorn.internal.ir.ReturnNode;

public abstract class Figura implements Comparable<Figura> {
    private int base;
    private int altura;
    protected int area;
    protected float perimetro;
    public Figura (int base,int altura){
        this.base = base;
        this.altura = altura;
    }
    public abstract void setArea();
    public abstract void setPerimetro();
    


    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    public float getArea() {
        return area;
    }

    public float getPerimetro() {
        return perimetro;
    }
    public abstract String toString();
    public int compareTo (Figura f1,Figura f2){
        
        int valor = this.compareTo(p);
        if (f1.equals(f2)) {
            return 0;
        }
        else{
            return f1.getArea()-f2.getArea();
        }
        
    }
    public boolean equals(Object o) {
        boolean resultado = false;
        if(o!= null && o instanceof Figura){
            Figura p = (Figura) o;
            if((base == p.base) && (altura == p.altura)){
                resultado = true;
            }
        }
        return resultado;
    }
    
    
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + this.base;
        hash = 17 * hash + this.altura;
        return hash;
    }



}
