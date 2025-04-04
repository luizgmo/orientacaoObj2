package revisao;

public class Chave implements Emprestavel{
    private String armario;
    private boolean emprestado;

    public Chave(String armario) {
        setArmario(armario);
        setEmprestado(false);
    }

    public String getArmario() {
        return armario;
    }

    private void setArmario(String armario) {
        if (armario.charAt(0) == 'A'){
            this.armario = armario;
        }
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    private void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }
    
    public String getNomeObjeto(){
        return getArmario();
    }
    
    public boolean emprestar(){
        if (podeEmprestar()){
            setEmprestado(true);
            return true;
        } else{
            return false;
        }
    }
    
    public boolean devolver(){
        if (emprestado == true){
            setEmprestado(false);
            return true;
        } else{
            return false;
        }
    }
    
    public boolean podeEmprestar(){
        if (emprestado == true){
            return false;
        } else{
            return true;
        }
    }
}
