package part2;

public class MarkerStyle {
    private String iconType;
    private String color;
    private String labelStyle;
    public MarkerStyle(String iconType, String color, String labelStyle) {
        this.iconType = iconType;
        this.color = color;
        this.labelStyle = labelStyle;
    }
    public void render(String location) {
        System.out.println("Location: " + location + " - Icon: " + iconType + ", Color: " + color + ", LabelStyle: " + labelStyle);
    }
}

