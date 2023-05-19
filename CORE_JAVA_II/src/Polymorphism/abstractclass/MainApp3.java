package Polymorphism.abstractclass;

abstract class InstagramV1{
    void makePost()
    {
        System.out.println("POST PHOTO AND VIDEO");
    }

    abstract void getStories();
    abstract void getReels();
}

abstract class InstagramV2 extends InstagramV1{

    void getStories()
    {
        System.out.println("MAKE STORIES");
    }
}
 class InstagramV3 extends InstagramV2{
     @Override
     void getReels() {
         System.out.println("WATCH REELS");
     }
 }

public class MainApp3 {
    public static void main(String[] args) {

        InstagramV3 v=new InstagramV3();
        v.getReels();
        v.getStories();
        v.makePost();
    }
}
