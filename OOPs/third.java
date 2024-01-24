public class TrafficLight {
    private String color;
    private int duration;

    // Constructor to initialize color and duration
    public TrafficLight(String color, int duration) {
        this.color = color;
        this.duration = duration;
    }

    // Getter for color
    public String getColor() {
        return color;
    }

    // Setter for color
    public void setColor(String color) {
        this.color = color;
    }

    // Getter for duration
    public int getDuration() {
        return duration;
    }

    // Setter for duration
    public void setDuration(int duration) {
        this.duration = duration;
    }

    // Method to change the color of the traffic light
    public void changeColor(String newColor) {
        setColor(newColor);
        System.out.println("Traffic light color changed to " + newColor);
    }

    // Method to check if the light is red
    public boolean isRed() {
        return getColor().equalsIgnoreCase("red");
    }

    // Method to check if the light is green
    public boolean isGreen() {
        return getColor().equalsIgnoreCase("green");
    }

    public static void main(String[] args) {
        // Create an instance of the TrafficLight class
        TrafficLight trafficLight1 = new TrafficLight("red", 60);

        // Display initial traffic light information
        System.out.println("Traffic Light Information:");
        System.out.println("Color: " + trafficLight1.getColor());
        System.out.println("Duration: " + trafficLight1.getDuration() + " seconds");

        // Change the color of the traffic light
        trafficLight1.changeColor("green");

        // Display updated traffic light information
        System.out.println("Updated Traffic Light Information:");
        System.out.println("Color: " + trafficLight1.getColor());
        System.out.println("Duration: " + trafficLight1.getDuration() + " seconds");

        // Check if the light is red or green
        System.out.println("Is the light red? " + trafficLight1.isRed());
        System.out.println("Is the light green? " + trafficLight1.isGreen());
    }
}
