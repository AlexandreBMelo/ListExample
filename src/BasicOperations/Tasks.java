package BasicOperations;

public class Tasks {

    // Atributo para armazenar a descrição da tarefa

    private String description;

    // Construtor que inicializa a tarefa com uma descrição

    public Tasks(String description) {
        this.description = description;
    }

    // Método para obter a descrição da tarefa
    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return description;
    }
    public static void main(String[] args) {
        TaskList listaTarefa = new TaskList();

        listaTarefa.addTask("Comprar frutas");
        listaTarefa.addTask("Comprar frutas");
        listaTarefa.addTask("Jogar futebol");
        listaTarefa.addTask("Programar em Java");
        System.out.println("O número total de elementos na lista é " + listaTarefa.getTotalTaskNumber());

        //listaTarefa.removeTask("Comprar frutas");

        System.out.println("O número total de elementos na lista é " + listaTarefa.getTotalTaskNumber());

        listaTarefa.getTasksDescriptions();




    }
}
