/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamController;

import java.util.PriorityQueue;
import java.util.Scanner;

/**
 *
 * @author Lan
 */
public class Controller {

    Scanner sc = new Scanner(System.in);
    Passenger pas = new Passenger();
    PriorityQueue<Passenger> queue = new PriorityQueue<>();

 
    public void add() {
        System.out.println("Enter ID");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter name:");
   
        String name = sc.nextLine();
        System.out.println("Enter address:");
        String address = sc.nextLine();
        System.out.println("Enter phone:");
        String phone = sc.nextLine();
        System.out.println("Enter date of departure and return.");
        String date = sc.nextLine();

        pas = new Passenger(id, name, address, phone, date);
        queue.add(pas);
        System.out.println("success!!!");
    }

    public void modifyPasssenger() {
        for (Passenger passenger : queue) {
            System.out.println("Enter reservation ID.");
            int id = sc.nextInt();

            if (id == passenger.getId()) {
                queue.remove();
                System.out.println("Enter new name.");
                sc.nextLine();
                String nname = sc.nextLine();
                System.out.println("Enter new address.");
                String naddress = sc.nextLine();
                System.out.println("Enter new phone.");
                String nphone = sc.nextLine();
                System.out.println("Enter new date start - end");
                String ndate = sc.nextLine();

                queue.add(pas);

            } else {
                System.err.println("ID does not ...");

            }

        }

    }

    public void displayPassenger() {

        if (queue.isEmpty() == false) {
            for (Passenger passenger : queue) {
                System.out.println("ID: " + passenger.getId());
                System.out.println("Name: " + passenger.getName());
                System.out.println("Address: " + passenger.getAddress());
                System.out.println("Phone: " + passenger.getPhone());
                System.out.println("Date: " + passenger.getDateOfDepartureAndReturn());
            }

        } else {
            System.err.println("no data");
        }
    }
}