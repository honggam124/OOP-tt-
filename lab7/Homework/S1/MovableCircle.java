class MovableCircle implements Movable {
    int radius;
    MovablePoint center;
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        center = new MovablePoint(x,y,xSpeed,ySpeed);
        this.radius = radius;
    }
    public String toString() {
        return "center: ["+center.x+","+center.y+"], radius: "+this.radius+"]";
    }
    public void moveUp() {
        center.y = center.y + center.ySpeed;
    }
    public void moveDown() {
        center.y = center.y - center.ySpeed;
    }
    public void moveLeft() {
        center.x = center.x + center.xSpeed;
    }
    public void moveRight() {
        center.x = center.x - center.xSpeed;
    }
}