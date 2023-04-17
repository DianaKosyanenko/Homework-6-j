import java.util.HashSet;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите id ноутбука");
        int id = scanner.nextInt();
        


        Compiuter compiuter = new Compiuter("DDR", "128ГБ", "Windows", "Black", "Linovo", 13);
        Compiuter anotherCompiuter = new Compiuter("DDR2", "256ТБ", "Linux", "White", "ASUS", 16);
        Compiuter secondCompiuter = new Compiuter("DDR4", "137ТБ", "Mac OS", "White", "iMac", 5);
        HashSet<Compiuter> compiuterSet = new HashSet<>();
        compiuterSet.add(compiuter);
        compiuterSet.add(anotherCompiuter);
        compiuterSet.add(secondCompiuter);
        if (id == 13) {
            System.out.println(compiuter);
        }
        else if ( id == 16){
            System.out.println(anotherCompiuter);
        } else if (id == 5) {
            System.out.println(secondCompiuter);

        } else{
            System.out.println("Такого компьютера нет");
        }

    }
}


