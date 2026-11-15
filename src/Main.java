void main() {
    Author tolkien = new Author("Джон", "Толкин");
    Author orwell = new Author("Джордж", "Оруэлл");

    Book lordOfTheRings = new Book("Властелин колец", tolkien, 1954);
    Book nineteenEightyFour = new Book("1984", orwell, 1948);

    System.out.println("Книга: " + lordOfTheRings.getTitle() +
            ", Автор: " + lordOfTheRings.getAuthor().getFirstName() + " " + lordOfTheRings.getAuthor().getLastName() +
            ", Год: " + lordOfTheRings.getPublicationYear());

    System.out.println("Книга: " + nineteenEightyFour.getTitle() +
            ", Автор: " + nineteenEightyFour.getAuthor().getFirstName() + " " + nineteenEightyFour.getAuthor().getLastName() +
            ", Год: " + nineteenEightyFour.getPublicationYear());

    nineteenEightyFour.setPublicationYear(1949);
    System.out.println("Обновленный год публикации книги «" + nineteenEightyFour.getTitle() + "»: " + nineteenEightyFour.getPublicationYear());
}

