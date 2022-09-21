class Point2D {
    protected float x;
    protected float y;
    public Point2D() {
        this.x = 0.0f;
        this.y = 0.0f;
    }
    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public float getX() {
        return this.x;
    }
    public void setX() {
        this.x = x;
    }
    public float getY() {
        return this.y;
    }
    public void setY() {
        this.y = y;
    }
    public float[] getXY() {
        float[] X_Y = {this.x,this.y};
        return X_Y;
    }
    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public String toString() {
        return "[x:" + this.x + ", y: " +this.y + "]";  
    }

}