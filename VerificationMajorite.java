public class VerificationMajorite {
    int age;
    public VerificationMajorite(int age){
        this.age=age;
    }
    public void MajeurMineur() {
        System.out.println("Age passe en argument :" + age);
        if (age >= 18) {
            System.out.println("Vous etes majeur.");
        } else {
            System.out.println("Vous etes mineur.");
        }   
    }
    public static void main(String[] args) {
        VerificationMajorite agePersonne = new VerificationMajorite(20);
        agePersonne.MajeurMineur();
    }
}
