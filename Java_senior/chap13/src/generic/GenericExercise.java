package generic;
import java.util.ArrayList;
import java.util.Comparator;

/**
 * @author zyr
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class GenericExercise {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<Employee>();
        list.add(new Employee("jack", 1000,  new MyDate(7, 7, 2001)));
        list.add(new Employee("amy", 1000,  new MyDate(8, 7, 2001)));
        list.add(new Employee("smith", 1000,  new MyDate(8, 7, 2000)));
        list.add(new Employee("smith", 1000,  new MyDate(5, 7, 2000)));
        list.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (o1.getName().equals(o2.getName())) {
                    int yearMinus = o1.getBirthday().getYear() - o2.getBirthday().getYear();
                    int monthMinus = o1.getBirthday().getMonth() - o2.getBirthday().getMonth();
                    int datMinus = o1.getBirthday().getDay() - o2.getBirthday().getDay();
                    if (yearMinus != 0) {
                        return yearMinus;
                    } else if (monthMinus != 0) {
                        return monthMinus;
                    } else {
                        return datMinus;
                    }
                }
                else {
                    return o1.getName().compareTo(o2.getName());
                }
            }
        });

        System.out.println(list);
    }
}

class MyDate {
    private int day, month, year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
}

class Employee {
    private String name;
    private double sal;
    private MyDate birthday;

    public Employee(String name, double sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday +
                '}';
    }
}

