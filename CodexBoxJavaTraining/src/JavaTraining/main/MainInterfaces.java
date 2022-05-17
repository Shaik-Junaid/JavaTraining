package JavaTraining.main;

import JavaTraining.sample.inheritance.Iphone12;
import JavaTraining.sample.inheritance.IphoneXR;
import JavaTraining.sample.inheritance.Two;

import java.util.Scanner;

public class MainInterfaces
{
    public static void main(String[] args)
    {
        Iphone12 iphone12 = new Iphone12();

        iphone12.setMobileModel("203938JKL");

        System.out.println(iphone12.getMobileModel());

        iphone12.setModel("Iphone13 Pro Max");

        System.out.println(iphone12.getModel());

        IphoneXR iphoneXR = new IphoneXR();

        iphoneXR.setColor("Parrot Green");

        System.out.println(iphoneXR.getColor());

        IphoneXR iphone121 = new Iphone12();

        iphone121.setColor("White");

        System.out.println(iphone121.getColor());

        System.out.println("===============JAVA PROGRAM FOR SINGLE INHERITANCE==============");

        Two two1 = new Two();

        two1.printMessage();

        two1.printMessage2();

        two1.printMessage3();
    }


}
