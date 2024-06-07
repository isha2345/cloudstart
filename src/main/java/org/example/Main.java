package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.


        // Press Shift+F10 or click the green arrow button in the gutter to run the code.

        int n1=3;
        int n2=4;
        getSum(n1,n2);
        getSubtract(n1,n2);

    }

    static int getSum(int n1, int n2){
        int n3=n1+n2;
        System.out.println(n3);
        return n3;
    }
    static int getSubtract(int n1, int n2){
        int n3=n2-n1;
        System.out.println(n3);
        return n3;
    }
    //This comment is here so that I can verify that the workflow is responding positively to any change made. Bye Bye!!!
}
