package com.todoList.ui;

import java.util.Scanner;

public class App {
	private static final String[] options = {"1: Agregar tarea", "2: Ver tareas pendientes", "3: Ver tareas completadas"};
	private static final Scanner scanner = new Scanner(System.in);
	
	private static com.todoList.service.TaskService TaskService = new com.todoList.service.TaskService();

	// Main method
	public static void main(String[] args) {
		// Start Menu
		System.out.println("Hola Moises, Que deseas hacer hoy");
		System.out.println("Selecciona una de las siguientes opciones:");
		
		for(String option: options) {
			System.out.println(option);
		}
		
		int numOption;

        do {
            System.out.print("Ingresa el número de la opción: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Por favor, ingresa un número válido.");
                System.out.print("Ingresa el número de la opción: ");
                scanner.next(); // Consumir la entrada no válida
            }
            
            numOption = scanner.nextInt();

            switch (numOption) {
                case 1:
                    System.out.println("Seleccionaste la opción: " + numOption);
                    System.out.println(createTask());
                    break;
                case 2:
                    System.out.println("Seleccionaste la opción: " + numOption);
                    break;
                case 3:
                    System.out.println("Seleccionaste la opción: " + numOption);
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
                    break;
            }

        } while (numOption < 1 || numOption > 3);
	}
	
	// Util Methods
	public static String createTask() {
		return TaskService.createTask();
	}
}

