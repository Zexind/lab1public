package bsu.rfe.java.gr10.lab1.Davydzenko.varA1;

import java.util.Scanner;

public class MainApp {
	 public static Scanner scanner = new Scanner(System.in);
	 public static void main(String[] args) {
	        Food[] breakfast = new Food[100];
	        for (int i = 0; i < 20; i++) {
	            System.out.println("������� �����");
	            String food = scanner.nextLine();
	            if (food.equals("���")) {
	                breakfast[i] = new Cheese();
	            } else if (food.equals("������/�������")) {
	                breakfast[i] = new Apple("�������");
	            } else if (food.equals("������/���������")) {
	                breakfast[i] = new Apple("���������");
	            } else if (food.equals("����/1")) {
	                breakfast[i] = new Eggs("1");
	            } else if (food.equals("����/2")) {
	                    breakfast[i] = new Eggs("2");
	            } else if (food.equals("����/3")) {
	                breakfast[i] = new Eggs("3");
	            }  else break;
	        }

	        int apple_counter=0;
	        int cheese_counter=0;
	        int egg_counter=0;
	        Apple apple1=new Apple("�������");
	        Apple apple2=new Apple("���������");
	        Cheese cheese=new Cheese();
	        Eggs eggs1 = new Eggs("1");
	        Eggs eggs2 = new Eggs("2");
	        Eggs eggs3 = new Eggs("3");
	       
	        

	        for (int i = 0; i < 20; i++)
	        {
	            if(breakfast[i].equals(apple1))
	            {
	                apple_counter++;
	                break;
	            }
	            if(breakfast[i].equals(apple2))
	            {
	                apple_counter++;
	                break;
	            }
	            else if(breakfast[i].equals(cheese) )
	            {
	                cheese_counter++;
	                
	            } 
	            else if(breakfast[i].equals(eggs1)) 
	            {
	                egg_counter++;
	                
	            }
	            else if(breakfast[i].equals(eggs2)) 
	            {
	                egg_counter++;
	                egg_counter++;
	                
	            }
	            else if(breakfast[i].equals(eggs3)) 
	            {
	                egg_counter++;
	                egg_counter++;
	                egg_counter++;
	                
	            }
	        }

	        System.out.println("C�� - " +cheese_counter );
	        System.out.println("������ - " +apple_counter );
	        System.out.println("���� - " + egg_counter);
	    }
}
