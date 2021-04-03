package com;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int size = 3;
        boolean flgFound = false;

        String[][] Persons = new String[size][size];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please 10 people names and IDs");

        for(int i = 0; i < size; i++){

            System.out.println("Enter UID: ");
            Persons[0][i] = scanner.nextLine();

            System.out.println("Enter Name: ");
            Persons[1][i] = scanner.nextLine();
        }

        while(true){

            System.out.println("Please find by UID or by Name: ");
            String SearchCriterion = scanner.nextLine();

            if(SearchCriterion.equals("0")){
                break;
            }

            for(int i = 0; i < size; i++){

                if(Persons[0][i].equals(SearchCriterion)){
                    System.out.println("Found Name " + Persons[1][i] + " UID " +  Persons[0][i]);
                    flgFound = true;
                    break;
                }
                if(Persons[1][i].equals(SearchCriterion)){
                    System.out.println("Found Name " + Persons[1][i] + " UID " +  Persons[0][i]);
                    flgFound = true;
                    break;
                }
            }

            if(!flgFound){
                System.out.println("Name not found");
            }else{
                flgFound = false;
            }
        }

        System.out.println("Exit");

    }

}
