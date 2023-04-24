public class Externo extends Vendedor{
    private Double percComissao;
    private Double adicional;

    public Double getPercComissao() {
        return percComissao;
    }

    public void setPercComissao(Double percComissao) {
        this.percComissao = percComissao;
    }

    public Double getAdicional() {
        return adicional;
    }

    public void setAdicional(Double adicional) {
        this.adicional = adicional;
    }

    public Externo(String cpf, String nome, Double salarioBase, int vendas, String cargo, Double percComissao, Double adicional) {
        super(cpf, nome, salarioBase, vendas, cargo);
        this.percComissao = percComissao;
        this.adicional = adicional;
    }

    public Double calcularSalario(){
        return super.getSalarioBase() + (this.getSalarioBase() * this.percComissao/100) + this.adicional;
    }
}
