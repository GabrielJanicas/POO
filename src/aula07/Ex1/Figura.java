package aula07.Ex1;

public abstract class Figura {

    private String colour;

    public abstract double getArea();
    public abstract double getPerimeter();

    public void setColour(String colour) {
        this.colour = colour;
    }
    
    public String getColour() {
        return this.colour;
    }

}