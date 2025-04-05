package Part1;

public class ImageProxy implements Image{
    private String ImageFile;
    private HighResImage HighResImage;
    public ImageProxy(String ImageFile) {
        this.ImageFile = ImageFile;
    }
    private HighResImage getImage() {
        if (HighResImage == null) {
            HighResImage = new HighResImage(ImageFile);
        }
        return HighResImage;
    }
    public void displayThumbnail() {
        System.out.println("Төмен сапалы миниатюра: " + ImageFile);
    }
    public void displayFullImage() {
        getImage().displayFullImage();
    }
    public void replaceImage(String newImageFile) {
        getImage().replaceImage(newImageFile);
    }
}

