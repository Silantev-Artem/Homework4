public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        int ageForExample = 27;
        if (ageForExample >= 18) {
            System.out.println("Если возраст человека равен " + ageForExample + " , то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + ageForExample + " , то он не достиг совершеннолетия, нужно немного подождать");
        }

        System.out.println("\nЗадание 2");
        int temperatureForExample = 8;
        if (temperatureForExample <= 5) {
            System.out.println("На улице " + temperatureForExample + " градусов, холодно, нужно надеть шапку");
        }

        if (temperatureForExample > 5) {
            System.out.println("На улице " + temperatureForExample + " градусов, сегодня тепло можно идти без шапки");
        }

        System.out.println("\nЗадание 3");
        int speedForExample = 45;
        if (speedForExample >= 60) {
            System.out.println("Если скорость " + speedForExample + " км/ч, то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speedForExample + " км/ч, то можно ездить спокойно");
        }

        System.out.println("\nЗадание 4");
        int ageForEducationExample = 27;
        if (ageForEducationExample >= 2 && ageForEducationExample <= 6) {
            System.out.println("Если возраст человека равен " + ageForEducationExample + " , то ему нужно ходить в детский сад" );
        }else if (ageForEducationExample >= 7 && ageForEducationExample <= 17) {
            System.out.println("Если возраст человека равен " + ageForEducationExample + " , то ему нужно ходить в школу");
        }else if (ageForEducationExample >= 18 && ageForEducationExample <= 24) {
            System.out.println("Если возраст человека равен " + ageForEducationExample + " , то ему нужно ходить в университет");
        }else if (ageForEducationExample >= 24) {
            System.out.println("Если возраст человека равен " + ageForEducationExample + " , то ему нужно ходить на работу");
        }else {
            System.out.println("Если возраст человека равен " + ageForEducationExample + " , то ему нужно научиться ходить)))"); /// на случай, если будут вводить значения <2
        }

        System.out.println("\nЗадание 5");
        int ageForAttractionExample = 12;
        boolean withAdult = true;
        if (ageForAttractionExample < 5) {
            System.out.println("Если возраст ребенка равен " + ageForAttractionExample + " , то ему нельзя кататься на аттракционе");
        }else if (ageForAttractionExample >= 5 && ageForAttractionExample < 14) {
            if (withAdult){
                System.out.println("Если возраст ребенка равен " + ageForAttractionExample + " , то ему можно кататься на аттракционе в сопровождении взрослого");
            }else{
                System.out.println("Если возраст ребенка равен " + ageForAttractionExample + " , то ему нельзя кататься на аттракционе без сопровождения взрослого");
            }
        }else{
            System.out.println("Если возраст ребенка равен " + ageForAttractionExample + " , то ему можно кататься на аттракционе без сопровождения взрослого");
        }

        System.out.println("\nЗадание 6");
        int capacityForExample = 98;
        int wagonSittingCapacity = 60;
        int wagonMaxCapacity = 102;

        if (capacityForExample < wagonSittingCapacity) {
            System.out.println("В вагоне есть сидячие места");
        } else if (capacityForExample >= wagonSittingCapacity && capacityForExample < wagonMaxCapacity) {
            System.out.println("В вагоне есть только стоячие места");
        }else {
            System.out.println("В вагоне нет свободных мест");
        }

        System.out.println("\nЗадание 7");
        int one = 11;
        int two = 22;
        int three = 33;

        if (one > two && one > three) {
            System.out.println("Число под именем one со значением " + one + " больше остальных");
        } else if (two > one && two > three) {
            System.out.println("Число под именем two со значением " + two + " больше остальных");
        } else if (three > one && three > two) {
            System.out.println("Число под именем three со значением " + three + " больше остальных");
        }else {
            System.out.println("Нет однозначно бОльшего числа"); /// на случай, если два или три бОльших числа окажутся одинаковыми
        }

        }

    }