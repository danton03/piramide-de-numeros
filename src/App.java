public class App {
    public static void main(String[] args) throws Exception {
        int x = 5;
        iteraNumeros(x);
    }
    
    static void iteraNumeros(int x){
        for (int i = 1; i <= x; i++) {
            String linha = "";
            for (int j = 1; j <= i; j++) {
                linha+=(i+" ");
            }
            System.out.println(linha);
        }
    }
}