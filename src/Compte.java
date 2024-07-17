import java.util.Scanner;

public class Compte {
    public static void main(String[] args){

        int monOption;
        String numeroCompte;
        String optionUn = "1. Créer un Compte";
        String optionDeux = "2. Afficher un Compte";
        String optionTrois = "3. Créer une ligne Comptable";
        String optionQuatre = "4. Sortir";
        String optionCinq = "5. De l'aide";
        String sousOptionUn_Un = "--> Types du compte [Types possibles : courant , joint , épargne]";
        String sousOptionUn_Deux = "--> Numéro du compte:";
        String sousOptionUn_Trois = "--> Première valeur créditée:";
        String sousOptionUn_Quatre = "--> Taux de placement:";

        Scanner saisirOption = new Scanner(System.in);
        System.out.println(optionUn+"\n"+optionDeux+"\n"+optionTrois+"\n"+optionQuatre+"\n"+optionCinq );

        System.out.print("Saisir une valeur compris entre 1 et 5 en fonction de votre besoin");
        monOption = saisirOption.nextInt();

        switch (monOption){
            case 1 :
                System.out.println(sousOptionUn_Un+"\n"+sousOptionUn_Deux+"\n"+sousOptionUn_Trois+"\n"+sousOptionUn_Quatre );
            break;

            case 2 :
                Scanner sousOption = new Scanner(System.in);
                System.out.println("Saisissez le numéro de compte que vous souhaitez consulter: ");
                numeroCompte = sousOption.next();
                System.out.println("Vous avez maintenant accès au compte numéro: "+ numeroCompte);
            break;

            case 3 :

                System.out.println("Option non programmée.");
            break;

            case 4 :

                System.exit(0);
            break;

            case 5 :

                System.out.println("A travers ce programme vous avez droit à 5 options pour la gestion de vottre compte bancaire.");
            break;

            default:

                System.out.println(optionUn+"\n"+optionDeux+"\n"+optionTrois+"\n"+optionQuatre+"\n"+optionCinq );
            break;
        }
    }
}
