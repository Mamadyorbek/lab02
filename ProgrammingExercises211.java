package programming.exercises.pkg2.pkg11;
public class ProgrammingExercises211 {
    public static void main(String[] args) {
        System.out.println("The current population of the U.S is 312032486");
        int population1 = ((31536000 / 7) - (31536000 / 13) + (31536000 / 45)) + 312032486;
        int population2 = ((31536000 * 2) / 7) - ((31536000 * 2) / 13) + ((31536000 * 2) / 45) + 312032486;
        int population3 = ((31536000 * 3) / 7) - ((31536000 * 3) / 13) + ((31536000 * 3) / 45) + 312032486;
        int population4 = ((31536000 * 4) / 7) - ((31536000 * 4) / 13) + ((31536000 * 4) / 45) + 312032486;
        int population5 = ((31536000 * 5) / 7) - ((31536000 * 5) / 13) + ((31536000 * 5) / 45) + 312032486;
        System.out.println("Population of the US after 1 year is " + population1);
        System.out.println("Population of the US after 2 year is " + population2);
        System.out.println("Population of the US after 3 year is " + population3);
        System.out.println("Population of the US after 4 year is " + population4);
        System.out.println("Population of the US after 5 year is " + population5);
        
    }
    
}
