public class Main {

    public static void main(String[] args) {

        Author LevTolstoy = new Author("Лев", "Толстой");
        Book WarAndPeace = new Book("Война и мир", 1867);

        Author JoanneRowling = new Author("Джоан", "Роулинг");
        Book HarryPotter = new Book("Гарри Поттер и философский камень", 1997);
        // Вызов методов

        System.out.println("\nКнига: \"" + WarAndPeace.getBookName() + "\"\nГод публикации: " + WarAndPeace.getYear());
        System.out.println("Автор: " + LevTolstoy.getAuthorName() + " " + LevTolstoy.getAuthorSurname());

        System.out.println("\nКнига: \"" + HarryPotter.getBookName() + "\"\nГод публикации: " + HarryPotter.getYear());
        System.out.println("Автор: " + JoanneRowling.getAuthorName() + " " + JoanneRowling.getAuthorSurname());

        HarryPotter.setYear(2000);
        // изменяем год публикации (Марти Макфлай, перестань баловаться) с помощью сеттера

        System.out.println("\nКнига: \"" + HarryPotter.getBookName() + "\". Год публикации: " + HarryPotter.getYear());

    }
}