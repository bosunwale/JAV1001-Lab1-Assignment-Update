/*
String name = "John Oluwale";
String student_Number = "A00246405";
String program_Description = "This is a program called AntConverter.
AntConverter runs various conversions such as: size conversion, weight conversion etc.
I added some smiley faces for more user interaction"
 */




import java.util.Scanner;

public class Convert {
    public static void main(String[] args) {
        //Declaring the variables needed for the program
        String choice;
        double value;
        double kilometerResult, milesResult;
        double centimeterResult, inchesResult;
        double kilogramResult, poundsResult, gramResult, ounceResult;
        double celsiusResult, fahrenheitResult, kelvinResult;
        double literResult, cupResult;
        int convertInput;

        Scanner input = new Scanner(System.in);
        //Below is a do-while loop that allows the program run till user exits program by themselves
        do {
            //This allows the user to select the type of conversion they want
            System.out.println("\n************** (*￣▽￣*)ブ" +
                    "\n(✿◡‿◡)o Welcome to AntConverter" +
                    "\nChoose any of the following conversion\n" +
                    "1. Distance conversion\n" +
                    "2. Size conversion\n" +
                    "3. Weight conversion\n" +
                    "4. Temperature conversion\n" +
                    "5. Liquid conversion\n" +
                    "6. Exit\n" +
                    "**************");
            convertInput = input.nextInt();//This accepts the conversion selected by the user
            /*
            The code below is a combination of if-else and switch statement
            The switch statement checks the users input
            the if-else statement handles the conversion operations
             */
            switch (convertInput) {
                case 1:
                    System.out.println("Enter Km (Kilometer) or M (Miles)");
                    choice = input.next();
                    if (choice.equalsIgnoreCase("km")) {
                        System.out.println("Please enter the value to convert");
                        value = input.nextDouble();
                        milesResult = (value / 1.609344);
                        System.out.printf("%.2fkm is equal to %.2fm\n", value, milesResult);
                    } else if (choice.equalsIgnoreCase("m")) {
                        System.out.println("Please enter the value to convert");
                        value = input.nextDouble();
                        kilometerResult = (value * 1.609344);
                        System.out.printf("%.2fm is equal to %.2fkm\n", value, kilometerResult);
                    } else {
                        System.out.println("Sorry, I don't understand :(≡(▔﹏▔)≡ \nPlease try again ლ(╹◡╹ლ)");
                    }
                    break;
                case 2:
                    System.out.println("Enter Cm (Centimeter) or In (Inches)");
                    choice = input.next();
                    if (choice.equalsIgnoreCase("cm")) {
                        System.out.println("Please enter the value to convert");
                        value = input.nextDouble();
                        inchesResult = (value / 2.54);
                        System.out.printf("%.2fcm is equal to %.2fin\n", value, inchesResult);
                    } else if (choice.equalsIgnoreCase("in")) {
                        System.out.println("Please enter the value to convert");
                        value = input.nextDouble();
                        centimeterResult = (value * 2.54);
                        System.out.printf("%.2fin is equal to %.2fcm\n", value, centimeterResult);
                    } else {
                        System.out.println("Sorry, I don't understand :(≡(▔﹏▔)≡ \nPlease try again ლ(╹◡╹ლ)");
                    }
                    break;
                case 3:
                    System.out.println("Enter Kg (Kilogram) or lb (Pound) or g (gram) or oz (Ounce)");
                    choice = input.next();
                    if (choice.equalsIgnoreCase("kg")) {
                        System.out.println("Please enter the value in kilogram");
                        value = input.nextDouble();
                        poundsResult = (value / 0.45359237);
                        System.out.printf("%.2fkg is equal to %.2flbs\n", value, poundsResult);
                    } else if (choice.equalsIgnoreCase("lb")) {
                        System.out.println("Please enter the value in pounds");
                        value = input.nextDouble();
                        kilogramResult = (value * 0.45359237);
                        System.out.printf("%.2flbs is equal to %.2fkg\n", value, kilogramResult);
                    } else if (choice.equalsIgnoreCase("g")) {
                        System.out.println("Please enter the value in grams");
                        value = input.nextDouble();
                        ounceResult = (value / 28.35);
                        System.out.printf("%.2fg is equal to %.2foz\n", value, ounceResult);
                    } else if (choice.equalsIgnoreCase("oz")) {
                        System.out.println("Please enter the value in ounce");
                        value = input.nextDouble();
                        gramResult = (value * 28.35);
                        System.out.printf("%.2fg is equal to %.2foz\n", value, gramResult);
                    } else {
                        System.out.println("Sorry, I don't understand :(≡(▔﹏▔)≡ \nPlease try again ლ(╹◡╹ლ)");
                    }
                    break;
                case 4:
                    System.out.println("Enter c (Celsius) or f (Fahrenheit) or k (Kelvin)");
                    choice = input.next();
                    if (choice.equalsIgnoreCase("c")) {
                        System.out.println("Please enter the value in celsius");
                        value = input.nextDouble();
                        fahrenheitResult = ((value * 1.8) + 32);
                        kelvinResult = (value + 273.15);
                        System.out.printf("%.2fC is equal to %.2fF\n", value, fahrenheitResult);
                        System.out.printf("\n%.2fC is equal to %.2fK", value, kelvinResult);
                    } else if (choice.equalsIgnoreCase("f")) {
                        System.out.println("Please enter the value in fahrenheit");
                        value = input.nextDouble();
                        celsiusResult = ((value - 32) * 0.556);
                        kelvinResult = ((value - 32) / 1.8 + 273.15);
                        System.out.printf("%.2fF is equal to %.2fC\n", value, celsiusResult);
                        System.out.printf("\n%.2fF is equal to %.2fK\n", value, kelvinResult);
                    } else if (choice.equalsIgnoreCase("k")) {
                        System.out.println("Please enter the value in kelvin");
                        value = input.nextDouble();
                        fahrenheitResult = ((value * 1.8) + 32);
                        celsiusResult = (value - 273.15);
                        System.out.printf("%.2fK is equal to %.2fC\n", value, celsiusResult);
                        System.out.printf("\n%.2fK is equal to %.2fF\n", value, fahrenheitResult);
                    } else {
                        System.out.println("Sorry, I don't understand :(≡(▔﹏▔)≡ \nPlease try again ლ(╹◡╹ლ)");
                    }
                    break;
                case 5:
                    System.out.println("Enter l or cups");
                    choice = input.next();
                    if (choice.equalsIgnoreCase("l")) {
                        System.out.println("Please enter the value in liters");
                        value = input.nextDouble();
                        cupResult = (value * 4.22675000);
                        System.out.printf("%.2fl is equal to %.2fcups\n", value, cupResult);
                    } else if (choice.equalsIgnoreCase("cups")) {
                        System.out.println("Please enter the value in cups");
                        value = input.nextDouble();
                        literResult = (value / 4.22675000);
                        System.out.printf("%.2fcups is equal to %.2fl\n", value, literResult);
                    } else {
                        System.out.println("Sorry, I don't understand :(≡(▔﹏▔)≡\nPlease try again ლ(╹◡╹ლ)");
                    }
                    break;
                case 6:
                    System.out.println("Have a good one (●'◡'●)\nGoodbye ヾ(⌐■_■)ノ♪7\n" +
                            "**************");
                    break;
                default:
                    System.out.print("Conversion does not exist (⊙_⊙)\nPlease try again ლ(╹◡╹ლ)");
                    break;
            }
            //This handles the breaking of the infinite loop
        } while (convertInput != 6);
    }
}
