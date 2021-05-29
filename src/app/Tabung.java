package app;

public class Tabung {
    private final float PI = (float) 22 / 7;
    private float radius, height;

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float volume() {
        return PI * radius * radius * height;
    }

    public float luasPermukaan() {
        return 2 * PI * radius * (radius + height);
    }
}
