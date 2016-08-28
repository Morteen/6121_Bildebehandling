import ij.ImagePlus;
import ij.plugin.filter.PlugInFilter;
import ij.process.ImageProcessor;

public class Min_Kantmaler implements PlugInFilter{

	public int setup(String arg,ImagePlus im){
		return DOES_8G; //Denne pluginen aksepterer 8 bits gråskala bilder

	}//setup()

	public void run(ImageProcessor ip){
		int w = ip.getWidth();
		int h = ip.getHeight();
		for(int u=0;u<w;u++){
			for(int v=0;v<h;v++){
				int p =ip.getPixel(u,v);
				if(u<=10||v<=10||u>w-10||v>h-10){
					ip.putPixel(u,v,255);
				}else{
					ip.putPixel(u,v,p);
				}
			}
		}
		
		

	}// slutt på run()

}//slutt på My_BildeFlipp klassen