package CodingQuestions;

public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int KB)
    {
        if (KB < 0)
        {
            System.out.println("Invalid Value");
        }
        else{
            int mb = KB/1024;
            int kb = KB%1024;
            System.out.println(KB+" KB = "+mb+" MB "+"and "+kb+" KB");
        }
    }
}
