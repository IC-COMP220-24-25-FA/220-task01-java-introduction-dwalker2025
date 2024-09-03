package edu.ithaca.dragon.practice;

import java.util.List;

public class FunctionPractice {

    /**
     * @return the largest of the 3 numbers
     * @throws IllegalArgumentException if any of the numbers is negative
     */
    public static int largestOfThree(int first, int second, int third){
        if (first < 0 || second < 0 || third < 0){
            throw new IllegalArgumentException("Parameters can not be negative.");
        }

        if (first >= second && first >= third){
            return first;
        }
        if (second >= first && second >= third){
            return second;
        }
        else {
            return third;
        }
    }
    
    /**
     * @return the final price at register of the given item after discount and tax applied
     */
    public static double calcSalePrice(double originalPrice, double discountPercent, double salesTax){
        double finalPrice;
        double discountOff;
        double taxAdded;

        discountOff = originalPrice * (discountPercent/100);
        finalPrice = originalPrice - discountOff;
        taxAdded = finalPrice * (salesTax/100);
        finalPrice = finalPrice + taxAdded;

        return finalPrice;

    }

    /**
     * @return true if the data collected shows the dog is good, false if bad dog today
     */
    public static boolean isGoodDog(int yearsOld, int daysSinceShoesChewed, boolean fetchedThePaperToday){
        return yearsOld >= 3 && daysSinceShoesChewed >= 7 && fetchedThePaperToday;
    }

    /**
     * @return the index of the largest number in the list, or -1 if the list is empty.
     * If the largest number occurs more than once, return the index of the first occurence.
     */
    public static int findFirstLargest(List<Integer> numbers){
        if (numbers.isEmpty()) {
            return -1;
        }

        int largest = numbers.get(0);
        int index = 0;

        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) > largest) {
                largest = numbers.get(i);
                index = i;
            }
        }

        return index;
    }

    /**
     * @return the index of the largest number in the list, or -1 if the list is empty.
     * If the largest number occurs more than once, return the index of the last occurence.
     */
    public static int findLastLargest(List<Integer> numbers){
        if (numbers.isEmpty()) {
            return -1;
        }
        int largest = numbers.get(0);
        int index = 0;

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) >= largest) {
                largest = numbers.get(i);
                index = i;
            }
        }
        return index;
    }

    /**
     * @return the string that has contains the most occurences of the given letter
     * @throws 
     */
    public static String findFirstMostOccurencesOfLetter(List<String> words, char letter){
        if (words.isEmpty()) {
            return "";
        }

        String result = "";
        int maxCount = 0;

        for (String word : words) {
            int count = 0;
            for (char c : word.toCharArray()) {
                if (c == letter) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                result = word;
            }
        }

        return result;
    }


}
