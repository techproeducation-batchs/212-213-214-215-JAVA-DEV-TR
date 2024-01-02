package enumtypes;

public enum PasswordStrengthEnum {

    LOWER(5),//0
    LOW(10),//1
    MEDIUM(30),//2
    HIGH(50);//3

    private final int level;

    //parametreli const
    PasswordStrengthEnum(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }
}
