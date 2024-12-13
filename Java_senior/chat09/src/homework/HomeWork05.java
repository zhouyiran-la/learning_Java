package homework;

/**
 * @author zyr
 * @version 1.0
 */
public class HomeWork05 {
    public static void main(String[] args) {
        Color green = Color.GREEN;
        green.show();


    }
}

enum Color implements ColorInter {

    RED(255, 0, 0),
    BLUE(0, 0, 255),
    YELLOW(255, 255, 0),
    GREEN(0, 255, 0),
    BLACK(0, 0, 0);

    private int redValue;
    private int greenValue;
    private int blueValue;

    private Color(int redValue, int greenValue, int blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }

    @Override
    public void show() {
        System.out.println(redValue + ' ' + greenValue + ' ' + blueValue);
    }
}

interface ColorInter{
    void show();
}

