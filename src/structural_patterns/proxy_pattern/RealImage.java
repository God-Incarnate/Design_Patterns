package structural_patterns.proxy_pattern;

public class RealImage implements Image{
    private String fileName;

    public RealImage(String fileName){
        this.fileName=fileName;
        loadImage();
    }

    private void loadImage(){
        System.out.println("Loading Image");
    }

    public void display(){
        System.out.println("Displaying Image");
    }
}
