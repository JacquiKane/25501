
package practicelab1to5;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author 13179
 */
public class Practicelab1to5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] hats = {"Stetson", "Boater", "Chapulla", "Field", "Beret"};
        int[] costs = {88,55,77,44,33};
        String[] deliveryTimes = {"2 weeks", "3days", "3 weeks", "2 weeks", "5 days"};

        viewHats(hats, costs, deliveryTimes);
        ArrayList<String> searchResults = filterHatsByCost(hats, costs, 55);
        for (String hat : searchResults)
             System.out.println(hat);
        
        String[][] employees = {{"Ann Cork", "Cashier", "DEPTA"},
                                             {"Ann Madden", "Cashier", "DEPTB"},
                                             {"Ann Finch", "Inventer", "DEPTC"}};
        viewEmployeesInMemory(employees);
        String[][] clonedEmployees = cloneEmployees(employees);
        viewEmployeesInMemory(clonedEmployees);
    }
    
    public static ArrayList<String> filterHatsByCost(String[] hats, int[] costs, int cost) {
        ArrayList<String> filteredHats = new ArrayList<>();
        for (int index = 0; index < hats.length; index++)
        if (costs[index] < cost )
        filteredHats.add(hats[index]);
        return filteredHats;
}
public static void viewHats(String[] hats, int[] costs, String[] deliveryTimes){
    int index = 0;
    while (index < hats.length){
    String displayStr = String.format("The %s hat costs $%d and has a delivery time of %s", hats[index], costs[index], deliveryTimes[index]);
    System.out.println(displayStr);
    index++;
    }
}
public static String[][] cloneEmployees(String[][] employees) {
    String[][] copy = new String[employees.length][];
    for (int row = 0; row < employees.length; row++) {
        copy[row] = new String[employees[row].length];
         for (int col = 0; col < employees[row].length; col++) 
              copy[row][col] = employees[row][col];
    }

return copy;
}
public static void viewEmployeesInMemory(String[][] employees) {
    System.out.println("\nOuter array:");
    System.out.println(System.identityHashCode(employees));
    System.out.println("\nRow arrays:");
    for (int i = 0; i < employees.length; i++) {
        System.out.printf("Row %d: inner array=%d\t",i,System.identityHashCode(employees[i]));
    }
    System.out.println("\n-----------------------------------------\n");
}
}
