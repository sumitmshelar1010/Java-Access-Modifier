package MainPackage.JavaBasics.modifier;

public class AccessDefaultModifier {

    // 'k' is an instance variable without any access MainPackage.JavaBasics.operators.modifier so,
    // it is considered as default access MainPackage.JavaBasics.operators.modifier

    public static void main(String[] args) {
        DefaultModifier a1 = new DefaultModifier();
        System.out.println(a1.k);
    }
}
