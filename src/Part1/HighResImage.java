package Part1;

public class HighResImage {
    private String ImageFile;
    public HighResImage(String ImageFile) {
        this.ImageFile = ImageFile;
        loadFromDisk();
    }
    private void loadFromDisk() {
        System.out.println("Жоғары сапалы сурет жүктелді: " + ImageFile);
    }
    public void displayThumbnail() {
        System.out.println("Миниатюра көрсетілді: " + ImageFile);
    }
    public void displayFullImage() {
        System.out.println("Толық сурет көрсетілді: " + ImageFile);
    }
    public void replaceImage(String newImageFile) {
        ImageFile = newImageFile;
        System.out.println("Сурет ауыстырылды: " + ImageFile);
    }
}

