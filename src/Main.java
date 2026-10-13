import Person.Atendente;
import Person.Funcionario;
import Person.Gerente;
import Person.Vendedor;

import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner sc = new Scanner(System.in);

    Gerente gerente = new Gerente("Matheus", "matheus@email.com","123");
    Atendente atendente = new Atendente("Ana","ana@email.com", "123", 0.0);
    Vendedor vendedor = new Vendedor("Jorge", "jorge@email.com", "123", 0);

    vendedor.getAdminStatus();
    vendedor.realizarVenda();
    vendedor.realizarVenda();
    vendedor.realizarVenda();
    vendedor.realizarVenda();
    System.out.println(vendedor.consultarVenda());
    System.out.println("--------------");
    gerente.consultarVendas(vendedor);
    System.out.println("--------------");
    atendente.getValorEmCaixa();
    atendente.receberPagamento(200);
    atendente.receberPagamento(500);
    atendente.receberPagamento(700);
    atendente.receberPagamento(200);
    System.out.println(atendente.getValorEmCaixa());
    System.out.println("---------------");
    gerente.gerarRelatorioFinanceiro(atendente);





}
