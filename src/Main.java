public class Main {
    public static void main(String[] args) {
        Vendedor vendedor1 = new Vendedor("23453435678", "Marina Santino", 2345.00,99, "Vendedora");
        System.out.println(vendedor1.calcularSalario());
        System.out.println(vendedor1.calcularSalario(12.0));
        System.out.println(vendedor1.calcularSalario(200.0, 23.90));

        Externo externo1 = new Externo("345678900987", "Maria Alice", 1234.90, 56, "Depositor", 23.9, 234.9);
        System.out.println(externo1.calcularSalario());

        Comissionado comissionado1 = new Comissionado("234567", "Trankinas", 23455.5, 32, "Gerente Virtual", 23.9);
        System.out.println(comissionado1.calcularSalario());
    }
}