package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Задание 1");

        int [] arrInt = new int[3];
                arrInt[0] = 1;
                arrInt[1] = 2;
                arrInt[2] = 3;
        double [] arrDouble = {1.57, 7.654, 9.986};
        String[] myArray = {"a", "b", "c", "d", "e"};
        System.out.println("Задание 2");


        for (int i = 0; i < arrInt.length; i++){
            if (i == arrInt.length - 1){
                System.out.println(arrInt[i]);
                break;
            }
            System.out.print(arrInt[i] + ", ");
        }

        for (int i = 0; i < arrDouble.length; i ++){
            if (i == arrInt.length - 1){
                System.out.println(arrDouble[i]);
                break;
            }
            System.out.print(arrDouble[i] + ", ");
        }

        for (int i = 0; i < myArray.length; i++){
            if (i == arrInt.length - 1){
                System.out.println(myArray[i]);
                break;
            }
            System.out.print(myArray[i] + ", ");
        }

        System.out.println("Задание 3");

        for (int i = arrInt.length -1; i  >= 0; i --){
            if (i  == 0){
                System.out.println(arrInt[i]);
                break;
            }
            System.out.print(arrInt[i] + ", ");
        }

        for (int i = arrDouble.length -1; i  >= 0; i --){
            if (i  == 0){
                System.out.println(arrDouble[i]);
                break;
            }
            System.out.print(arrDouble[i] + ", ");
        }

        for (int i = myArray.length -1; i  >= 0; i --){
            if (i  == 0){
                System.out.println(myArray[i]);
                break;
            }
            System.out.print(myArray[i] + ", ");
        }

        System.out.println("Задание 4");

        for (int i = 0; i  < arrInt.length; i ++){
            if (i  % 2 == 0){
                arrInt[i] += 1;
                if (i == arrInt.length - 1){
                    System.out.println(arrInt[i]);
                    break;
                }
            }
            System.out.print(arrInt[i] + ", ");
        }
    }
}
