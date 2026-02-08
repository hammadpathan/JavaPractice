package SmartPrinter;
import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
         // setup both printers

         ComplexPrinter cprinter = new ComplexPrinter();
         SimplePrinter sprinter = new SimplePrinter();

         // i could have made a class for docs and used docs as objects here with contents
         //cprinter.print("Doc 1");
         //sprinter.print("Doc 2");
         //cprinter.scan("Doc 2");
         //cprinter.fax("Doc 2");
         //lets make a document class

         Document doc1 = new Document("Doc1");
         Document doc2 = new Document("Doc2");

        cprinter.print(doc1);
        sprinter.print(doc2);
        cprinter.scan(doc2);
        cprinter.fax(doc2);

        Scanner input = new Scanner(System.in);
        System.out.println("Write contents for a new file");

        String contents = input.nextLine();
        Document userDoc = new Document(contents);

        sprinter.print(userDoc);
     }
}
