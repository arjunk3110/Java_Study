package oops_Abstraction;


// Abstract class
public abstract class Google
{

															// Abstract method to be implemented by subclasses
	abstract void search();			
    
    														// Concrete method
    void Message() {
        System.out.println("Thanks for using Google");
    }
}



// Subclass implementing the abstract method

class NewsSearch extends Google
{
    @Override
    void search() {
        System.out.println("News Search results");
    }
}



// Subclass implementing the abstract method
class ImageSearch extends Google {
    @Override
    void search() {
        System.out.println("Images search results");
    }
}



// Subclass implementing the abstract method
class VideosSearch extends Google {
    @Override
    void search() {
        System.out.println("Videos search results");
    }
}

