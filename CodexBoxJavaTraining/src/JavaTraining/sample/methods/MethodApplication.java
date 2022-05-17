package JavaTraining.sample.methods;

// Java Program to Illustrate Methods
// Importing required classes

import java.util.ArrayList;

public class MethodApplication
{
        public int addTwoNum(int num1, int num2, int num3)
        {
            return num1 + num2 + num3;
        }
        public static void main(String[] args)
        {
            MethodApplication add = new MethodApplication();

         int  sum =  add.addTwoNum(20,89,9);

            System.out.println("Addition of Three numbers is: " + sum);

           // ArrayList

            ArrayList<Integer> arrayList = new ArrayList<>();

            arrayList.add(24);

            int num = arrayList.get(0);

            System.out.println(num);
        }
    }

