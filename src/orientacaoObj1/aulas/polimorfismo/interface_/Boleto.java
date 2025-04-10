package aulas.polimorfismo.interface_;

public class Boleto implements Pagavel{
    
    private String beneficiario;
    private double valorPagar;

    public Boleto(String beneficiario, double valorPagar) {
        setBeneficiario(beneficiario);
        setValorPagar(valorPagar);
    }
    
    public String getBeneficiario() {
        return beneficiario;
    }

    public void setBeneficiario(String beneficiario) {
        this.beneficiario = beneficiario;
    }

    public double getValorPagar() {
        return valorPagar;
    }

    public void setValorPagar(double valorPagar) {
        if (valorPagar >= 0){
            this.valorPagar = valorPagar;
        }
    }
    
    @Override
    public String getDescricao(){
        return getBeneficiario();
    }
    
    @Override
    public double getValor(){
        return getValorPagar();
    }
    
}
