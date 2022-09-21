public class ImageLoader {
    private static ImageLoader imageLoader = null;
    private ImageLoader(){
    }
    public static ImageLoader getInstance(){
        if (imageLoader==null) {
            imageLoader  = new ImageLoader();
        }
        return imageLoader;
    }
    public String loadImage() {
        return "Loaded successfully";
    }
}