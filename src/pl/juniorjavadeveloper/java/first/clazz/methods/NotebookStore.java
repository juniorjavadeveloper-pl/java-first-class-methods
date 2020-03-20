package pl.juniorjavadeveloper.java.first.clazz.methods;

public class NotebookStore {
    public static void main(String[] args) {
        Notebook blankNotebook = new Notebook();
        blankNotebook.pages = 10;

        System.out.println("Obecna strona notatnika: " + blankNotebook.currentPage);
        blankNotebook.goToPage(6);
        System.out.println("Po przejściu na wybraną stronę: " + blankNotebook.currentPage);

        System.out.println("Jesteś na stronie: " + blankNotebook.currentPage);
        int currentPageAfterWrite = blankNotebook.write("Notatki Junior Java Developer'a.");
        System.out.println("Po zrobieniu notatki jesteś na stronie: " + currentPageAfterWrite);
    }
}