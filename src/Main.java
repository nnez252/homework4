public class Main {
    public static void main(String[] args) {
        // Задание 1
        int age = 12;
        if (age >= 18) {
            System.out.println("Поздравляем вас с своершенолетием!!");
        }
        if (age < 18) {
            System.out.println("Возраст совершеннолетия ещё не наступил, и нужно немного подождать.");
        }
        // задание 2
        System.out.println("Задание 2");
        int childrenage = 7;
        int studentage = 18;
        int peopleage = 24;
        if (childrenage >= 7) {
            System.out.println("Ребенок ходит в школу ");
        }
        if (studentage >= 18) {
            System.out.println("Ученик уже закончил школу и направляется в институт");
        }
        if (peopleage >= 24) {
            System.out.println("Человек должен искать работу");
        }
        //задание 3
        System.out.println("Задание 3");
        int totalplace = 102;
        int siteplace = 60;
        int standingplace = totalplace - siteplace;
        int siteusedplace = 32;
        int standingusedplace = 23;
        if (siteusedplace < siteplace) {
            System.out.println("Еще есть сидячих " + (siteplace - siteusedplace) + " мест ");
        }
        if (standingusedplace < standingplace) {
            System.out.println("Еще есть стоячиx " + (standingplace - standingusedplace) + "места ");
        }

//задание 4
        System.out.println("Задание 4");
        int age1 = 21;
        if (age1 >= 18) {
            System.out.println("Поздравляем вас с своершенолетием!!");
        } else {
            System.out.println("Возраст совершеннолетия ещё не наступил, и нужно немного подождать.");
        }
// Задание 5
        System.out.println("Задание 5");
        int age2 = 17;
        System.out.println("Возраст " + age2);
        if (age2 >= 7) {
            System.out.println("ребенок может идти в школу ");
        } else {
            System.out.println("ребенок не может идти в школу");
        }
        if (age2 >= 18) {
            System.out.println("школьник может идти в институт");
        } else {
            System.out.println("школьник не может идти в институт");
        }
        if (age2 >= 24) {
            System.out.println("Человек жолжен уже искать первую работу");
        } else {
            System.out.println("Человек еще не может искать первую работу");
        }
//Задание 6
        System.out.println("Задание 6");
        int place = 1000;
        int site = 509;
        int standing = 109;
        if (site > 60) {
            System.out.println("Сидячих мест больше нет ");
        } else {
            System.out.println("Сидячие места есть");
        }
        if (place > 102) {
            System.out.println("Места нет в вагоне");
        } else {
            System.out.println("Места в вагоне есть ");
        }
        if (standing > 102 - 60) {
            System.out.println("Стоячих мест больше нет");
        } else {
            System.out.println("Стоячие места есть ");
        }
//Задание 7
        System.out.println("Задание 7");
        int age3 = 20;
        if (age3 > 2 && age3 < 6) {
            System.out.println("Если возраст человека равен " + age3 + " то ему нужно ходить в садик ");
        } else if (age3 > 7 && age3 < 18) {
            System.out.println("Если возраст человека равен " + age3 + " то ему нужно ходить в школу  ");
        } else if (age3 > 18 && age3 < 24) {
            System.out.println("Если возраст человека равен " + age3 + " то ему нужно ходить университет ");
        } else if (age3 > 24) {
            System.out.println("Если возраст человека равен " + age3 + "то ему нужно ходить на работу ");
        }
//Задание 8
        System.out.println("Задание 8");
        int age4 = 4;
        if (age4 < 5) {
            System.out.println("Ребенок не может кататься на аттракционах , возраст ребенка :" + age4);
        } else if (age4 > 5 && age4 < 14) {
            System.out.println("Может кататься только в саправождении взрослого, возраст ребенка : " + age4);
        } else if (age4 > 14) {
            System.out.println("Может кататься без сопровождения взорслого , возраст ребенка :" + age4);
        }
        //Задание 9
        System.out.println("Задание 9");
        int one = 5126;
        int two = 512;
        int three = 51;
        if (one > two) {
            if (one > three) {
                System.out.println("Максимальное число " + one);
            } else {
                System.out.println("Максимальное число " + three);
            }
            }else if (two>one){
                if (two>three){
                    System.out.println("Максимальное число "+two);
                }else{
                    System.out.println("Максимальное число "+three);
                }
            }



            }
        }










