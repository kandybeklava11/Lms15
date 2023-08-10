import javax.swing.plaf.SpinnerUI;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
        public static void main(String[] args) {
Animals animals=new Shark("Shark",20);
Animals[] masan={animals};
Animals animals1=new Turtle("Turtle",80);
Animals[] masan2={animals1};
Animals animals2=new Eagle("Eagle",5);
Animals[] masan3={animals2};

Animals[] aaanimals={animals,animals1,animals2};

                for (Animals anyyyymal: aaanimals) {
                        if(anyyyymal instanceof Shark){
                                Shark sh =(Shark) anyyyymal;
                                System.out.println(sh.method());
                                sh.attack();
                                System.out.println("-----------------------------------------------------------------");
                        } else if (anyyyymal instanceof Turtle) {
                                Turtle turt=(Turtle) anyyyymal;
                                System.out.println(turt.method());
                                turt.swim();
                                System.out.println("-----------------------------------------------------------------");
                        } else if (anyyyymal instanceof Eagle) {
                                Eagle eg=(Eagle) anyyyymal;
                                System.out.println(eg.method());
                                eg.fly();
                                System.out.println("-----------------------------------------------------------------");

                        }

                }
        }
}


