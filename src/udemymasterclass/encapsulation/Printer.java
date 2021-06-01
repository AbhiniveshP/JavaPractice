package udemymasterclass.encapsulation;

public class Printer {

    private int tonerLevel, pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.duplex = duplex;
        this.tonerLevel = tonerLevel;
        if (tonerLevel <= -1 || tonerLevel > 100) this.tonerLevel = -1;
    }

    public int addToner(int tonerAmount) {
        if (tonerAmount <= 0 || tonerAmount > 100) return -1;
        if (this.tonerLevel + tonerAmount > 100) return -1;
        this.tonerLevel += tonerAmount;
        return this.tonerLevel;
    }

    public int printPages(int pages) {
        int pagesToPrint = pages;
        if (this.duplex) pagesToPrint = (int)Math.ceil(pages / 2.0);
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return this.pagesPrinted;
    }

    public static void main(String[] args) {
        Printer printer = new Printer(50, true);
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed = " + pagesPrinted);
    }

}

