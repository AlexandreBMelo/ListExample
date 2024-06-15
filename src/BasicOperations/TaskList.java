package BasicOperations;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    // Este atributo cria uma lista (List) para armazenar objetos do tipo Tasks e a
    // nomeia como taskList
    private List<Tasks> taskList;

    // Construtor que inicializa taskList como um ArrayList que pode armazenar
    // objetos do tipo Tasks
    public TaskList() {
        this.taskList = new ArrayList<>();
    }

    // Método para adicionar uma tarefa (Task) a taskList
    public void addTask(String description) {
        taskList.add(new Tasks(description));
    }

    // Método para remover uma tarefa de taskList. O método removeTask lê o atributo
    // description de cada tarefa (t) e compara com a descrição fornecida
    // (description).
    // Se t.getDescription() for igual a description, a tarefa é adicionada à lista
    // tasksToRemove. No final do loop, todas as tarefas em tasksToRemove são
    // removidas de taskList.

    public void removeTask(String description) {
        List<Tasks> tasksToRemove = new ArrayList<>();
        for (Tasks t : taskList) {
            if (t.getDescription().equalsIgnoreCase(description)) {
                tasksToRemove.add(t);
            }
        }
        taskList.removeAll(tasksToRemove);
    }

    // Método para retornar o número total de tarefas na lista
    public int getTotalTaskNumber() {
        return taskList.size();
    }

    // Método para imprimir as descrições de todas as tarefas na lista
    public void getTasksDescriptions() {
        System.out.println(taskList);
    }
}
