package JavaTraining.main;

import JavaTraining.sample.thisandsuperkeyword.SuperKeyWord;
import JavaTraining.sample.thisandsuperkeyword.ThisKeyWord;

public class MainClassForKeyWords
{
    public static void main(String[] args)
    {
        ThisKeyWord thisKeyWord = new ThisKeyWord(30, 60);

        System.out.println(thisKeyWord.num);

        System.out.println(thisKeyWord.num2);

        ThisKeyWord thisKeyWord1 = new SuperKeyWord(70, 90);

        System.out.println(thisKeyWord1.num);

        System.out.println(thisKeyWord1.num2);
    }
}
