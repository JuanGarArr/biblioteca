package com.jgarcia.biblio;

public class Main {
    public static void main(String[] args) {

        //Libro
        Book book = new Book();
        book.setIsbn(1);
        book.setAuthor("----");
        book.setName("----");
        book.setGenre("----");
        book.setDate("1/1/2001");
        System.out.println(book.getIsbn());
        System.out.println(book.getAuthor());
        System.out.println(book.getName());
        System.out.println(book.getGenre());
        System.out.println(book.getDate());

        //autor
        Author author = new Author();
        author.setName("----");
        author.setSurname("----");
        author.setLocation("----");
        author.setBirthdate("2/2/2002");
        System.out.println(author.getName());
        System.out.println(author.getSurname());
        System.out.println(author.getLocation());
        System.out.println(author.getBirthdate());

        //Genero
        Genre genre = new Genre();
        genre.setId(1);
        genre.setName("----");
        genre.setDescription("----");

        //usuario
        User user = new User();
        user.setName("----");
        user.setSurname("----");
        user.setDni(2);
        user.setAddres("---- ");
        user.setPhonenumber("1");
        System.out.println(user.getName());
        System.out.println(user.getSurname());
        System.out.println(user.getDni());
        System.out.println(user.getAddress());
        System.out.println(user.getPhonenumber());

        //Prestamo
        Lend lend = new Lend();
        lend.setBookisbn(1);
        lend.setLendDate("----");
        lend.setUserData("----");
        lend.setReturnDate("----");
    }
}