package part2;

public class Marker {
    private String location;
    private MarkerStyle style;
    public Marker(String location, MarkerStyle style) {
        this.location = location;
        this.style = style;
    }
    public void draw() {
        style.render(location);
    }
}
