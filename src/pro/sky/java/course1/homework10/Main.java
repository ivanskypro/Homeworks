package pro.sky.java.course1.homework10;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        Author author1 = new Author("Лев", "Толстой");
        Book book1 = new Book("Война и Мир", author1, 1954);

        System.out.println(author1.getFirstName() + author1.getSecondName());

        book1.setYear(1999);
        System.out.println(book1.getYear());

        Author author2 = new Author("Гжегош", "Бженчишчикевич");
        Book book2 = new Book("Приключение канонира Доласа", author2, 1978);
        System.out.println(author2);

        //Author author3 = new Author("Карлос", "Кастанеда");
        //Author author4 = new Author("Карлос", "Кастанеда");

        System.out.println(author1.equals(author2));

        System.out.println(book1);
        System.out.println(book2);


        System.out.println(author1.hashCode());
        System.out.println(author2.hashCode());

        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());








    }
}
