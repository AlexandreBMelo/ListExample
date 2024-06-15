# Task Management Application

## Visão Geral

Esta é uma aplicação simples de gerenciamento de tarefas desenvolvida em Java. Ela permite que você adicione, remova e liste tarefas, cada uma representada por uma descrição.

## Estrutura do Projeto

O projeto é composto por duas classes principais:

1. **Tasks**: Representa uma tarefa individual com uma descrição.
2. **TaskList**: Gerencia uma lista de objetos `Tasks`, permitindo adicionar, remover e listar tarefas.

## Funcionalidades

- **Adicionar Tarefa**: Adicione uma nova tarefa à lista fornecendo uma descrição.
- **Remover Tarefa**: Remova uma tarefa existente da lista com base na descrição fornecida.
- **Contar Tarefas**: Retorne o número total de tarefas na lista.
- **Listar Tarefas**: Imprima as descrições de todas as tarefas atualmente na lista.

## Como Usar

### Adicionar uma Tarefa

Para adicionar uma tarefa, utilize o método `addTask` da classe `TaskList`, passando a descrição da tarefa como argumento.

### Remover uma Tarefa

Para remover uma tarefa, utilize o método `removeTask` da classe `TaskList`, passando a descrição da tarefa que deseja remover.

### Obter o Número Total de Tarefas

Para obter o número total de tarefas na lista, utilize o método `getTotalTaskNumber` da classe `TaskList`.

### Listar Todas as Descrições de Tarefas

Para listar todas as descrições de tarefas, utilize o método `getTasksDescriptions` da classe `TaskList`.

## Exemplo de Uso

1. Crie uma instância de `TaskList`.
2. Adicione várias tarefas.
3. Liste todas as tarefas.
4. Remova uma tarefa específica.
5. Liste novamente para verificar a remoção.
6. Verifique o número total de tarefas restantes.

## Licença

Este projeto é um exercício elaborado das aulas do Bootcamp de Java para Back-End da DIO em parceria com o Santander.
