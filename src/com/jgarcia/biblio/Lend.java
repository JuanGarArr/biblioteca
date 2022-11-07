package com.jgarcia.biblio;

public class Lend {

    private Integer bookisbn;
    private String userData;
    private String lendDate;
    private String returnDate;

    public void setBookisbn(Integer bookisbn) {
        this.bookisbn = bookisbn;
    }

    public Integer getBookisbn() {
        return bookisbn;
    }

    public void setUserData(String userData) {
        this.userData = userData;
    }

    public String getUserData() {
        return userData;
    }

    public void setLendDate(String lendDate) {
        this.lendDate = lendDate;
    }

    public String getLendDate() {
        return lendDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }
    public String getReturnDate() {
        return returnDate;
    }
}
