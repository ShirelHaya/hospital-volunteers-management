package pack;

public class Doctor extends Volunteer {

    enum Degree {
        FIRST(1),
        SECOND(2),
        THIRD(3),
        PROFESSOR(4);

        protected int num;
        protected Degree degree;

        public int getNum() {
            return num;
        }

        Degree(int x) {
            num = x;
        }
    }

    protected Degree degree;
    protected int tryingYears;

    public Doctor(PersonDetails personDetails, boolean bool, Days day, int basisBonus, Degree degree, int tryingYears) {
        super(personDetails, bool, day, basisBonus);
        this.degree = degree;
        this.tryingYears = tryingYears;
    }

    public Doctor(Degree degree, int tryingYears) {
        super();
        this.degree = degree;
        this.tryingYears = tryingYears;
    }

    public Doctor() {
        this.degree = Degree.FIRST;
        this.tryingYears = 1;
    }

    public Degree getDegree() {
        return degree;
    }

    public void setDegree(Degree degree) {
        this.degree = degree;
    }

    public int getTryingYears() {
        return tryingYears;
    }

    public void setTryingYears(int tryingYears) {
        this.tryingYears = tryingYears;
    }

    @Override
    public int calcBonus() {

        if (degree == Degree.SECOND)
            basisBonus += 100;
        else if (degree == Degree.THIRD)
            basisBonus += 200;
        else if (degree == Degree.PROFESSOR)
            basisBonus += 300;
        return basisBonus;
    }
}
