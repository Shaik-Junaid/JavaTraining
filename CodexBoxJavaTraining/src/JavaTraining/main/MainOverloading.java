package JavaTraining.main;

import JavaTraining.sample.overloadingandoverriding.OverLoading;
import JavaTraining.sample.overloadingandoverriding.Overriding;

public class MainOverloading
{
    public static void main(String[] args)
    {

        OverLoading mol = new OverLoading();

        mol.multiplication(30,90);

        mol.multiplication(3,9,87.9f);

        mol.multiplication(3.5f,4.5f,6.5f);

        OverLoading override = new Overriding();

        override.multiplication(10,20);

        Overriding overriding1 = new Overriding();

        overriding1.multiplication(20,30);

    }
}
