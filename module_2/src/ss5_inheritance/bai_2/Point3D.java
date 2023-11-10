package ss5_inheritance.bai_2;

public class Point3D extends Point2D{
    private float z;
    public Point3D(float x,float y,float z){
        super(x,y);
        this.z=z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public float[] getXYZ(float x,float y,float z){
        float[] array={super.getX(),super.getY(),this.z};
            return array;

    }public void setXYZ(float x,float y,float z) {
      super.setX(x);
      super.setY(y);
      this.z=z;

    }
    @Override
    public String toString() {
        return "Point3D{" +
                ", x=" + super.getX() +
                ", y=" + super.getY() +
                ",z=" + z +
                '}';
    }
    public static void main(String[] args){
        Point3D point3D=new Point3D(1,2,3);
        System.out.println(point3D);
        point3D.setXYZ(4,4,4);
        System.out.println(point3D);
    }
}
