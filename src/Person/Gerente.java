package Person;

public class Gerente extends Funcionario{

    public Gerente(String nome, String email, String senha) {
        super(nome, email, senha, true);
    }

    @Override
    public Boolean getAdminStatus() {
        return super.getAdminStatus();
    }


    public void gerarRelatorioFinanceiro(Atendente atendente){
        System.out.println("Valor em caixa: " + atendente.getValorEmCaixa());
    }

    public void consultarVendas(Vendedor vendedor){

        System.out.println("Vendas totais: " + vendedor.getQtdVendas());
    }




}
