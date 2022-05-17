package JavaTraining.main;

import JavaTraining.sample.wrapperclass.WrapperClassExamples;

public class MainWrapper
{
    public static void main(String[] args)
    {
        WrapperClassExamples wrapperClassExamples = new WrapperClassExamples();

        System.out.println("=====================================================");

        System.out.println( "My Integer WrapperClass Number is: " + wrapperClassExamples.getInteger());

        System.out.println(wrapperClassExamples.getCharacter());

        System.out.println(wrapperClassExamples.getaByte());

        System.out.println(wrapperClassExamples.getaFloat());

        System.out.println(wrapperClassExamples.getaShort());

        System.out.println(wrapperClassExamples.getaBoolean());

        System.out.println(wrapperClassExamples.getStr());

        System.out.println(wrapperClassExamples.getCh());

        System.out.println(wrapperClassExamples.getBi());

        System.out.println(wrapperClassExamples.getaLong());

        System.out.println(wrapperClassExamples.isFlag());

        System.out.println(wrapperClassExamples.getNum1());

        System.out.println(wrapperClassExamples.getNum2());

        // AutoUnboxing

        Integer integer = new Integer(34);

        int ab = integer;

        System.out.println(ab);

    }
}
