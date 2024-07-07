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




        //7

                Scanner scan= new Scanner(System.in);

                System.out.println("Enter your filing status by #:");
                System.out.println("1. Single");
                System.out.println("2. Married Filing Jointly");
                System.out.println("3. Married Filing Separately");
                System.out.println("4. Head of Household");
                int status = scan.nextInt();

                System.out.println("Enter your taxable income:");
                double income = scan.nextDouble();

                double tax = calculateTax(status, income);
                System.out.printf("The tax you owe is: $%.2f\n", tax);

                scan.close();
            }

            public static double calculateTax(int status, double income) {
                double tax = 0;

                switch (status) {
                    case 1: // Single
                        if (income <= 8350) {
                            tax = income * 0.10;
                        } else if (income <= 33950) {
                            tax = 8350 * 0.10 + (income - 8350) * 0.15;
                        } else if (income <= 82250) {
                            tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (income - 33950) * 0.25;
                        } else if (income <= 171550) {
                            tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (income - 82250) * 0.28;
                        } else if (income <= 372950) {
                            tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 + (income - 171550) * 0.33;
                        } else {
                            tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 + (372950 - 171550) * 0.33 + (income - 372950) * 0.35;
                        }
                        break;
                    case 2: // Married Filing Jointly
                        if (income <= 16700) {
                            tax = income * 0.10;
                        } else if (income <= 67900) {
                            tax = 16700 * 0.10 + (income - 16700) * 0.15;
                        } else if (income <= 137050) {
                            tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (income - 67900) * 0.25;
                        } else if (income <= 208850) {
                            tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + (income - 137050) * 0.28;
                        } else if (income <= 372950) {
                            tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + (208850 - 137050) * 0.28 + (income - 208850) * 0.33;
                        } else {
                            tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + (208850 - 137050) * 0.28 + (372950 - 208850) * 0.33 + (income - 372950) * 0.35;
                        }
                        break;
                    case 3: // Married Filing Separately
                        if (income <= 8350) {
                            tax = income * 0.10;
                        } else if (income <= 33950) {
                            tax = 8350 * 0.10 + (income - 8350) * 0.15;
                        } else if (income <= 68525) {
                            tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (income - 33950) * 0.25;
                        } else if (income <= 104425) {
                            tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 + (income - 68525) * 0.28;
                        } else if (income <= 186475) {
                            tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 + (104425 - 68525) * 0.28 + (income - 104425) * 0.33;
                        } else {
                            tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 + (104425 - 68525) * 0.28 + (186475 - 104425) * 0.33 + (income - 186475) * 0.35;
                        }
                        break;
                    case 4: // Head of Household
                        if (income <= 11950) {
                            tax = income * 0.10;
                        } else if (income <= 45500) {
                            tax = 11950 * 0.10 + (income - 11950) * 0.15;
                        } else if (income <= 117450) {
                            tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (income - 45500) * 0.25;
                        } else if (income <= 190200) {
                            tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 + (income - 117450) * 0.28;
                        } else if (income <= 372950) {
                            tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 + (190200 - 117450) * 0.28 + (income - 190200) * 0.33;
                        } else {
                            tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 + (190200 - 117450) * 0.28 + (372950 - 190200) * 0.33 + (income - 372950) * 0.35;
                        }
                        break;
                    default:
                        System.out.println("Invalid filing status.");
                        break;
                }

                return tax;
            }
        }









