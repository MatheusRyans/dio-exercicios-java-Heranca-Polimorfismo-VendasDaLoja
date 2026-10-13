package Person;

public class Atendente extends Funcionario{

    private double valorEmCaixa;

    public Atendente(String nome, String email, String senha, double valorEmCaixa) {
        super(nome, email, senha, false);
        this.valorEmCaixa = valorEmCaixa;
    }

    public double getValorEmCaixa() {
        return valorEmCaixa;
    }

    public void setValorEmCaixa(double valorEmCaixa) {
        this.valorEmCaixa = valorEmCaixa;
    }

    @Override
    public Boolean getAdminStatus() {
        return super.getAdminStatus();
    }

    public void receberPagamento(double pagamento){
        this.valorEmCaixa += pagamento;
    }

    public boolean fecharCaixa(){
        return true;
    }
}
