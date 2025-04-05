package part2;
import java.util.*;
public class FlyweightDemo {
    public static void main(String[] args) {
        List<Marker> markers = new ArrayList<>();
        String[] types = {"Hospital", "Gas", "Restaurant"};
        for (int i = 0; i < 1000; i++) {
            String type = types[i % 3];
            String color = switch (type) {
                case "Hospital" -> "White";
                case "Gas" -> "Red";
                default -> "Brown";
            };
            String labelStyle = "Bold";

            MarkerStyle style = MarkerStyleFactory.getStyle(type, color, labelStyle);
            Marker marker = new Marker("Loc is " + i, style);
            markers.add(marker);
        }
        for (int i = 0; i < 5; i++) {
        markers.get(i).draw();
        }
                System.out.println("Unique styles: " + MarkerStyleFactory.getUniqueStyleCount());
        System.out.println("Total Markers: " + markers.size());
        }
        }

