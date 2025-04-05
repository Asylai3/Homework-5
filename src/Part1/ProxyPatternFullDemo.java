package Part1;

public class ProxyPatternFullDemo {
    public static void main(String[] args) {
        Agent guest = new Agent("Guest", false);
        Agent agent = new Agent("Employee", true);

        ImageProxy image = new ImageProxy("C:/Users/77026/IdeaProjects/homework part 1 and 2/sky.jpg");

        ProtectedImageProxy guestAccess = new ProtectedImageProxy(image, guest);
        ProtectedImageProxy agentAccess = new ProtectedImageProxy(image, agent);

        guestAccess.showThumbnail();
        guestAccess.showFullImage();
        guestAccess.uploadOrReplace("C:/Users/77026/IdeaProjects/homework part 1 and 2/sky.jpg");

        agentAccess.uploadOrReplace("C:/Users/77026/IdeaProjects/homework part 1 and 2/sky.jpg");
        agentAccess.showFullImage();
    }
}
