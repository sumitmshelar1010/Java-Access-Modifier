package MainPackage.JavaBasics.modifier;

public class PrivateModifier {// Using Private and Public Modifier to instance variable
    private int a =10;//private access MainPackage.JavaBasics.operators.modifier allows to access with in a class only
    public int b =20;
    public static void main(String[] args){
        PrivateModifier t = new PrivateModifier();
        System.out.println(t.a);
        System.out.println(t.b);
    }
}
