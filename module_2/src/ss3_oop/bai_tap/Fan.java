package ss3_oop.bai_tap;

public class Fan {
    int SLOW = 1;
    int MEDIUM = 2;
    int FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public int getSLOW() {
        return SLOW;
    }

    public void setSLOW(int SLOW) {
        this.SLOW = SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public void setMEDIUM(int MEDIUM) {
        this.MEDIUM = MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public void setFAST(int FAST) {
        this.FAST = FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public Fan() {
        this.setSpeed(SLOW);
        this.setOn(false);
        this.setRadius(5.0);
        this.setColor("BLUE");
    }

    @Override
    public String toString() {
        if (on){
            return "Fan{" + "fan is on"+
                    ", speed='" + speed + '\'' +
                    ", on=" + on +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    '}';
        }else {
            return "Fan{" + "fan is off"+
                    ", on=" + on +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    '}';
        }


    }



    public static void main(String[] args) {
        Fan fan1 = new Fan(3, true, 10, "yellow");
        Fan fan2 =new Fan(2, false, 5, "blue");
        System.out.println(fan1);
        System.out.println(fan2);

    }
}
