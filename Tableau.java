public class Tableau{
    private int valeur;
    private int  taille;
    private int  index;
    private int  nombre;

    public Tableau(int v,int ta,int in){
        this.valeur=v;
        this.taille=ta;
        this.index=in;
    }
    public Tableau(Tableau t ,int v,int ta){
        this.valeur=t.valeur;
        this.taille = t.taille;
        this.index = t.index;
    }
    public static void main(String[] args) {
         Tableau = new int[n];
        for(int i = 0;i<n; i++){
        Tableau[i]= i+1;
    System.out.print(valeur + "");

    }
  }
}
