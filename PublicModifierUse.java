package MainPackage.JavaBasics.modifier;

public class PublicModifierUse { // Call Public Instance Variable from other Class

    public static void main(String[] args){
        PublicModifier t1 = new PublicModifier();
        System.out.println(t1.b);
    }
}
