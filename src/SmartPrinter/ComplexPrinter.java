package SmartPrinter;

public class ComplexPrinter implements Printer, Scanner, Faxer {
    public void print(Document doc) {
        System.out.println("Printing: " + doc.content);
    }

    public void fax(Document doc) {
        System.out.println("Faxing: " + doc.content);
    }

    public void scan(Document doc) {
        System.out.println("Scanning: " + doc.content);
    }
}
