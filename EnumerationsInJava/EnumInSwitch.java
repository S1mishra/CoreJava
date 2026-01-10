package EnumerationsInJava;

public class EnumInSwitch {
    enum Day{
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY
    }

    public static void main(String[] args){
        Day day = Day.WEDNESDAY;

        switch(day){
            case SUNDAY:
                System.out.println("It's Sunday!");
                break;
            case MONDAY:
                System.out.println("It's Monday!");
                break;
            case TUESDAY:
                System.out.println("It's Tuesday!");
                break;
            case WEDNESDAY:
                System.out.println("It's Wednesday!");
                break;
            case THURSDAY:
                System.out.println("It's Thursday!");
                break;
            case FRIDAY:
                System.out.println("It's Friday!");
                break;
            case SATURDAY:
                System.out.println("It's Saturday!");
                break;
            default:
                System.out.println("Invalid day!");
        }
    }
    
}
