public class Vendedor {
    private String cpf;
    private String nome;
    private Double salarioBase;
    private int vendas;
    private String cargo;

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public int getVendas() {
        return vendas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Vendedor(String cpf, String nome, Double salarioBase, int vendas, String cargo){
        this.cpf = cpf;
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.vendas = vendas;
        this.cargo = cargo;
    }

    public Double calcularSalario(Double porcentagem){
        return this.salarioBase - (this.salarioBase * porcentagem)/100;
    }

    public Double calcularSalario(Double desconto, Double comissao){
        return this.salarioBase - desconto * comissao / 100;
    }

    public Double calcularSalario(){
        return this.salarioBase;
    }

    public void aumentarSalarioBase(Double porcentagem){
        setSalarioBase(this.salarioBase + (this.salarioBase * porcentagem/100));
    }
}
