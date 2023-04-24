public class Comissionado extends Vendedor{
    private Double percComissao;

    public Double getPercComissao() {
        return percComissao;
    }

    public void setPercComissao(Double percComissao) {
        this.percComissao = percComissao;
    }

    public Comissionado(String cpf, String nome, Double salarioBase, int vendas, String cargo, Double percComissao) {
        super(cpf, nome, salarioBase, vendas, cargo);
        this.percComissao = percComissao;
    }

    public Double calcularSalario(){
        return super.getSalarioBase() + (super.getSalarioBase() * this.percComissao / 100);
    }
}

