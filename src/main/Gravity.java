/*
 * @makboy
 * @version 1.0
 * */
package main;


import java.util.Scanner;

public class Gravity {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double g = 9.8;
		double distance = 0.0;
		double speed = 0.0;
		double time = scanner.nextDouble();
		speed = (g * time);
		distance = (0.5 * g * time * time);
		System.out.println("The speed of the object at " + time + " seconds after its release is " + speed + " and the distance the object has travelled in the " + time + "seconds after the relase is " + distance + " ");

	}

}
