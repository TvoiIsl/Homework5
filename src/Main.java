public class Main {
    public static void main(String[] args) {
        int age = 15;
        if (age>=18) {
        System.out.println("Поздравляю с совершеннолетием");
    }
        else {
            System.out.println("Возраст совершеннолетия ещё не наступил, и нужно немного подождать");
        }//Заданиие 1

        int age1 = 25;
        if (age1>=7 && age1<18) {
            System.out.println("Ребенок ходит в школу");
        }
        else {if (age1>=18 && age1<24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        }
        else {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }}//Заданиие 2

        int passengers = 150;
        if (passengers<60) {
            System.out.println("В вагоне есть еще сидячие места");
        }
        else {
            if (passengers<102){
            System.out.println("Сидячих мест нет, но есть стоячие места");
        }
        else {
            System.out.println("Вагон забит!");
        }}//Заданиие 3

        int agex = 30;
        if (agex>=2 && agex<=6){
            System.out.println("Если человеку "+agex+" лет, то ему нужно ходить в детский сад");
        }
        else {
            if (agex>=7 && agex<=18){
                System.out.println("Если человеку "+agex+" лет, то ему нужно ходить в школу");}
            else {
                if (agex>18 && agex<=24){
                    System.out.println("Если человеку "+agex+" лет, то ему нужно ходить в университет");}
                else {
                    System.out.println("Если человеку "+agex+" лет, то ему нужно ходить на работу");
                }}
        }//Заданиие 3.1

        int childAge = 13;
        if (childAge<5){
            System.out.println("Ребенку нельзя кататься на аттракционе!");
        }
        else {
            if (childAge>=5 && childAge<14){
                System.out.println("Ребенок может кататься на аттракционе только в сопровождение взрослого");}
                else {
                    System.out.println("Ребенок может кататься без сопровождения взрослых");
                }
        }//Заданиие 3.2

        int one=1;
        int two=2;
        int free=3;
        if (one >two && one >free){
            System.out.println("Получается "+one+" больше всех");
        } else {
            if (one>two && one<free){
                System.out.println("Получается "+free+" больше всех");}
            else {
                System.out.println("Получается "+two+" больше всех");
            }
        }//Заданиие 3.3
    }
}