public class CalculatriceAddition {
    int nombre1;
    int nombre2;
    public CalculatriceAddition(int nombre1, int nombre2){
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
    }
    public void SommeNombres(){
        int somme = nombre1 + nombre2;
        System.out.println("La somme des deux nombres est : " + somme);
    }
    public static void main(String[] args) {
        CalculatriceAddition somme = new CalculatriceAddition(10, 2);
        somme.SommeNombres();
    }
}
