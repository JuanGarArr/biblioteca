package com.jgarcia.biblio;

public class Main {
    public static void main(String[] args) {

        //Libro
        Book book = new Book();
        book.setIsbn(1);
        book.setAuthor("Paco");
        book.setName("Batallas de pablo");
        book.setGenre("romantico");
        book.setDate("1/1/2001");
        System.out.println(book.getIsbn());
        System.out.println(book.getAuthor());
        System.out.println(book.getName());
        System.out.println(book.getGenre());
        System.out.println(book.getDate());

        //autor
        Author author = new Author();
        author.setName("Diego");
        author.setSurname("Lopez");
        author.setLocation("Avila");
        author.setBirthdate("2/2/2002");
        System.out.println(author.getName());
        System.out.println(author.getSurname());
        System.out.println(author.getLocation());
        System.out.println(author.getBirthdate());

        //Genero
        Genre genre = new Genre();
        genre.setId(1);
        genre.setName("Horror");
        genre.setDescription("SI");

        //usuario
        User user = new User();
        user.setName("Sergio");
        user.setSurname("arruche");
        user.setDni(2);
        user.setAddres("Avd si c22 portal 12");
        user.setPhonenumber("748239");
        System.out.println(user.getName());
        System.out.println(user.getSurname());
        System.out.println(user.getDni());
        System.out.println(user.getAddress());
        System.out.println(user.getPhonenumber());

        //Prestamo
        Lend lend = new Lend();
        lend.setId(1);
        lend.setBookisbn(15980-89014213);
        lend.setLendDate();
        lend.setUserData("Name");
        lend.setReturnDate("Not Yet");
        System.out.println(lend.getId());
        System.out.println(lend.getBookisbn());
        System.out.println(lend.getLendDate());
        System.out.println(lend.getUserData());
        System.out.println(lend.getReturnDate());

    }
}