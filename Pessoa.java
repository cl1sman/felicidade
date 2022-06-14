public abstract class Pessoa implements Valor {
    private int cpf;
    protected Atividades[] vetorAtividades;
    
    abstract void setNoVetorDeAtividades(Atividades atividade);

    public int getCpf() {
        return cpf;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }    
}
