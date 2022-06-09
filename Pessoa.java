public abstract class Pessoa implements Valor {
    private int cpf;
    protected Atividades[] vetorAtividades;
    
    public int getCpf() {
        return cpf;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }    
}
