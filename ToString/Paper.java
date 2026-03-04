package ToString;

public class Paper {
    public String title;
    public int id;

    public Paper(String title, int id){
       this.title = title;
       this.id = id;
    }

    public static void main(String[] args){
       Paper[] papers = {new Paper("T1", 1), 
                         new Paper("T2", 2), 
                         new Paper("T3", 3)};

       System.out.println(papers);
       System.out.println(papers[1]);
       System.out.println(papers[1].id);
    }
}

//Point to note: The default toString() method of an array will print the type and hash code, not the contents. To print the contents, you would need to override the toString() method in the Paper class or use Arrays.toString(papers) for the array.
