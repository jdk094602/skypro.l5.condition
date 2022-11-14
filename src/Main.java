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
    }

}