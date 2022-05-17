package JavaTraining.main;

import JavaTraining.sample.singleton.SingleTonExample;

public class MainSingleTon
{
    public static void main(String[] args) {
        SingleTonExample singleTonExample = SingleTonExample.getInstance();
        SingleTonExample singleTonExample1 = SingleTonExample.getInstance();
        SingleTonExample singleTonExample2 = SingleTonExample.getInstance();

        System.out.println(singleTonExample.hashCode());
        System.out.println(singleTonExample1.hashCode());
        System.out.println(singleTonExample2.hashCode());
    }
}
