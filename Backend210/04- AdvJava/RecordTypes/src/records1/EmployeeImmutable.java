package records1;

import java.util.Objects;
/*
uygulama içinde datalarımızı saklamak için basit classlar
oluştururuz. Bazı zamanlarda thread güvenliği, cachede veri tutarlılığı, test kolaylığı vs
gibi sebeplerle bu classların değiştirilemez(immutable) olmasını isteriz.
 */
public class EmployeeImmutable {

    private final String firstName;
    private final String lastName;
    private final String email;

    //param const
    public EmployeeImmutable(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    //getter:final olduğu için, değiştirilemesin diye setter metodlarını yazmıyoruz.

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    //toString
    @Override
    public String toString() {
        return "EmployeeImmutable{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    //equals

    @Override
    public boolean equals(Object obj) {
        if (this==obj){
            return true;
        }

        if (obj==null || this.getClass()!=obj.getClass() ){
            return false;
        }
        EmployeeImmutable e= (EmployeeImmutable) obj;

        return Objects.equals(e.firstName,this.firstName)&&
                Objects.equals(e.lastName,this.lastName)&&
                Objects.equals(e.email,this.email);
    }


    //hashCode
    @Override
    public int hashCode() {
        return Objects.hash(firstName,lastName,email);
    }
}
