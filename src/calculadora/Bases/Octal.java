package calculadora.Bases;

/**
 *
 * @author kevin
 */
public class Octal extends Calculadora{
    public Octal() {
        this.base = 8;
    }
    
    @Override
    public String mostrarResultado(){
        return Integer.toOctalString(super.getResultado());
    }
    
    @Override
    public String mostrarA() {
        return Integer.toOctalString(super.getA());
    }

    @Override
    public String mostrarB() {
        return Integer.toOctalString(super.getB());
}
}

