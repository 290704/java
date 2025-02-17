package com.celcom.day10;

import java.util.*;

class Task {
	int id;
	String description;
	boolean isCompleted;

	public Task(int id, String description) {
		this.id = id;
		this.description = description;
		this.isCompleted = false;
	}

	@Override
	public String toString() { 
		return "Task ID: " + id + ", Description: " + description + ", Completed: " + (isCompleted ? "Yes" : "No");
	}
}

public class AssignEx3 {
	private static List<Task> taskList = new ArrayList<>();
	private static int taskIdCounter = 1;

	public static void addTask(String description) {
		taskList.add(new Task(taskIdCounter++, description));
		System.out.println("Task added successfully!");
	}

	public static void viewTasks() {
		if (taskList.isEmpty()) {
			System.out.println("No tasks available.");
		} else {
			for (Task task : taskList) {
				System.out.println(task);
			} 
		}
	}

	public static void markTaskAsCompleted(int id) {
		for (Task task : taskList) {
			if (task.id == id) {
				task.isCompleted = true;
				System.out.println("Task marked as completed.");
				return;
			}
		}
		System.out.println("Task not found.");
	}

	public static void deleteTask(int id) {
		Iterator<Task> iterator = taskList.iterator();
		while (iterator.hasNext()) {
			if (iterator.next().id == id) {
				iterator.remove();
				System.out.println("Task deleted successfully.");
				return;
			}
		}
		System.out.println("Task not found.");
	}

	public static void searchTask(String keyword) {
		boolean found = false;
		for (Task task : taskList) {
			if (task.description.toLowerCase().contains(keyword.toLowerCase())) {
				System.out.println(task);
				found = true;
			}
		}
		if (!found) {
			System.out.println("No matching tasks found.");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("\nTask Management System");
			System.out.println("1. Add Task");
			System.out.println("2. View All Tasks");
			System.out.println("3. Mark Task as Completed");
			System.out.println("4. Delete Task");
			System.out.println("5. Search Task");
			System.out.println("6. Exit");
			System.out.print("Enter your choice: ");
			int choice = scanner.nextInt();
			scanner.nextLine(); 

			switch (choice) {
			case 1:
				System.out.print("Enter task description: ");
				String description = scanner.nextLine();
				addTask(description);
				break;
			case 2:
				viewTasks();
				break;
			case 3:
				System.out.print("Enter task ID to mark as completed: ");
				int completeId = scanner.nextInt();
				markTaskAsCompleted(completeId);
				break;
			case 4:
				System.out.print("Enter task ID to delete: ");
				int deleteId = scanner.nextInt();
				deleteTask(deleteId);
				break;
			case 5:
				System.out.print("Enter keyword to search: ");
				String keyword = scanner.nextLine();
				searchTask(keyword);
				break;
			case 6:
				System.out.println("Exiting...");
				scanner.close();
				return;
			default:
				System.out.println("Invalid choice. Try again.");
			}
		}
	}
}
