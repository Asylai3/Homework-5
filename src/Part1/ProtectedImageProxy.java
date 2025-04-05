package Part1;

public class ProtectedImageProxy {
    private ImageProxy proxy;
    private Agent agent;

    public ProtectedImageProxy(ImageProxy proxy, Agent agent) {
        this.proxy = proxy;
        this.agent = agent;
    }

    public void showThumbnail() {
        proxy.displayThumbnail();
    }

    public void showFullImage() {
        proxy.displayFullImage();
    }

    public void uploadOrReplace(String newFile) {
        if (agent.isLoggedIn()) {
            proxy.replaceImage(newFile);
        } else {
            System.out.println("Error: " + agent.getName());
        }
    }
}
