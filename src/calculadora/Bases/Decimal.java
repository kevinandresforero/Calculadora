package calculadora.Bases;

/**
 *
 * @author kevin
 */
public class Decimal extends Calculadora{
    public Decimal() {
        this.base = 10;
    }
    
    @Override
    public String mostrarResultado(){
        return String.valueOf(super.getResultado());
    }
    
    @Override
    public String mostrarA() {
        return String.valueOf(super.getA());
    }

    @Override
    public String mostrarB() {
        return String.valueOf(super.getB());
    }
}
