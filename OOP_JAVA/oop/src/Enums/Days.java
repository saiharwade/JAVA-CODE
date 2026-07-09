package Enums;

public enum Days {
    Monday(true), Tuesday(true), Wednesday(true), Thursday(true), Friday(true), Saturday(false), Sunday(false);

    private final boolean isweekday;

    Days(boolean isweekday){
        this.isweekday = isweekday;
    }

    public String getType(){
        return isweekday ? "WeekDay" : "Weekend";
    }


}
