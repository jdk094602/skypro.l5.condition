// SkyPro Lesson about "if" operator
public class Main {
    public static void main(String[] args) {

     // Task 1+4
        short ageUser  = 7;
        String claimStr = "Ваш возраст "  + ageUser + " !  "  ;
        String claimStrFull ;

        if (ageUser > 17)
            claimStrFull = claimStr +  " Поздравляю с совершеннолетием ! " ;
        else
            claimStrFull = claimStr +   " Возраст совершеннолетия еще не наступил, терпи !  " ;

        System.out.println(claimStrFull);

        // Task 2
        ageUser  = 18;

        claimStrFull   = "Ваш возраст - "  + ageUser + " !  "  ;
            if (ageUser >= 7 & ageUser <= 17)
                claimStrFull   +=   "Надеюсь, Вы исправно ходите в школу ! " ;
            if (ageUser > 17 & ageUser < 24)
                claimStrFull  +=  "Надеюсь, Вы уже учитесь в  ВУЗ-е ! " ;
            if (ageUser >= 24)
                claimStrFull  +=  "Надеюсь, Вы успешно закончили ВУЗ и уже нашли работу ! " ;
            if (ageUser >= 7)
                    claimStrFull += " Если нет - поторопитесь !";
            System.out.println(claimStrFull);

        // Task 3

        short numPass ; /* numbers of passangers */
        short numSeats = 60 ; /* numbers of seats  */
        short totalSeats = 102; /* total of seats  */

        numPass = 611;

        if (numPass <= numSeats)
            System.out.println("В вагоне есть ещё и сидячие и стоячие места ! ");
        if (numPass > numSeats & numPass <= totalSeats)
            System.out.println("В вагоне есть ещё стоячие места ! ");
        if (numPass > totalSeats)
            System.out.println("В вагоне нет свободных мест ! " + " В нём уже " + (numPass - totalSeats) + " лишних пассажиров! ");

        // Task 4

        claimStrFull   = "Ваш возраст - "  + ageUser + " !  "  ;
        if (ageUser >= 7 & ageUser <= 17) {

            claimStrFull += "Надеюсь, Вы исправно ходите в школу ! ";
        }
        else {
            if (ageUser > 17 & ageUser < 24)
                claimStrFull  +=  "Надеюсь, Вы уже учитесь в  ВУЗ-е ! " ;
            else
                claimStrFull  +=  "Надеюсь, Вы успешно закончили ВУЗ и уже нашли работу ! " ;
        }
        if (ageUser >= 7)
            claimStrFull += " Если нет - поторопитесь !";
        System.out.println(claimStrFull);

        // Task 6

        if (numPass <= numSeats)
            System.out.println("В вагоне есть ещё и сидячие и стоячие места ! ");
        else {
            if (numPass > numSeats & numPass <= totalSeats)
                System.out.println("В вагоне есть ещё стоячие места ! ");
            else
                System.out.println("В вагоне нет свободных мест ! " + " В нём уже " + (numPass - totalSeats) + " лишних пассажиров!");
        }
        // Task 7
        ageUser  = 1;

        claimStrFull   = "Ваш возраст - "  + ageUser + " !  "  ;
        if (ageUser >= 2 && ageUser < 7)
            claimStrFull   +=   "Надеюсь, Вы исправно ходите в детский сад ! " ;
        if (ageUser >= 7 && ageUser <= 18)
            claimStrFull   +=   "Надеюсь, Вы исправно ходите в школу ! " ;
        if (ageUser > 18 && ageUser <= 24)
            claimStrFull  +=  "Надеюсь, Вы уже учитесь в  ВУЗ-е ! " ;
        if (ageUser > 24 && ageUser <= 60)
            claimStrFull  +=  "Надеюсь, Вы успешно закончили ВУЗ и уже нашли работу ! " ;
        if (ageUser < 2 || ageUser > 60 )
            claimStrFull += " Для Вас пока нет рекомендаций!";
        else
            claimStrFull += " Если нет - поторопитесь !";
        System.out.println(claimStrFull);

        // Task 8
        ageUser  = 99;

        claimStrFull   = "Ваш возраст - "  + ageUser + " !  "  ;
        if (ageUser < 5) {
            claimStrFull += "Вам пока рано рисковать жизнью на аттракционах! ";
        }
        else {
            if (ageUser >= 5)
                claimStrFull += "Добро пожаловать на аттракцион ! ";
            if (ageUser < 14)
                claimStrFull += "Но только в сопровождении взрослого ! ";
        }
        if (ageUser > 70)
            claimStrFull += "Осторожней , не рассыпьте песок )) ! ";

        System.out.println(claimStrFull);

        // Task 9
        int one = 99;
        int two = 9;
        int three = -99;

        System.out.println( "Из представленных трёх чисел : "  + one + " " + two + " " + three + "  самое большое : " );
        if (one > two) {
            if (one > three) {
                System.out.println(one);
            } else
                System.out.println(three);
        }
        else {
            if (two > three) {
                System.out.println(two);
            } else
            System.out.println(three);
        }


    }

}