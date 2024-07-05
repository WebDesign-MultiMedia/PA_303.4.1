import java.util.Scanner;

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



        //5

        System.out.println("Part 5: Grade Score: ");
        Scanner input = new Scanner(System.in);
        int yourGrade;

        System.out.println(" Enter your grade to get your results: ");
        yourGrade = input.nextInt();


        if(yourGrade >= 90 && yourGrade <= 100){
            System.out.println("Grade A");
        }
        else if (yourGrade >= 80 && yourGrade <= 89) {
            System.out.println("Grade B");
        }
        else if (yourGrade >= 70 && yourGrade <= 79 ) {
            System.out.println("Grade C");
        }
        else if (yourGrade >= 60 && yourGrade <= 69) {
            System.out.println("Grade D");
        }
        else if(yourGrade <= 60 && yourGrade >= 1){
            System.out.println("Grade F 'Fail'");
            System.out.println("Get your grades up SMH!");
        }

        else{
            System.out.println("Score out of range");
        }




        // 6
        Scanner sc = new Scanner(System.in);
        int y;
        y = sc.nextInt();

        switch (y){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednsday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Out of range");
                break;
        }

    }
}