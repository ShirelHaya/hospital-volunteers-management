package pack;

import java.util.Arrays;

public class VolCollection {
    enum Type {DOCTOR, VISITOR}

    ;
    private Volunteer arrVol[] = new Volunteer[5];
    private int index = 0;//המקום הפנוי הבא במערך

    public VolCollection(Volunteer[] arrVol, int index) {
        this.arrVol = arrVol;
        this.index = index;
    }

    public VolCollection() {
        Volunteer arr[] = new Volunteer[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = new Volunteer() {
                @Override
                public int calcBonus() {
                    return 0;
                }
            };
        }
        this.arrVol = arr;
        this.index = index;
    }

    public void AddVolToArr(Volunteer v) {
        if (index < arrVol.length) {
            arrVol[index] = v;
            index += 1;
        }
        System.out.println("we can add it couse the arry is full!");
    }

    public Volunteer FindVol(VolCollection.Type type, int age, Volunteer.Days day) {
        for (int i = 0; i < index; i++) {
            // בדיקה האם המתנדב עונה על הקריטריונים לחיפוש וגם הוא פנוי
            if ((type == Type.DOCTOR && arrVol[i] instanceof Doctor) || (type == Type.VISITOR && arrVol[i] instanceof Visitor)) {
                //if(t==Type.DOCTOR && volunteer instanceof Doctor )
                if (arrVol[i].bool == true && arrVol[i].day == day && arrVol[i].getPersonDetails().age >= age) {
                    // לעדכן שהמתנדב תפוס
                    arrVol[i].bool = false;
                    return arrVol[i];
                }

            }
        }
        return null; //למקרה שלא נמצא מתנדב מתאים

    }

    public void PrintAllVol() {
        for (int i = 0; i < arrVol.length; i++) {
            System.out.println(arrVol[i]);
        }
    }

    public void PrintVolByOrder() {
        Arrays.sort(arrVol, 0, index);
        for (int i = 0; i < arrVol.length; i++) {
            System.out.println(arrVol[i]);
        }
    }

}
