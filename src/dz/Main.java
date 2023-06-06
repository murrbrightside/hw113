package dz;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Book diaryOfGirl = new Book("Anna Frank", 1945);
        new Book("Harper Lee", 1960);
        new Author("Anna", "Frank");
        new Author("Harper", "Lee");
        diaryOfGirl.setYear(1950);
    }
}
