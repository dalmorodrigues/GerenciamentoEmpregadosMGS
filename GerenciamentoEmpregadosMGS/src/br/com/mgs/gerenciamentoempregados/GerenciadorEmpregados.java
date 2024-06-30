package br.com.mgs.gerenciamentoempregados;

import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorEmpregados {
    private ArrayList<Empregado> empregados;

    public GerenciadorEmpregados() {
        empregados = new ArrayList<>();
    }

    public void adicionarEmpregado(Empregado empregado) {
        empregados.add(empregado);
    }

    public Empregado obterEmpregadoPorId(String id) {
        for (Empregado empregado : empregados) {
            if (empregado.getId().equals(id)) {
                return empregado;
            }
        }
        return null;
    }

    public void exibirTodosEmpregados() {
        for (Empregado empregado : empregados) {
            System.out.println(empregado);
            System.out.println("-------------------");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GerenciadorEmpregados gerenciador = new GerenciadorEmpregados();

        while (true) {
            System.out.println("1. Adicionar Empregado");
            System.out.println("2. Exibir Empregado por ID");
            System.out.println("3. Exibir Todos os Empregados");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int escolha = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            switch (escolha) {
                case 1:
                    System.out.print("ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Alergias: ");
                    String alergias = scanner.nextLine();
                    System.out.print("Condições Médicas: ");
                    String condicoesMedicas = scanner.nextLine();
                    System.out.print("Contato de Emergência: ");
                    String contatoEmergencia = scanner.nextLine();
                    System.out.print("Email de Contato: ");
                    String emailContato = scanner.nextLine();

                    Empregado novoEmpregado = new Empregado(id, nome, alergias, condicoesMedicas, contatoEmergencia, emailContato);
                    gerenciador.adicionarEmpregado(novoEmpregado);
                    System.out.println("Empregado adicionado com sucesso!");
                    break;
                case 2:
                    System.out.print("ID do Empregado: ");
                    String idPesquisa = scanner.nextLine();
                    Empregado empregado = gerenciador.obterEmpregadoPorId(idPesquisa);
                    if (empregado != null) {
                        System.out.println(empregado);
                    } else {
                        System.out.println("Empregado não encontrado.");
                    }
                    break;
                case 3:
                    gerenciador.exibirTodosEmpregados();
                    break;
                case 4:
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}

