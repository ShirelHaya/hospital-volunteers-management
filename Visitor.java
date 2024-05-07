package pack;

public class Visitor extends Volunteer {
    enum Status {
        ALONE(100),
        CHILDREN(1000),
        MARRIED(500);

        protected int num;
        protected Visitor.Status status;

        public int getNum() {
            return num;
        }

        Status(int x) {
            num = x;
        }
    }

    ;
    protected Status status;

    public Visitor() {
        super();
        this.status = Status.ALONE;
    }
//    public Visitor(status){
//            super();
//            this.status = status;
//    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public int calcBonus() {
//        if (status == Status.MARRIED)
//            basisBonus+= 500;
//        if(status == Status.ALONE)
//            basisBonus+=100;
//        if (status == Status.CHILDREN)
//            basisBonus+= 1000;
//        return  basisBonus;
        return basisBonus += status.num;
    }

    @Override
    public String toString() {
        String string = super.toString() + " status: " + status;
        return string;
    }
}
