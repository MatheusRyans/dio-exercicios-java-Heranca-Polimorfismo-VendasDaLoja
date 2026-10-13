package Person;

public class Vendedor extends Funcionario {

    private int qtdVendas;

    public Vendedor(String nome, String email, String senha, int qtdVendas) {
        super(nome, email, senha, false);
        this.qtdVendas = qtdVendas;
    }

    public int getQtdVendas() {
        return qtdVendas;
    }

    public void setQtdVendas(int qtdVendas) {
        this.qtdVendas = qtdVendas;
    }

    @Override
    public Boolean getAdminStatus() {
        return super.getAdminStatus();
    }

    public void realizarVenda(){
        this.qtdVendas ++;
    }

    public int consultarVenda(){
        return this.qtdVendas;
    }



}
