package calculadora.Bases;

/**
 *
 * @author kevin
 */
public abstract class Calculadora {
    protected int A;
    protected int B;
    protected int resultado;
    protected int base;

    public int getA() {
        return A;
    }

    public void setA(int A) {
        this.A = A;
    }

    public int getB() {
        return B;
    }

    public void setB(int B) {
        this.B = B;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    
    public abstract String mostrarResultado();
    
    public abstract String mostrarA();
    
    public abstract String mostrarB();
    
    public void setA(String valor){
        this.setA(Integer.parseInt(valor, this.base));
    }
    
    public void setB(String valor){
        this.setB(Integer.parseInt(valor, this.base));
    }
    
    public void sumar(){
        this.resultado = this.A + this.B;
    }
    
    public void restar(){
        this.resultado = this.A - this.B;
    }
    
    public void multiplicar(){
        this.resultado = this.A * this.B;
    }
    
    public void dividir(){
        this.resultado = this.A / this.B;
    }
}
