/*
28) Write a Java program that creates a simple book database (use an array of N objects). Each book is represented with a ID, title, author (First Name & last name), Genre (category –technical, Sci Fi, Fiction, Comedy etc) and a Publisher name. Define methods to perform the following tasks: 
1. Given a title, returns a status to indicate whether or not the book exists in database. 
2. Given a string “str”, lists the details of all the books whose title contains str. 
3. Given a genre, lists publishers who have published books in that genre. Q2
4. Given a character “c”, lists all authors who name starts with “c”. 
*/

class book{
    int id;
    String title, author, genre, publisher;
    book(int id,  String title, String author, String genre, String publisher ){
        this.id = id;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.publisher = publisher;
    }
}

class TW28_bookDatabase {
    public static void main(String[] args){
        book[] b = new book[4];
        
        b[0] = new book(101, "Java Programming", "james Gosling", "Technical", "PHI");
        b[1] = new book(102, "Java Made Easy", "Dennis Ritchie", "Technical", "MIT");
        b[2] = new book(103, "Programming with C", "Balaguruswamy", "Technical", "VTU");
        b[3] = new book(104, "Programming with C++", "Balaguruswamy", "Technical", "PHI");
        if(checkTitle(b,"Fun with Python") == true)
            System.out.println("The title exits in the database");
        else
            System.out.println("The title does not exits in the database");
        listTitles(b, "Java");
        checkGenre(b, "Comedy");
        listAuthors(b, 'D');
        
    }
    static boolean checkTitle(book[] b , String title){
        for(book b1: b)
            if(b1.title.equals(title) == true)
                return true;
            return false;
    }
    static void listTitles(book[] b , String str){
        int i=0;
        System.out.println(str + " appears in the following titles: ");
        for(book b1: b){
            if(b1.title.indexOf(str) != -1){
                System.out.println(b1.title);
                i++;
            }
        }
        if(i==0)
            System.out.println("Not Found");
    }
    
    static void checkGenre(book[] b , String genre){
        int i=0;
        System.out.println(" Following publishers have published books on " + genre + ":");
        for(book b1: b){
            if(b1.genre.equals(genre) == true){
                System.out.println(b1.publisher);
                i++;
            }
        }
        if(i==0)
            System.out.println("Not Found");
    }
    
     static void listAuthors(book[] b , char c){
        int i=0;
        System.out.println(" Auhtors whose names start with " + c + ":");
        for(book b1: b){
            if(b1.author.charAt(0) == c){
                System.out.println(b1.author);
                i++;
            }
        }
        if(i==0)
            System.out.println("Not Found");
    }
}