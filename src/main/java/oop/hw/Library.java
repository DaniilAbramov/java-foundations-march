package oop.hw;

public class Library {
    public static void main(String[] args) {
        Book idiot = new Book("Достоевский", 365);
        Book oblomov = new Book("Гончаров",150);
        Book warAndPeace = new Book("Толстой",100500);



        System.out.println("Idiot Author = " + idiot.getAuthor());
        idiot.setAuthor("Достоевский Федор Михайлович");
        System.out.println("Idiot full Author = " + idiot.getAuthor());
        System.out.println("idiot Pages = " + idiot.getPages());
        idiot.setPages(400);
        System.out.println("idiot new Pages = " + idiot.getPages());

        System.out.println("oblomov Author = " + oblomov.getAuthor());
        oblomov.setAuthor("Гончаров Иван Александрович");
        System.out.println("oblomov full Author = " + oblomov.getAuthor());
        System.out.println("oblomov Pages = " + oblomov.getPages());
        oblomov.setPages(300);
        System.out.println("oblomov new Pages = " + oblomov.getPages());

        System.out.println("warAndPeace Author = " + warAndPeace.getAuthor());
        warAndPeace.setAuthor("Толстой Лев Николаевич");
        System.out.println("warAndPeace full Author = " + warAndPeace.getAuthor());
        System.out.println("warAndPeace Pages = " + warAndPeace.getPages());
        warAndPeace.setPages(1500);
        System.out.println("warAndPeace new Pages = " + warAndPeace.getPages());

    }
}
