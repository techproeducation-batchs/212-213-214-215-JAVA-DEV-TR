package constructor;

//builder DP yi kullanalım:Lombok

import lombok.Builder;
import lombok.NonNull;

@Builder
public class Person3 {

    @NonNull
    private String name;//zorunlu
    @NonNull
    private String surname;//zorunlu

    private int age;//0--opsiyonel
    private String phoneNumber;//opsiyonel


    public static void main(String[] args) {

        Person3 person=Person3.builder().name("Veli").surname("Han").age(25).build();
        Person3 person2=Person3.builder().name("Ali").surname("Can").build();
        Person3 person3=Person3.builder().age(23).build();


    }


}
