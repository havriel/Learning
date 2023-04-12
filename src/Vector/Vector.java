package Vector;

public class Vector {
    private double x,y,z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double length(){
        return Math.sqrt(Math.pow(x,2)+Math.pow(y,2)+Math.pow(z,2));
    }

    public double scalar(Vector v1){
        return v1.x*x+v1.y*y+v1.z+z;
    }

    public Vector vec(Vector v1){
        return new Vector(
                v1.y*z-v1.z*y,
                v1.z*x-v1.x*z,
                v1.x*y-v1.y*x);
    }

    public double cosinus(Vector v1){
        return scalar(v1)/(length()*v1.length());
    }

    public Vector sum(Vector v1){
        return new Vector(
                v1.x+x,
                v1.y+y,
                v1.z+z);
    }

    public Vector difference(Vector v1){
        return new Vector(
                x-v1.x,
                y-v1.y,
                z-v1.z);
    }

    public static Vector[] generate(int n){
        Vector[] vectors = new Vector[n];
        for (int i=0;i<vectors.length;i++){
            vectors[i] = new Vector(Math.random(),Math.random(),Math.random());
        }
        return vectors;
    }

    @Override
    public String toString() {
        return "Vector{"+x+";"+y+";"+z+"}";
    }
}
