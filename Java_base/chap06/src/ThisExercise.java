public class ThisExercise {
    public static void main(String[] args) {

        ThisExercisePerson p1 = new ThisExercisePerson("Mary", 52);
        ThisExercisePerson p2 = new ThisExercisePerson("Mary", 52);

        System.out.println(p1.compareTo(p2));
    }
}

class ThisExercisePerson {
    String name;
    int age;

    public ThisExercisePerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean compareTo(ThisExercisePerson p) {
        if(this.name.equals(p.name) && this.age == p.age) {
            return true;
        } else {
            return false;
        }

    }
}
