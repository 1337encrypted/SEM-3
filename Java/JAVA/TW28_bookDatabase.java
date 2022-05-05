/*
28) Write a Java program that creates a simple book database (use an array of N objects). Each book is represented with a ID, title, author (First Name & last name), Genre (category –technical, Sci Fi, Fiction, Comedy etc) and a Publisher name. Define methods to perform the following tasks:
1. Given a title, returns a status to indicate whether or not the book exists in database.
2. Given a string “str”, lists the details of all the books whose title contains str.
3. Given a genre, lists publishers who have published books in that genre. Q2
4. Given a character “c”, lists all authors who name starts with “c”.
*/

class book
{
    public int id;
    public String title, author, genre, publisher;

    book(int id,  String title, String author, String genre, String publisher)
    {
          this.id = id;
          this.title = title;
          this.author = author;
          this.genre = genre;
          this.publisher = publisher;
    }
}

class TW28_bookDatabase
{
    public static void main(String[] args)
    {
          book[] b = new book[4];
        
            b[0] = new book(101, "Java Programming", "james Gosling", "Technical", "PHI");
          b[1] = new book(102, "Java Made Easy", "Dennis Ritchie", "Technical", "MIT");
          b[2] = new book(103, "Programming with C", "Balaguruswamy", "Technical", "VTU");
          b[3] = new book(104, "Programming with C++", "Balaguruswamy", "Technical", "PHI");
        
        System.out.println();
        if(checkTitle(b,"Fun with Python"))
                System.out.println("The title exits in the database");
           else
                System.out.println("The title does not exits in the database");
        System.out.println();

            checkDetails(b, "Java");
        System.out.println();

          checkGenres(b, "Technical");
        System.out.println();

         listAuthors(b, 'D');
        System.out.println();

    }

    public static boolean checkTitle(book books[], String title)
    {
        for(book i : books)
            if(i.title.equals(title))
                return true;
        return false;
    }

    public static void checkDetails(book books[], String str)
    {
        int count = 0;
        System.out.println(str + " appears in the following titles: ");
        for(book i : books)
        {
            if(i.title.indexOf(str) != -1)
            {
                System.out.println(i.title);
                count++;
            }
        }
        if(count == 0)
            System.out.println("Not Found");
    }

    public static void checkGenres(book books[], String genre)
    {
        int count = 0;
        System.out.println("Following publishers have published books on " + genre + ":");
        for(book i : books)
        {
            if(i.genre.equals(genre))
            {
                System.out.println(i.publisher);
                count++;
            }
        }
        if(count == 0)
            System.out.println("Not Found");
    }

    public static void listAuthors(book books[], char c)
    {
        int count = 0;
        System.out.println("Auhtors whose names start with "+c+":");
        for(book i : books)
        {
            if(i.author.charAt(0) == c)
            {
                System.out.println(i.publisher);
                count++;
            }
        }
        if(count == 0)
            System.out.println("Not Found");
    }
}
