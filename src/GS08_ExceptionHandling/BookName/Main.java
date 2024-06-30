package GS08_ExceptionHandling.BookName;

public class Main {
    static void validate(String bookname) throws InvalidBookNameException{
        if(!bookname.startsWith("LPU")){
            throw new InvalidBookNameException(bookname + "doesn't start with LPU");
        }
        System.out.println("Book name is validated");
    }

    public static void main(String[] args) {
        try {
            validate("LPU Python DSA ");
            validate("DSA Karo");

        } catch (InvalidBookNameException e) {
            System.out.println(e.getMessage());
        }
    }
}
