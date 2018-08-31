package calculadora.Bases;

/**
 *
 * @author kevin
 */
public class Hexadecimal extends Calculadora{
    public Hexadecimal() {
        this.base = 16;
    }
    
    @Override
    public String mostrarResultado(){
        return Integer.toHexString(super.getResultado());
    }
    
    @Override
    public String mostrarA() {
        return Integer.toHexString(super.getA());
    }

    @Override
    public String mostrarB() {
        return Integer.toHexString(super.getB());
    }
}
