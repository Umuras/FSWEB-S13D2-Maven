package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println(numberToWords(1010));
    }

    public static boolean isPalindrome(int number)
    {
        number = Math.abs(number);
        String strNmb = Integer.toString(number);
        String[] numbers = strNmb.split("");
        String reverseNmb = "";
        for (int i = numbers.length-1; i >= 0; i--) {
            reverseNmb += numbers[i];
        }

        int number2 = Integer.parseInt(reverseNmb);

        if(number == number2)
        {
            return true;
        }else {
            return false;
        }
    }

    public static boolean isPerfectNumber(int number)
    {
        if (number < 0)
        {
            return false;
        }

        int divisorNumbers = 0;

        for (int i = 1; i < number; i++) {
            if(number % i == 0)
            {
                divisorNumbers += i;
            }
        }

        return divisorNumbers == number;
    }

    public static String numberToWords(int number)
    {
        if(number < 0)
        {
            return "Invalid Value";
        }

        String strNmb = Integer.toString(number);
        String[] numbersArr = strNmb.split("");
        String numbersNames = "";

        for (int i = 0; i < numbersArr.length; i++) {
            switch (Integer.parseInt(numbersArr[i]))
            {
                case 0:
                    numbersNames += "Zero ";
                    break;
                case 1:
                    numbersNames += "One ";
                    break;
                case 2:
                    numbersNames += "Two ";
                    break;
                case 3:
                    numbersNames += "Three ";
                    break;
                case 4:
                    numbersNames += "Four ";
                    break;
                case 5:
                    numbersNames += "Five ";
                    break;
                case 6:
                    numbersNames += "Six ";
                    break;
                case 7:
                    numbersNames += "Seven ";
                    break;
                case 8:
                    numbersNames += "Eight ";
                    break;
                case 9:
                    numbersNames += "Nine ";
                    break;
                default:
                    System.out.println("Invalid Number");
            }
        }

        numbersNames = numbersNames.trim();
        return numbersNames;
    }
}
