package SmartPrinter;

public class SimplePrinter implements Printer {

    public void print(Document doc) {
        System.out.println("Printing: " + doc.content);
    }
}
