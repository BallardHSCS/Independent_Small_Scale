
public class PictureExercise
{
    public static void main(String[] args)
    {    	
        // If you want to not have to pick the image each time, fill in the correct address in the next line and delete the "//" 
        Picture clouds = new Picture("kaeru.jpg");
        //Picture myPicture = new Picture();
        //myPicture.pick();
        
        // Use Picture methods to draw your picture object HERE
        clouds.draw();
        
        
        // Use Picture methods & print\println to print out the height and width of your picture HERE
        double x = clouds.getHeight();
        double y  = clouds.getWidth();
        //uses methods to set two variables x and y to the values of height

        // Provides user with info and height/width
        System.out.println("Your height is "+ x);
        System.out.println("Your width is "+ y );
    }
}
