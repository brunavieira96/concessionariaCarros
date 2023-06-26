public class Cadastro {

    public static void main(String[] args) {

        Carro primeiroCarro = new Carro("PK908YH");

        Cliente primeiroCliente = new Cliente();

        primeiroCarro.setModelo("Gol");
        primeiroCarro.setCor("Vermelho");
        primeiroCarro.setAno(2005);
        primeiroCliente.setNome("Bruna Pereira");
        primeiroCliente.setCpf("555.789.095-76");
        primeiroCliente.setProfissao("Programadora");
        primeiroCliente.setRg("65.990.000-00");
        primeiroCliente.setEndereco("Alameda Campinas, Jardim Paulista - SP");

        System.out.println(primeiroCarro.getModelo());
        System.out.println(primeiroCarro.getCor());
        System.out.println(primeiroCarro.getModelo());
        System.out.println(primeiroCarro.getAno());
        System.out.println(primeiroCliente.getNome());
        System.out.println(primeiroCliente.getCpf());
        System.out.println(primeiroCliente.getEndereco());
        System.out.println(primeiroCliente.getRg());
        System.out.println(primeiroCliente.getProfissao());





    }
}
