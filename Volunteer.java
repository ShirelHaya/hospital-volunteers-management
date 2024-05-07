package pack;

public abstract class Volunteer implements Comparable<Volunteer> {

    enum Days {SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY}

    protected PersonDetails personDetails;
    protected boolean bool;
    protected Days day;
    protected int basisBonus;

    public Volunteer(PersonDetails personDetails, boolean bool, Days day, int basisBonus) {
        this.personDetails = personDetails;
        this.bool = bool;
        this.day = day;
        this.basisBonus = basisBonus;
    }

    public Volunteer() {
        this.personDetails = new PersonDetails(362404222, 46, "Nikita");
        this.bool = true;
        this.day = Days.SUNDAY;
        this.basisBonus = 200;
    }

    public PersonDetails getPersonDetails() {
        return personDetails;
    }

    public boolean isBool() {
        return bool;
    }

    public Days getDay() {
        return day;
    }

    public int getBasisBonus() {
        return basisBonus;
    }

    public void setPersonDetails(PersonDetails personDetails) {
        this.personDetails = personDetails;
    }

    public void setBool(boolean bool) {
        this.bool = bool;
    }

    public void setDay(Days day) {
        this.day = day;
    }

    public void setBasisBonus(int basisBonus) {
        this.basisBonus = basisBonus;
    }

    public abstract int calcBonus();

    @Override
    public String toString() {
        String string = personDetails + " if: " + bool + " day: " + day + " bonus: " + basisBonus;
        return string;
    }

    @Override
    public int compareTo(Volunteer o) {
        // return this.getPersonDetails().getId() - o.getPersonDetails().getId();
        return this.getPersonDetails().getName().compareTo(o.getPersonDetails().getName());
    }
}
