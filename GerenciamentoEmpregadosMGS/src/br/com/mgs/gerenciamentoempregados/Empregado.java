package br.com.mgs.gerenciamentoempregados;

public class Empregado {
    private String id;
    private String nome;
    private String alergias;
    private String condicoesMedicas;
    private String contatoEmergencia;
    private String emailContato;

    // Construtor
    public Empregado(String id, String nome, String alergias, String condicoesMedicas, String contatoEmergencia, String emailContato) {
        this.id = id;
        this.nome = nome;
        this.alergias = alergias;
        this.condicoesMedicas = condicoesMedicas;
        this.contatoEmergencia = contatoEmergencia;
        this.emailContato = emailContato;
    }

    // Getters e setters
    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getAlergias() {
        return alergias;
    }

    public String getCondicoesMedicas() {
        return condicoesMedicas;
    }

    public String getContatoEmergencia() {
        return contatoEmergencia;
    }

    public String getEmailContato() {
        return emailContato;
    }

    @Override
    public String toString() {
        return "ID: " + id + "\nNome: " + nome + "\nAlergias: " + alergias + "\nCondições Médicas: " + condicoesMedicas + 
               "\nContato de Emergência: " + contatoEmergencia + "\nEmail de Contato: " + emailContato;
    }
}

