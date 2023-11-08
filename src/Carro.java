
public class Carro {

    private String modelo;
    private int ano;
    private String cor;
    private Cliente cliente;

    public Carro () {

        this.modelo = modelo;
        this.ano = ano; 
        this.cor = cor;
        this.cliente = cliente;
    }

    public String getModelo() {

        return this.modelo = modelo;
    }

    public void setModelo(String modelo) {

        this.modelo = modelo;
    }

    public String getCor() {

        return this.cor = cor;
    }

    public void setCor(String cor) {

        this.cor = cor;
    }

    public int getAno() {

        return this.ano = ano;
    }

    public void setAno(int ano) {

        this.ano = ano;
    }


    public Cliente getCliente(){

        return this.cliente = cliente;
    }

    public void setCliente(Cliente cliente) {

        this.cliente = cliente;
    }


}



