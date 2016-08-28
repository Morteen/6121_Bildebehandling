import ij.ImagePlus;
import ij.plugin.filter.PlugInFilter;
import ij.process.ImageProcessor;

public class Min_bildeFlipper implements PlugInFilter{

	public int setup(String arg,ImagePlus im){
		return DOES_8G; //Denne pluginen aksepterer 8 bits gråskala bilder

	}//setup()

	public void run(ImageProcessor ip){
		
		ip.flipHorizontal();

	}// slutt på run()

}//slutt på My_BildeFlipp klassen