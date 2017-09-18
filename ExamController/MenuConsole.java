/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamController;

import java.util.Scanner;

/**
 *
 * @author vuvan
 */
public class MenuConsole {

    public static void main(String[] args) {
        MenuConsole menu = new MenuConsole();
        menu.createMenu();

    }
    Controller passenger = new Controller();

    public void createMenu() {
        table:
        while (true) {
            System.out.println("------Menu------");
            System.out.println("1. Add reservation. ");
            System.out.println("2. Modify passenger records. ");
            System.out.println("3. Display passenger records. ");
            System.out.println("4. Exit. ");
            System.out.println("-----------------");

            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    passenger.add();
                    break;

                case 2:
                    passenger.modifyPasssenger();
                    break;

                case 3:
                    passenger.displayPassenger();
                    break;

                case 4:
                    break table;
                default:
                    System.out.println("Not Accept.");

            }

        }

    }
}
