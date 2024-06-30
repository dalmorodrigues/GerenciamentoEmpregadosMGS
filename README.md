# Sistema de Gerenciamento de Empregados MGS

## Descrição

Este projeto é um sistema de gerenciamento de informações dos empregados da MGS (Max Global Sports). O sistema coleta informações básicas dos empregados, incluindo alergias, condições médicas e contatos de emergência, permitindo a visualização dessas informações a partir de um identificador fornecido.

## Funcionalidades

- Adicionar um novo empregado.
- Exibir informações de um empregado por ID.
- Exibir todas as informações de todos os empregados.

## Estrutura do Projeto

O projeto é composto pelas seguintes classes:

1. **Empregado**: Representa um empregado com suas informações básicas.
2. **GerenciadorEmpregados**: Gerencia a lista de empregados, permitindo adicionar e buscar empregados.
3. **Principal**: Classe que contém o método `main` para interação com o usuário via terminal.

### Classe `Empregado`

Representa um empregado com as seguintes informações:
- ID
- Nome
- Alergias
- Condições Médicas
- Contato de Emergência
- Email de Contato

### Classe `GerenciadorEmpregados`

Gerencia uma lista de empregados e fornece métodos para adicionar e buscar empregados:
- `adicionarEmpregado(Empregado empregado)`: Adiciona um empregado à lista.
- `obterEmpregadoPorId(String id)`: Busca um empregado pelo seu ID.
- `exibirTodosEmpregados()`: Exibe todos os empregados cadastrados.

### Classe `Principal`

Contém o método `main` que permite a interação com o usuário através do terminal:
- Menu com opções para adicionar empregado, exibir empregado por ID, exibir todos os empregados e sair.

## Como Executar

### Pré-requisitos

- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-downloads.html) 8 ou superior
- [Eclipse IDE](https://www.eclipse.org/downloads/)
- [Git](https://git-scm.com/)

### Passos para Executar

1. **Clone o repositório**:
   ```sh
   git clone https://github.com/seu-usuario/GerenciamentoEmpregadosMGS.git
