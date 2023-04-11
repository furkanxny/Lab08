/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab08;

import java.util.Scanner;

/**
 *
 * @author furkanuzun
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value: ");
        int n = sc.nextInt();

        SinglyLinkedList primesList = new SinglyLinkedList();
        SinglyLinkedList primesWith3List = new SinglyLinkedList();

        for (int i = 0; i <= n; i++) {
            if (PrimeChecker.isPrime(i)) {
                primesList.addLast(i);
            }
        }

        Node current = primesList.getHead();
        while (current != null) {
            int num = current.getData();
            if (String.valueOf(num).contains("3")) {
                primesWith3List.addLast(num);
                primesList.remove(num);
            }
            current = current.getNext();
        }

        int sum = primesWith3List.sum();

        System.out.println("The prime numbers from 0 to " + n + " that have 3 are: " + primesWith3List);
        System.out.println("The sum of these numbers is: " + sum);
    }

}
