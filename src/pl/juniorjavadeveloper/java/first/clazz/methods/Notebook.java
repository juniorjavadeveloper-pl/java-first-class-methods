package pl.juniorjavadeveloper.java.first.clazz.methods;

public class Notebook {
    int pages;
    int pagesWritten;
    int currentPage;

    int write(String text) {
        System.out.println("Zapisuję tekst na stronie: " + text);
        currentPage = currentPage + 1;

        return currentPage;
    }

    void goToPage(int page) {
        if (page > pages) {
            System.out.println("Nie ma takiej strony");
        } else {
            currentPage = page;
        }
    }
}