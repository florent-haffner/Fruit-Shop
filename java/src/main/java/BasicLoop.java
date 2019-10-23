import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BasicLoop {

   public List<Article> array = new ArrayList<>();

   /* method(string) -> return instance article */

    public void loop() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("> ");
        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            System.out.println(doSomethingWithInput(input));
            System.out.print("> ");
        }
    }

    public int returnAddition(List<Article> array) {
        int prix = 0;
        int nombreCerises = 0;
        int nombreBananes = 0;
        for (Article article : array) {
            int reduction = 0;
            if (article.nom.toLowerCase().equals("cerises")) {
                nombreCerises++;
                if(nombreCerises >= 2) {
                    reduction = 20;
                }
            }
            if (article.nom.toLowerCase().equals("bananes")) {
                nombreBananes++;
                if(nombreBananes >= 2) {
                    reduction = 250;
                }
            }
            prix += (article.prix - reduction);
        }
        return prix;
    }

    public int doSomethingWithInput(String input) {
        Article article = this.returnObjectArtcle(input.toLowerCase());
        this.array.add(article);
        return returnAddition(this.array);
    }

    public Article returnObjectArtcle(String input) throws NullPointerException{
        if (input.equals("cerises")) {
            return new Cerises();
        }
        if (input.equals("pommes") || input.equals("apples")) {
            return new Pommes();
        }
        if (input.equals("melees")) {
            Pommes pommes = new Pommes();
            pommes.prix -= 20;
            return pommes;
        }
        if (input.equals("bananes")) {
            return new Bananes();
        }
        throw new NullPointerException();
    }

    public static void main(String[] args) {
        new BasicLoop().loop();
    }

}
