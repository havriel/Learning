package Vector;

public class TestVector {
    public static void main(String[] args) {
        Vector v1 = new Vector(2,13,6);
        Vector v2 = new Vector(14,23,19);
        System.out.println("Length v1 ="+v1.length());
        System.out.println("Length v2 ="+v2.length());
        System.out.println("Scalar product ="+v1.scalar(v2));
        System.out.println(v1.vec(v2));
        System.out.println("Cosinus ="+v1.cosinus(v2));
        System.out.println(v1.sum(v2));
        System.out.println(v1.difference(v2));
        Vector[] vectors = Vector.generate(10);
        for (int i=0;i<vectors.length;i++){
            System.out.println(vectors[i]);
        }
    }
}
