package application.exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Color;
import entities.Rectangle;
import entities.Shape;

public class ExerciseArea {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of shapes: ");
		int num = sc.nextInt();
		
		List<Shape> list = new ArrayList<>();
		
		for(int i = 0; i < num; i++) {
			System.out.println("Shape #" + (i+1) + " data:");
			System.out.println("Rectangle or Circle (r/c)?");
			char option = sc.next().charAt(0);
			
			if(option == 'r') {
				System.out.print("Color (BLACK/BLUUE/RED): ");
				Color color = Color.valueOf( sc.next());
				
				System.out.print("Width: ");
				Double width = sc.nextDouble();
				
				System.out.print("Height: ");
				Double height = sc.nextDouble();
				
				list.add(new Rectangle(color, width, height));
			} else {
				System.out.print("Color (BLACK/BLUUE/RED): ");
				Color color = Color.valueOf( sc.next());
				
				System.out.print("Radius: ");
				Double radius = sc.nextDouble();
				
				list.add(new Circle(color, radius));
			}
		}
		
		System.out.println("SHAPE AREAS:");
		
		for (Shape shape : list) {
			System.out.println(shape.area());
		}
		
		sc.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
