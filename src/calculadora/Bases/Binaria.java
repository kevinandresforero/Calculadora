package calculadora.Bases;

/**
 *
 * @author kevin
 */
public class Binaria extends Calculadora{
    
    public Binaria() {
        this.base = 2;
    }
    
    @Override
    public String mostrarResultado(){
        return Integer.toBinaryString(super.getResultado());
    }
    
    @Override
    public String mostrarA() {
        return Integer.toBinaryString(super.getA());
    }

    @Override
    public String mostrarB() {
        return Integer.toBinaryString(super.getB());
    } 
}
