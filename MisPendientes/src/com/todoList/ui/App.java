package com.todoList.ui;

import java.util.Scanner;

public class App {
	private static final String[] options = {"1: Agregar tarea", "2: Ver tareas pendientes", "3: Ver tareas completadas"};
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// Start Menu
		System.out.println("Hola Moises, Que deseas hacer hoy");
		System.out.println("Selecciona una de las siguientes opciones:");
		
		for(String option: options) {
			System.out.println(option);
		}
		
		// Scanner input and switch options
		String text = scanner.nextLine();
		
		
		
		
		
	}
}
