package com.magiworldmain.steve;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static int SortCombatJoueur1;
    public static int SortCombatJoueur2;

    public static String NomClasseJoueur1;
    public static int ClasseJoueur1;
    public static int NiveauJoueur1;
    public static int VieJoueur1;
    public static int ForceJoueur1;
    public static int AgiliteJoueur1;
    public static int IntelligenceJoueur1;
    public static String SortBasiqueJoueur1;
    public static String SortSpecialJoueur1;

    public static String NomClasseJoueur2;
    public static int ClasseJoueur2;
    public static int NiveauJoueur2;
    public static int VieJoueur2;
    public static int ForceJoueur2;
    public static int AgiliteJoueur2;
    public static int IntelligenceJoueur2;
    public static String SortBasiqueJoueur2;
    public static String SortSpecialJoueur2;

    public static void main(String[] args) {

        /*Creation du joueur 1.
         */
        System.out.println("Création du Joueur 1 :");
        do {
            System.out.println("Veuillez choisir la classe de votre personnage (1 : Guerrier / 2 : Rodeur / 3 : Mage) :");
            int ClasseJoueur1 = sc.nextInt();
            if (ClasseJoueur1 == 1) {
                NomClasseJoueur1 = "Guerrier";
            }
            else if (ClasseJoueur1 == 2) {
                NomClasseJoueur1 = "Rodeur";
            }
            else if (ClasseJoueur1 == 3) {
                NomClasseJoueur1 = "Mage";
            } else {
                NomClasseJoueur1 = "Paysan";
            }
        } while (NomClasseJoueur1 == "Paysan");

        do {
            System.out.println("Choisissez votre niveau (de 1 à 100):");
            NiveauJoueur1 = sc.nextInt();
            VieJoueur1 = NiveauJoueur1 * 5;
        } while (NiveauJoueur1 > 100 || NiveauJoueur1 <= 0);//Pourquoi si je mets pas == 0 ca marche pas ? alors que j'ai mis strictement > et < ?

        do {
            System.out.println("Choisissez vos caractéristiques (le total Force, Agilité et Intelligence doit être égal à votre niveau) :");
            System.out.println(NomClasseJoueur1);
            System.out.println("Niveau : " + NiveauJoueur1);
            System.out.println("Vie : " + VieJoueur1);
            System.out.println("Force : " + ForceJoueur1);
            System.out.println("Agilité : " + AgiliteJoueur1);
            System.out.println("Intelligence : " + IntelligenceJoueur1);

            System.out.println("Force du personnage ?");
            ForceJoueur1 = sc.nextInt();

            System.out.println("Agilité du personnage ?");
            AgiliteJoueur1 = sc.nextInt();

            System.out.println("Intelligence du personnage ?");
            IntelligenceJoueur1 = sc.nextInt();

        } while (NiveauJoueur1 != ForceJoueur1 + AgiliteJoueur1 + IntelligenceJoueur1);

        System.out.println("Je suis un " + NomClasseJoueur1 + " de niveau " + NiveauJoueur1 + " j'ai " + ForceJoueur1 + " en force, " + AgiliteJoueur1 + " en agilité, " + IntelligenceJoueur1 + " en intelligence");

        //Je voudrais faire un tableau.
        if (NomClasseJoueur1 == "Guerrier") {
            SortBasiqueJoueur1 = "Coup d'Epée";
            SortSpecialJoueur1 = "Coup de Rage";
        } else if (NomClasseJoueur1 == "Rodeur") {
            SortBasiqueJoueur1 = "Tir à l'Arc";
            SortSpecialJoueur1 = "Concentration";
        } else if (NomClasseJoueur1 == "Mage") {
            SortBasiqueJoueur1 = "Boule de Feu";
            SortSpecialJoueur1 = "Soin";
        }

        /*Creation du joueur 2.
         */
        System.out.println("Création du Joueur 2 :");
        do {
            System.out.println("Veuillez choisir la classe de votre personnage (1 : Guerrier / 2 : Rodeur / 3 : Mage) :");
            int ClasseJoueur2 = sc.nextInt();
            if (ClasseJoueur2 == 1) {
                NomClasseJoueur2 = "Guerrier";
            }
            else if (ClasseJoueur2 == 2) {
                NomClasseJoueur2 = "Rodeur";
            }
            else if (ClasseJoueur2 == 3) {
                NomClasseJoueur2 = "Mage";
            } else {
                NomClasseJoueur2 = "Paysan";
            }
        } while (NomClasseJoueur2 == "Paysan");

        do {
            System.out.println("Choisissez votre niveau (de 1 à 100):");
            NiveauJoueur2 = sc.nextInt();
            VieJoueur2 = NiveauJoueur2 * 5;
        } while (NiveauJoueur2 > 100 || NiveauJoueur2 < 0 || NiveauJoueur2 == 0);//Pourquoi si je mets pas == 0 ca marche pas ? alors que j'ai mis strictement > et < ?

        do {
            System.out.println("Choisissez vos caractéristiques (le total Force, Agilité et Intelligence doit être égal à votre niveau) :");
            System.out.println(NomClasseJoueur2);
            System.out.println("Niveau : " + NiveauJoueur2);
            System.out.println("Vie : " + VieJoueur2);
            System.out.println("Force : " + ForceJoueur2);
            System.out.println("Agilité : " + AgiliteJoueur2);
            System.out.println("Intelligence : " + IntelligenceJoueur2);

            System.out.println("Force du personnage ?");
            ForceJoueur2 = sc.nextInt();

            System.out.println("Agilité du personnage ?");
            AgiliteJoueur2 = sc.nextInt();

            System.out.println("Intelligence du personnage ?");
            IntelligenceJoueur2 = sc.nextInt();

        } while (NiveauJoueur2 != ForceJoueur2 + AgiliteJoueur2 + IntelligenceJoueur2);

        System.out.println("Je suis un " + NomClasseJoueur2 + " de niveau " + NiveauJoueur2 + " j'ai " + ForceJoueur2 + " en force, " + AgiliteJoueur2 + " en agilité, " + IntelligenceJoueur2 + " en intelligence");

        if (NomClasseJoueur2 == "Guerrier") {
            SortBasiqueJoueur2 = "Coup d'Epée" ;
            SortSpecialJoueur2 = "Coup de Rage";
        } else if (NomClasseJoueur2 == "Rodeur") {
            SortBasiqueJoueur2 = "Tir à l'Arc";
            SortSpecialJoueur2 = "Concentration";
        } else if (NomClasseJoueur2 == "Mage") {
            SortBasiqueJoueur2 = "Boule de Feu";
            SortSpecialJoueur2 = "Soin";
        }

        /*Combat
         */
        do {
            System.out.println("Tour du joueur 1 (1 : Attaque Basique / 2 : Attaque Spéciale) :");
            int SortCombatJoueur1 = sc.nextInt();
            if (NomClasseJoueur1 == "Guerrier") {
                if (SortCombatJoueur1 == 1) {
                    VieJoueur2 = VieJoueur2 - ForceJoueur1;
                    System.out.println("Joueur 1 utilise " + SortBasiqueJoueur1 + " et inflige " + ForceJoueur1 + " points de dégâts.");
                    System.out.println("joueur 2 : " + VieJoueur2 + " points de vie.");
                    System.out.println("joueur 1 : " + VieJoueur1 + " points de vie.");
                } else if (SortCombatJoueur1 == 2) {
                    VieJoueur2 = VieJoueur2 - (ForceJoueur1 * 2);
                    VieJoueur1 = VieJoueur1 - (ForceJoueur1 / 2);
                    System.out.println("Joueur 1 utilise " + SortSpecialJoueur1 + " et inflige " + (ForceJoueur1 * 2) + " points de dégâts au joueur 2 mais subit " + (ForceJoueur1 / 2) + " points de dégâts.");
                    System.out.println("joueur 2 : " + VieJoueur2 + " points de vie.");
                    System.out.println("joueur 1 : " + VieJoueur1 + " points de vie.");
                } else {
                    System.out.println("Le joueur 1 trébuche et rate son attaque !");
                    System.out.println("joueur 2 : " + VieJoueur2 + " points de vie.");
                    System.out.println("joueur 1 : " + VieJoueur1 + " points de vie.");
                }
                if (VieJoueur2 <= 0) {
                    System.out.println("Le Joueur 1 gagne le combat avec honneur !");
                    break;
                }
            } else if (NomClasseJoueur1 == "Rodeur") {
                if (SortCombatJoueur1 == 1) {
                    VieJoueur2 = VieJoueur2 - AgiliteJoueur1;
                    System.out.println("Joueur 1 utilise " + SortBasiqueJoueur1 + " et inflige " + AgiliteJoueur1 + " points de dégats.");
                } else if (SortCombatJoueur1 == 2) {
                    AgiliteJoueur1 = (NiveauJoueur1 / 2) + AgiliteJoueur1;
                    System.out.println("Joueur 1 utilise " + SortSpecialJoueur1 + " ce qui augmente son agilité de " + (NiveauJoueur1 / 2));
                    System.out.println("joueur 2 : " + VieJoueur2 + " points de vie.");
                    System.out.println("joueur 1 : " + VieJoueur1 + " points de vie.");
                } else {
                    System.out.println("Le joueur 1 se casse un ongle en tirant sur la corde de l'arc et rate son attaque !");
                    System.out.println("joueur 2 : " + VieJoueur2 + " points de vie.");
                    System.out.println("joueur 1 : " + VieJoueur1 + " points de vie.");
                }
                if (VieJoueur2 <= 0) {
                    System.out.println("Le Joueur 1 gagne le combat avec ruse !");
                    break;
                }

            } else if (NomClasseJoueur1 == "Mage") {
                if (SortCombatJoueur1 == 1) {
                    VieJoueur2 = VieJoueur2 - IntelligenceJoueur1;
                    System.out.println("Joueur 1 utilise " + SortBasiqueJoueur1 + " et inflige " + IntelligenceJoueur1 + " points de dégats.");
                    System.out.println("joueur 2 : " + VieJoueur2 + " points de vie.");
                    System.out.println("joueur 1 : " + VieJoueur1 + " points de vie.");
                } else if (SortCombatJoueur1 == 2) {
                    VieJoueur1 = VieJoueur1 + (IntelligenceJoueur1 * 2);
                    System.out.println("Joueur 1 utilise " + SortSpecialJoueur2 + " et restaure ses point de vie de " + (IntelligenceJoueur1 * 2) + " points.");
                    System.out.println("joueur 2 : " + VieJoueur2 + " points de vie.");
                    System.out.println("joueur 1 : " + VieJoueur1 + " points de vie.");
                } else  {
                    System.out.println("Le joueur 1 se trompe de page dans son grimoire et rate son attaque !");
                    System.out.println("joueur 2 : " + VieJoueur2 + " points de vie.");
                    System.out.println("joueur 1 : " + VieJoueur1 + " points de vie.");
                }
                if (VieJoueur2 <= 0) {
                    System.out.println("Le Joueur 1 gagne le combat avec sagesse !");
                    break;
                }
            }

            System.out.println("Tour du joueur 2 (1 : Attaque Basique / 2 : Attaque Spéciale) :");
            int SortCombatJoueur2 = sc.nextInt();
            if (NomClasseJoueur2 == "Guerrier") {
                if (SortCombatJoueur2 == 1) {
                    VieJoueur1 = VieJoueur1 - ForceJoueur2;
                    System.out.println("Joueur 2 utilise " + SortBasiqueJoueur2 + " et inflige " + ForceJoueur2 + " points de dégâts.");
                    System.out.println("joueur 1 : " + VieJoueur1 + " points de vie.");
                    System.out.println("joueur 2 : " + VieJoueur2 + " points de vie.");
                } else if (SortCombatJoueur2 == 2) {
                    VieJoueur1 = VieJoueur1 - (ForceJoueur2 * 2);
                    VieJoueur2 = VieJoueur2 - (ForceJoueur2 / 2);
                    System.out.println("Joueur 2 utilise " + SortSpecialJoueur2 + " et inflige " + (ForceJoueur2 * 2) + " points de dégâts au joueur 2 mais subit " + (ForceJoueur2 / 2) + " points de dégâts.");
                    System.out.println("joueur 1 : " + VieJoueur1 + " points de vie.");
                    System.out.println("joueur 2 : " + VieJoueur2 + " points de vie.");
                } else {
                    System.out.println("Le joueur 2 trébuche et rate son attaque !");
                    System.out.println("joueur 1 : " + VieJoueur1 + " points de vie.");
                    System.out.println("joueur 2 : " + VieJoueur2 + " points de vie.");
                }
                if (VieJoueur1 <= 0) {
                    System.out.println("Le Joueur 2 gagne le combat avec honneur !");
                    break;
                }
            } else if (NomClasseJoueur2 == "Rodeur") {
                if (SortCombatJoueur2 == 1) {
                    VieJoueur1 = VieJoueur1 - AgiliteJoueur2;
                    System.out.println("Joueur 2 utilise " + SortBasiqueJoueur2 + " et inflige " + AgiliteJoueur2 + " points de dégats.");
                } else if (SortCombatJoueur2 == 2) {
                    AgiliteJoueur2 = (NiveauJoueur2 / 2) + AgiliteJoueur2;
                    System.out.println("Joueur 2 utilise " + SortSpecialJoueur2 + " ce qui augmente son agilité de " + (NiveauJoueur2 / 2));
                    System.out.println("joueur 1 : " + VieJoueur1 + " points de vie.");
                    System.out.println("joueur 2 : " + VieJoueur2 + " points de vie.");
                } else {
                    System.out.println("Le joueur 2 se casse un ongle en tirant sur la corde de l'arc et rate son attaque !");
                    System.out.println("joueur 1 : " + VieJoueur1 + " points de vie.");
                    System.out.println("joueur 2 : " + VieJoueur2 + " points de vie.");
                }
                if (VieJoueur1 <= 0) {
                    System.out.println("Le Joueur 2 gagne le combat avec ruse !");
                    break;
                }

            } else if (NomClasseJoueur2 == "Mage") {
                if (SortCombatJoueur2 == 1) {
                    VieJoueur1 = VieJoueur1 - IntelligenceJoueur2;
                    System.out.println("Joueur 2 utilise " + SortBasiqueJoueur2 + " et inflige " + IntelligenceJoueur2 + " points de dégats.");
                    System.out.println("joueur 1 : " + VieJoueur1 + " points de vie.");
                    System.out.println("joueur 2 : " + VieJoueur2 + " points de vie.");
                } else if (SortCombatJoueur2 == 2) {
                    VieJoueur2 = VieJoueur2 + (IntelligenceJoueur2 * 2);
                    System.out.println("Joueur 2 utilise " + SortSpecialJoueur2 + " et restaure ses point de vie de " + (IntelligenceJoueur2 * 2) + " points.");
                    System.out.println("joueur 1 : " + VieJoueur1 + " points de vie.");
                    System.out.println("joueur 2 : " + VieJoueur2 + " points de vie.");
                } else  {
                    System.out.println("Le joueur 2 se trompe de page dans son grimoire et rate son attaque !");
                    System.out.println("joueur 1 : " + VieJoueur1 + " points de vie.");
                    System.out.println("joueur 2 : " + VieJoueur2 + " points de vie.");
                }
                if (VieJoueur1 <= 0) {
                    System.out.println("Le Joueur 2 gagne le combat avec sagesse !");
                    break;
                }
            }
        } while (VieJoueur1 != 0 || VieJoueur1 < 0 || VieJoueur2 != 0 || VieJoueur2 < 0);

    }

}
