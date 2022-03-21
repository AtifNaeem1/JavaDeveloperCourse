package Assignments;

import java.util.Scanner;

// Time Complexity = O(26 + size of string) = O(size of string)


public class Assignment2 {
    public static void main(String[] args) {
        Scanner keyboard =  new Scanner(System.in);

        System.out.println("Enter any string");
        String  input  = keyboard.nextLine();

        int index = 0;
        boolean[] visited = new boolean[26];

        for (int id = 0; id < input.length(); id++) {
            if ('a' <= input.charAt(id) && input.charAt(id) <= 'z') {
                index = input.charAt(id) - 'a';
            } else if ('A' <= input.charAt(id) && input.charAt(id) <= 'Z') {
                index = input.charAt(id) - 'A';
            }
            visited[index] = true;
        }

        for (int id = 0; id < 26; id++) {
            if (!visited[id]) {
                System.out.println(false);
                return ;
            }
        }
        System.out.println(true);
    }
}
