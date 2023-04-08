package MainPackage.JavaBasics.modifier;

public class DefaultModifier {
    int k =100; // This instance variable is having default access MainPackage.JavaBasics.operators.modifier

    public static void main(String[] args){
        DefaultModifier d1 = new DefaultModifier();
        System.out.println(d1.k);
    }

}
