//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // 1
        int xOne;
        xOne = 7;

        if (xOne < 10){
            System.out.println("Part 1: Less than 10");
        }


        //2
        int xTwo;
        xTwo = 15;

        if(xTwo < 10){
            System.out.println("Part 2: Less than 10");
        } else {
            System.out.println("Part 2: Greater than 10");
        }



        //3
        int xThree;
        xThree = 50;

        if(xThree <= 10){
            System.out.println("Part 3: Less than 10");
        } else if (xThree >= 10 && xThree <= 20) {
            System.out.println("Part 3: Between 10 and 20");
        } else{
            System.out.println("Part 3: Greater than or equal to 20");
        }


        // 4
        int xFour;
        xFour = 5;
        if (xFour <= 10 || xFour >= 20){
            System.out.println("Part 4: Out of range");
        } else{
            System.out.println("Part 4: In Range");
        }


    }
}