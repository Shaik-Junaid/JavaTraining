package JavaTraining.sample.ifelse;

public class If_Else_If_Ladder {
    public static void main(String[] args) {
        // Assign a String value
        String name = "Codexbox";

        if (name == "Codex")
        {
            System.out.println("Company name is Codex");
        }
        else if (name == "Box")
        {
            System.out.println("Company name is Box");
        }
        else if (name == "codexBox")
        {
            System.out.println("Company name is codexBox");
        }
        else
        {
            System.out.println("My Company name is Codexbox");
        }
    }
}
