package Animal;

public class animal {
    public void animalsound(){
        System.out.println("The animal makes a sound:");
    }
}
class pig extends animal{
   public void animalsound(){
       System.out.println("The pig says: wee wee");
   }
}
class dog extends animal{
    public void animalsound(){
        System.out.println("The dog says:bow bow");
    }
}
class cat extends animal{
    @Override
    public void animalsound() {
        System.out.println("The cat says:meow meow");
    }
}
class cow extends animal{
    @Override
    public void animalsound() {
        System.out.println("The cow says: moo moo");
    }
}
