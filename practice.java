import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

public class practice{
    public static void main(String[] args){
        /*
        System.out.println("Hello");
        int x;//declaration
        x=10;//assignment

        int x=10;//initialization

        long y=12345675123241241L;
        byte z=127;
        float n=3.14f;
        double e=3.14;//has more precision
        char symbol ='@';
        String name = "My Name is ";
         */

         /* 
         String x ="name";
         String y ="age";
         String temp;

         temp=x;
         x=y;
         y=temp;

         System.out.println("x: "+x);
         System.out.println("y: "+y);
        */

        /* 
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?  ");
        String name= scanner.nextLine();
        System.out.println("How old are you?   ");
        int age=scanner.nextInt();
        scanner.nextLine();
        System.out.println("What is your fav food?  ");
        String food= scanner.nextLine();

        System.out.println("Hello "+name);
        System.out.println("You are "+age+" years old");
        System.out.println("You eat "+food);
        */

        /* 
        double f= 10;
        f++;
        f=(double)f/3;

        System.out.println(f);
        */

        /* 
        String name=JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null,"Hello "+name);
        int age =   Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null,"You are "+age+" years old");
        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
        JOptionPane.showMessageDialog(null,"You are "+height+" cm tall");
        */
        /* 
        double x=3.14;
        double y=10;
        double z=Math.round(x);
        System.out.println(z);
        */
        /* 
        Random random= new Random();//not true random sudo random
        int x= random.nextInt(6)+1;//add one to get 1 to 6 not 0 to 5
        double y= random.nextDouble();
        boolean z=random.nextBoolean();
        System.out.println(x);
        */

        /* 
        String[] array=new String[3];

        array[1]="Camero";
        array[0]="BMW";
        array[2]="Lemborgini";
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
        */
        /*
        String name="Hi";
        int result = name.indexOf("i");
        System.out.println(result);
        */
        /*

        //primative datatype            //wrapper or referance data type
        boolean                         Boolean
        char                            Character
        int                             Integer
        double                          Double      String      ArrayList(stores reference datat types)

        reference class has special methords we can use to manipulate data;
        */

        /* 
        ArrayList<String> food= new ArrayList<String>();

        food.add("Pineapple");
        food.add("Apple");
        food.add("Watermelon");

        food.set(0,"sushi");
        food.remove(2);
        food.clear();

        for (int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i));
        }
        */
        /* */

        ArrayList<ArrayList<String>> groceryList=new ArrayList<>();
        ArrayList<String> bakeryList = new ArrayList<>();
        bakeryList.add("pasta");
        bakeryList.add("cake");

        ArrayList<String> sodaList = new ArrayList<>();
        sodaList.add("limca");
        sodaList.add("coke");

        groceryList.add(bakeryList);
        groceryList.add(sodaList);

        System.out.println();





    }
}