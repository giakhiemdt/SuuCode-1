public class TowerOfHanoi{
  public static void move(int n, String origin, String destination, String aux){
    if(n==0){
      return;
    }
    move(n-1,origin,aux,destination);
    System.out.println("- Move disk "+n+" from "+origin+" to "+destination);
    move(n-1,aux,destination,origin);
  }
  public static void main(String[] args){
    move(3,"S","D","A");
  }
}
