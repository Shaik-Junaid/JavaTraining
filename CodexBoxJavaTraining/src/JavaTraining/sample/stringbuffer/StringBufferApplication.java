package JavaTraining.sample.stringbuffer;

// Java Program to Illustrate StringBuffer class
// via length() and capacity() methods
// via append() method
// via insert() method
// via delete() and deleteCharAt() Methods
// via replace() method

public class StringBufferApplication
{
    public static void main(String[] args)
    {
        StringBuffer sb = new StringBuffer("Java Training at Codex box Organisation");

        int l = sb.length()/2;

        int c = sb.capacity();

        System.out.println("The Length of the StingBuffer is: " + l);

        System.out.println("The Capacity of the StringBuffer is: " + c);

        sb.append(" Started ");

        System.out.println(sb);

        sb.append("\"07-April-2022\"");

        System.out.println(sb);

        sb.insert(46, " at");

        System.out.println(sb);

        sb.insert(65, " and the training will continue till the \"07-July-2022\" ");

        System.out.println(sb);

        System.out.println(sb.indexOf("will"));

        sb.delete(14,16);

        System.out.println(sb);

        sb.deleteCharAt(83);

        System.out.println(sb);

        sb.replace(0,4,"JAVA");

        System.out.println(sb);

        sb.reverse();

        System.out.println(sb);


    }
}
