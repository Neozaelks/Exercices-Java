package fr.neozaelks.intro;

import java.util.*;

public class AlgoSimple {
  public static void main(String[] args) {
//    salutations();
//    addition();
//    stonksOrNotStonks();
//    quiCestLePlusGrand();
//    professeurFlemmard();
//    calculatriceNulle();
//    departementDeLaPrefectureDAmiens();
//    stairwayToHeavenMadeOfStars();
//    pyramidToHeavenMadeOfStars();
//    pyramideChiantePourRien();
//    denominations();
//    plusProcheDe0();
//    triDeListe();
  }

  /**
   * Demande à l'utilisateur son prénom, puis le salue.
   */
  public static void salutations() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Entrez votre prénom :");

    String input = scanner.nextLine();
    System.out.println("Bonjour " + input);
  }

  /**
   * Demande deux nombres à l'utilisateur, les ajoute ensemble, puis retourne le calcul.
   */
  public static void addition(){
    Scanner scanner = new Scanner(System.in);
    int premierNombre;
    int deuxiemeNombre;

    // Boucle conditionnelle permettant de vérifier si les entrées sont bien des nombres.
    boolean isInputLegal = false;
    while (!isInputLegal){
      System.out.println("Entrez votre premier nombre :");
      String premierInput = scanner.nextLine();

      System.out.println("Entrez votre deuxième nombre :");
      String deuxiemeInput = scanner.nextLine();

      try {
        premierNombre = Integer.parseInt(premierInput);
        deuxiemeNombre = Integer.parseInt(deuxiemeInput);
        isInputLegal = true;

        // Maintenant que les entrées sont vérifiées, on peut lancer la logique :
        int resultat = premierNombre + deuxiemeNombre;
        System.out.println(premierNombre + " + " + deuxiemeNombre + " = " + resultat);
      } catch (Exception err){
        System.out.println("Une de vos entrées n'est pas un nombre. Merci de n'entrer que des nombres.");
      }
    }

  }

  /**
   * Demande à l'utilisateur le prix de vente de son produit et son coût de fabrication.
   * Lui retourne s'il fait une perte ou un gain, ainsi que son prix.
   */
  public static void stonksOrNotStonks(){
    Scanner scanner = new Scanner(System.in);
    double prixDeVente;
    double coutDeProduction;

    // Boucle conditionnelle permettant de vérifier si les entrées sont bien des nombres.
    boolean isInputLegal = false;
    while (!isInputLegal){
      System.out.println("Quel est votre prix de vente ?");
      String entreePrixVente = scanner.nextLine();

      System.out.println("Quel est votre coût de production ?");
      String entreeCoutProduction = scanner.nextLine();

      try {
        prixDeVente = Double.parseDouble(entreePrixVente);
        coutDeProduction = Double.parseDouble(entreeCoutProduction);
        isInputLegal = true;

        // Maintenant que les entrées sont vérifiées, on peut lancer la logique :

        // Si le prix de vente est supérieur au coût de production, il fait un profit
        if(prixDeVente > coutDeProduction){
          double marge = prixDeVente - coutDeProduction;
          System.out.println("Vous faites un profit de " + marge + "€ par produit.");
        }
        // Si le cout de production est supérieur au prix de vente, il perd de l'argent
        else if(prixDeVente < coutDeProduction){
          double pertes = coutDeProduction - prixDeVente;
          System.out.println("Vous faites une perte de " + pertes + "€ par produit.");
        }

        // Sinon, il ne fait pas d'argent sur son produit.
        else {
          System.out.println("Vous ne faites pas d'argent sur votre produit.");
        }
      } catch (Exception err){
        System.out.println("Une de vos entrées n'est pas un nombre. Merci de n'entrer que des nombres.");
      }
    }
  }

  /**
   * Demande à l'utilisateur 3 nombres, puis lui retourne le plus grand.
   */
  public static void quiCestLePlusGrand(){
    Scanner scanner = new Scanner(System.in);
    int premierNombre;
    int deuxiemeNombre;
    int troisiemeNombre;

    // Boucle conditionnelle permettant de vérifier si les entrées sont bien des nombres.
    boolean isInputLegal = false;
    while (!isInputLegal){
      System.out.println("Entrez votre premier nombre :");
      String premierInput = scanner.nextLine();

      System.out.println("Entrez votre deuxième nombre :");
      String deuxiemeInput = scanner.nextLine();

      System.out.println("Entrez votre troisième nombre :");
      String troisiemeInput = scanner.nextLine();

      try {
        premierNombre = Integer.parseInt(premierInput);
        deuxiemeNombre = Integer.parseInt(deuxiemeInput);
        troisiemeNombre = Integer.parseInt(troisiemeInput);
        isInputLegal = true;

        // Maintenant que les entrées sont vérifiées, on peut lancer la logique :
        int[] listeDesNombres = new int[] {premierNombre, deuxiemeNombre, troisiemeNombre};
        // On va boucler sur chaque nombre de la liste des entrées pour savoir lequel est le plus grand.
        int nombreLePlusGrand = listeDesNombres[0];
        for (int listeDesNombre : listeDesNombres) {
          if (listeDesNombre > nombreLePlusGrand) {
            nombreLePlusGrand = listeDesNombre;
          }
        }

        System.out.println("Le nombre le plus grand est : " + nombreLePlusGrand + ".");
      } catch (Exception err){
        System.out.println("Une de vos entrées n'est pas un nombre. Merci de n'entrer que des nombres.");
      }
    }
  }

  /**
   * Demande à l'utilisateur une note comprise entre 0 et 20, et lui retourne une appréciation adaptée.
   */
  public static void professeurFlemmard(){
    Scanner scanner = new Scanner(System.in);
    int note;

    // Boucle conditionnelle permettant de vérifier si les entrées sont bien des nombres.
    boolean isInputLegal = false;
    while (!isInputLegal){
      System.out.println("Entrez la note :");
      String inputNote = scanner.nextLine();

      try {
        note = Integer.parseInt(inputNote);
        if(note >= 0 && note <= 20){
          isInputLegal = true;
          // Maintenant que les entrées sont vérifiées, on peut lancer la logique.

          if(note <= 4){
            System.out.println("Catastrophique, il faut tout revoir");
          } else if(note <= 10){
            System.out.println("Insuffisant");
          } else if(note <= 14){
            System.out.println("Peut mieux faire");
          } else if(note <= 17){
            System.out.println("Bien");
          } else{
            System.out.println("Excellent, bon travail");
          }

        } else{
          System.out.println("Ceci n'est pas une note.");
        }

      } catch (Exception err){
        System.out.println("Votre entrée n'est pas un nombre. Merci de n'entrer que des nombres.");
      }
    }
  }

  /**
   * Demande à l'utilisateur un opérande, un opérateur et un autre opérande, puis retourne le résultat.
   */
  public static void calculatriceNulle(){
    Scanner scanner = new Scanner(System.in);
    int premierNombre;
    int deuxiemeNombre;
    String operateur;

    // Boucle conditionnelle permettant de vérifier si les entrées sont bien des nombres.
    boolean isInputLegal = false;
    while (!isInputLegal){
      System.out.println("Entrez votre premier nombre :");
      String premierNombreEntree = scanner.nextLine();

      System.out.println("Entrez un opérateur (+, -, *, /)");
      operateur = scanner.nextLine();

      System.out.println("Entrez votre deuxième nombre :");
      String deuxiemeNombreEntree = scanner.nextLine();

      try {
        premierNombre = Integer.parseInt(premierNombreEntree);
        deuxiemeNombre = Integer.parseInt(deuxiemeNombreEntree);

        //On vérifie si l'opérande est légale
        if(Objects.equals(operateur, "+") || Objects.equals(operateur, "-")
          || Objects.equals(operateur, "*") || Objects.equals(operateur, "/")){
          isInputLegal = true;

          // Maintenant que les entrées sont vérifiées, on peut lancer la logique :
          switch (operateur) {
            case "+" -> {
              double result = premierNombre + deuxiemeNombre;
              System.out.println(premierNombre + " + " + deuxiemeNombre + " = " + result);
            }
            case "-" -> {
              double result = premierNombre - deuxiemeNombre;
              System.out.println(premierNombre + " - " + deuxiemeNombre + " = " + result);
            }
            case "/" -> {
              double result = (double)premierNombre / deuxiemeNombre;
              System.out.println(premierNombre + " / " + deuxiemeNombre + " = " + result);
            }
            case "*" -> {
              double result = premierNombre * deuxiemeNombre;
              System.out.println(premierNombre + " * " + deuxiemeNombre + " = " + result);
            }
          }
        }
        else {
          System.out.println("Vous n'avez pas entré un opérateur légal.");
        }
      } catch (Exception err){
        System.out.println("Une de vos entrées n'est pas un nombre. Merci de n'entrer que des nombres.");
      }
    }
  }

  /**
   * Demande à l'utilisateur un nombre, puis retourne la somme des entiers entre 1 et ce nombre.
   */
  public static void departementDeLaPrefectureDAmiens(){
    Scanner scanner = new Scanner(System.in);
    int nombre;

    // Boucle conditionnelle permettant de vérifier si l'entrée est bien un nombre.
    boolean isInputLegal = false;
    while (!isInputLegal){
      System.out.println("Entrez votre nombre :");
      String premierInput = scanner.nextLine();

      try {
        nombre = Integer.parseInt(premierInput);
        isInputLegal = true;

        // Maintenant que les entrées sont vérifiées, on peut lancer la logique :
        int somme = 0;
        for (int i = 1; i <= nombre; i++) {
          System.out.print(i);
          if(i != nombre){
            System.out.print("+");
          }
          somme += i;
        }
        System.out.print("=" + somme);
      } catch (Exception err){
        System.out.println("Une de vos entrées n'est pas un nombre. Merci de n'entrer que des nombres.");
      }
    }
  }

  /**
   * Demande à l'utilisateur un nombre, puis génère un escalier d'étoiles de ce nombre de marches.
   */
  public static void stairwayToHeavenMadeOfStars(){
    Scanner scanner = new Scanner(System.in);
    int nombre;

    // Boucle conditionnelle permettant de vérifier si l'entrée est bien un nombre.
    boolean isInputLegal = false;
    while (!isInputLegal){
      System.out.println("Entrez votre nombre :");
      String premierInput = scanner.nextLine();

      try {
        nombre = Integer.parseInt(premierInput);
        isInputLegal = true;

        // Maintenant que les entrées sont vérifiées, on peut lancer la logique :
        // L'idée est de créer un tableau de N*N, N étant le nombre demandé
        for (int i = 0; i < nombre; i++) {
          for (int j = 0; j <= i; j++) {
            System.out.print("*");
          }
          System.out.println();
        }

      } catch (Exception err){
        System.out.println("Une de vos entrées n'est pas un nombre. Merci de n'entrer que des nombres.");
      }
    }
  }

  /**
   * Demande à l'utilisateur un nombre, puis créé une pyramide d'étoiles de cette hauteur, pointant vers la droite.
   */
  public static void pyramidToHeavenMadeOfStars(){
    Scanner scanner = new Scanner(System.in);
    int nombre;

    // Boucle conditionnelle permettant de vérifier si l'entrée est bien un nombre.
    boolean isInputLegal = false;
    while (!isInputLegal){
      System.out.println("Entrez votre nombre :");
      String premierInput = scanner.nextLine();

      try {
        nombre = Integer.parseInt(premierInput);
        isInputLegal = true;

        // Maintenant que les entrées sont vérifiées, on peut lancer la logique :
        // Une pyramide, c'est un escalier qui monte N fois, puis descend N - 1 fois, où
        // N = le nombre demandé

        // Partie montante
        for (int i = 0; i < nombre; i++) {
          for (int j = 0; j <= i; j++) {
            System.out.print("*");
          }
          System.out.println();
        }

        // Partie descendante
        for (int i = nombre - 1; i > 0; i--) {
          for (int j = 0; j < i; j++){
            System.out.print("*");
          }
          System.out.println();
        }

      } catch (Exception err){
        System.out.println("Une de vos entrées n'est pas un nombre. Merci de n'entrer que des nombres.");
      }
    }
  }

  /**
   * Demande à l'utilisateur un nombre, puis créé une pyramide d'étoiles de cette hauteur, pointant vers le haut.
   */
  public static void pyramideChiantePourRien(){
    Scanner scanner = new Scanner(System.in);
    int nombre;

    // Boucle conditionnelle permettant de vérifier si l'entrée est bien un nombre.
    boolean isInputLegal = false;
    while (!isInputLegal){
      System.out.println("Entrez votre nombre :");
      String premierInput = scanner.nextLine();

      try {
        nombre = Integer.parseInt(premierInput);
        isInputLegal = true;

        // Maintenant que les entrées sont vérifiées, on peut lancer la logique :
        // Le nombre d'étoiles d'une pyramide de hauteur N à une ligne L peut être calculé de la
        // façon suivante :
        // (N-L)*2+1, en considérant que L = 1 correspond à la base de la pyramide.
        // (5-5)*2+1 = 1 >     *
        // (5-4)*2+1 = 3 >    ***
        // (5-3)*2+1 = 5 >   *****
        // (5-2)*2+1 = 7 >  *******
        // (5-1)*2+1 = 9 > *********

        // L-1 est aussi le nombre d'espaces à mettre de chaque côté des étoiles.
        // Le code, donc :

        for (int i = nombre; i > 0; i--) {
          // On affiche le nombre d'espaces à gauche
          for(int j = 0; j < i-1; j++){
            System.out.print(" ");
          }
          // Puis le nombre d'étoiles au centre
          for(int k = 0; k < (nombre - i)*2+1; k++){
            System.out.print("*");
          }
          // Puis le nombre d'espaces à droite
          for(int j = 0; j < i-1; j++){
            System.out.print(" ");
          }
          System.out.println();
        }

      } catch (Exception err){
        System.out.println("Une de vos entrées n'est pas un nombre. Merci de n'entrer que des nombres.");
      }
    }
  }

  /**
   * Demande à l'utilisateur un nombre à virgule, puis lui retourne la séparation de ce nombre par dénomination.
   */
  public static void denominations(){
    Scanner scanner = new Scanner(System.in);
    double montant;

    // Boucle conditionnelle permettant de vérifier si les entrées sont bien des nombres.
    boolean isInputLegal = false;
    while (!isInputLegal){
      System.out.println("Entrez votre premier nombre :");
      String premierInput = scanner.nextLine();

      try {
        montant = Double.parseDouble(premierInput);
        isInputLegal = true;
        double[] valeurDenominations = new double[]{
          500.0, 200.0, 100.0, 50.0, 20.0, 10.0, 5.0, 2.0, 1.0, 0.50, 0.20, 0.10, 0.05, 0.02, 0.01
        };
        int[] nombreDenominations = new int[15];

        // Maintenant que les entrées sont vérifiées, on peut lancer la logique :
        for (int i = 0; i < valeurDenominations.length; i++) {
          while(montant >= valeurDenominations[i]){
            nombreDenominations[i]++;
            montant -= valeurDenominations[i];
          }
        }

        for (int i = 0; i < valeurDenominations.length; i++) {
          if(valeurDenominations[i] >= 5.0){
            System.out.print("Billet de ");
          }
          else{
            System.out.print("Pièce de ");
          }
          System.out.print(valeurDenominations[i] + "€ : " + nombreDenominations[i]);
          System.out.println();
        }
      } catch (Exception err){
        System.out.println("Une de vos entrées n'est pas un nombre. Merci de n'entrer que des nombres.");
      }
    }
  }

  /**
   * Demande à l'utilisateur une liste de températures, puis retourne la température la plus proche de 0.
   */
  public static void plusProcheDe0(){
    boolean isInputsLegal = false;
    boolean isInputsFinished = false;
    Scanner scanner = new Scanner(System.in);
    List<String> inputs = new ArrayList<>();
    List<Double> tempsInput = new ArrayList<>();
    List<Double> tempsAbsolues = new ArrayList<>();
    while(!isInputsLegal){
      while(!isInputsFinished){
        System.out.println("Entrez une température, ou Q pour quitter.");
        String res = scanner.nextLine();
        if(Objects.equals(res, "Q") || Objects.equals(res, "q")){
          isInputsFinished = true;
        }
        else{
          inputs.add(res);
        }
      }
      try {
        for (String input : inputs) {
          tempsInput.add(Double.parseDouble(input));
          tempsAbsolues.add(Math.abs(Double.parseDouble(input)));
        }
        isInputsLegal = true;
        // Maintenant que l'on sait que les températures sont bien des nombres, on peut lancer la logique.
        int index = tempsInput.indexOf(Collections.min(tempsAbsolues));
        System.out.println("La température la plus proche de 0 est " + tempsInput.get(index));
      }
      catch (Exception e){
        System.out.println("L'une de vos entrées n'est pas un nombre. Merci de n'entrer que des nombres.");
      }
    }
  }

  /**
   * Demande à l'utilisateur une liste de nombres et trie cette liste.
   */
  public static void triDeListe(){
    boolean isInputsLegal = false;
    boolean isInputsFinished = false;
    Scanner scanner = new Scanner(System.in);
    List<String> inputs = new ArrayList<>();
    List<Integer> listeInteger = new ArrayList<>();

    while(!isInputsLegal){
      while(!isInputsFinished){
        System.out.println("Entrez une valeur, ou Q pour quitter.");
        String res = scanner.nextLine();
        if(Objects.equals(res, "Q") || Objects.equals(res, "q")){
          isInputsFinished = true;
        }
        else{
          inputs.add(res);
        }
      }
      try {
        for (String input : inputs) {
          listeInteger.add(Integer.parseInt(input));
        }
        isInputsLegal = true;
        // Maintenant que l'on sait que les valeurs sont bien des nombres, on peut lancer la logique.
        Collections.sort(listeInteger);
        System.out.println(listeInteger);
      }
      catch (Exception e){
        System.out.println("L'une de vos entrées n'est pas un nombre. Merci de n'entrer que des nombres.");
      }
    }
  }
}
