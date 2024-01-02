package enumtypes;

import static enumtypes.PasswordStrengthConstant.*;

public class Runner {
    public static void main(String[] args) {


        //validasyon işlemi yapıldı kabul edelim
        printPasswordStrength("LOW");
        printPasswordStrength("MEDIUM");
        printPasswordStrength("HIGH");

        printPasswordStrength("LOW.");//CTE yok, RTE de yok, ama beklenen işlev gerçekleşmiyor.

        //ÇÖZÜM:sabit ve sınırlı değişkenler için:ENUM types
        //validasyon işlemi yapıldı kabul edelim

        printPasswordStrengthWithEnum(PasswordStrengthEnum.LOW);
        printPasswordStrengthWithEnum(PasswordStrengthEnum.MEDIUM);
      //  printPasswordStrengthWithEnum(HIGH.);//CTE verdi
        printPasswordStrengthWithEnum(PasswordStrengthEnum.HIGH);
      //  printPasswordStrengthWithEnum("      ");






    }
    //password gücü:LOW,MEDIUM,HIGH

    public static void printPasswordStrength(String strength){

        if (strength.equals(LOW)){
            System.out.println("Password gücünüz düşüktür.");
        } else if (strength.equals(MEDIUM)) {
            System.out.println("Password gücünüz orta seviyededir..");
        }else if (strength.equals(HIGH)){
            System.out.println("Password gücünüz yüksek seviyededir..");
        }

    }

    //password gücü ENUM typle ile:LOW,MEDIUM,HIGH

    public static void printPasswordStrengthWithEnum(PasswordStrengthEnum strength){

        if (strength.equals(PasswordStrengthEnum.LOW)){
        //if (strength.ordinal()==0){//tercih edilmemeli
            System.out.println("Password gücünüz düşüktür.");
            System.out.println("Puan: "+strength.getLevel());
        } else if (strength.equals(PasswordStrengthEnum.MEDIUM)) {
            System.out.println("Password gücünüz orta seviyededir..");
        } else if (strength.equals(PasswordStrengthEnum.HIGH)) {
            System.out.println("Password gücünüz yüksek seviyededir..");
        }


        System.out.println("Enum sırası : "+strength.ordinal());
        System.out.println("Enum  ismi : "+strength.name());

    }



}
