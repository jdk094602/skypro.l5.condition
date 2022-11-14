// SkyPro Lesson about "if" operator
public class Main {
    public static void main(String[] args) {

     // Task 1
        short ageUser  = 7;
        String claimStr = "Ваш возраст "  + ageUser + " !  "  ;
        String claimStrFull ;

        if (ageUser > 17)
            claimStrFull = claimStr +  " Поздравляю с совершеннолетием ! " ;
        else
            claimStrFull = claimStr +   " Возраст совершеннолетия еще не наступил, терпи !  " ;

        System.out.println(claimStrFull);

        // Task 2
        ageUser  = 28;

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
        // Task 4

    }
}