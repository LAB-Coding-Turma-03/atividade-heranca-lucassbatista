package br.com.impacta.lab;

public class Conta{
    
    private String tipo;
    private int numero;
    private int agencia;

    public Conta(int numero, int agencia, String tipo){
        setNumero(numero);
        setAgencia(agencia);
        setTipo(tipo);
    }

    public String montarResumoDaConta(){
        return "Numero: " + this.getNumero() + 
        " - Agencia: " + this.getAgencia() +
        " - Tipo: " + this.getTipo();
    }

    public String getTipo() {
        return tipo;
    };

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
} 