package Point_MoveablePoint;

public class MoveablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MoveablePoint() {
        super();
    }

    public MoveablePoint(float xSpeed, float ySpeed) {
        super();
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(xSpeed, ySpeed);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        return new float[] {xSpeed, ySpeed};
    }

    @Override 
    public String toString() {
        return "(" + getX() + ", " + getY() + "), speed = (" + getxSpeed() + ", " + getySpeed() + ")"; 
    }

    public MoveablePoint move() {
        float newX = super.getX() + xSpeed;
        float newY = super.getY() + ySpeed;
        super.setX(newX);
        super.setY(newY);
        return this;
    }
}
