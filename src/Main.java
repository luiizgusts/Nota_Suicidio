
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Faculdade
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int i, ua = 0, ub = 0, uc = 0, tma = 0, tna = 0, tta = 0, tmb = 0, tnb = 0, ttb = 0, tmc = 0, tnc = 0, ttc = 0, tmt = 0, tnt = 0, ttt = 0;
        char e, t;
        for (i = 0; i < 50; i++) {
            System.out.println("Qual o elevador mais utilizado? A,B ou C?");
            e = entrada.next().toUpperCase().charAt(0);
            switch (e) {
                case 'A': {
                    ua = ua + 1;
                    System.out.println("Qual o periodo que voce mais utiliza o elevador?(M)Matutino,(N)Noturno,(V)Vespertino.");
                    t = entrada.next().toUpperCase().charAt(0);
                    switch (t) {
                        case 'M': {
                            tma = tma + 1;
                            break;
                        }
                        case 'N': {
                            tna = tna + 1;
                            break;
                        }
                        case 'V': {
                            tta = tta + 1;
                            break;
                        }
                        default: {
                            break;
                        }
                    }
                    break;
                }
                case 'B': {
                    ub = ub + 1;
                    System.out.println("Qual o periodo que voce mais utiliza o elevador?(M)Matutino,(N)Noturno,(V)Vespertino.");
                    t = entrada.next().toUpperCase().charAt(0);
                    switch (t) {
                        case 'M': {
                            tmb = tmb + 1;
                            break;
                        }
                        case 'N': {
                            tnb = tnb + 1;
                            break;
                        }
                        case 'V': {
                            ttb = ttb + 1;
                            break;
                        }
                        default: {
                            break;
                        }
                    }
                    break;
                }
                case 'C': {
                    uc = uc + 1;
                    System.out.println("Qual o periodo que voce mais utiliza o elevador?(M)Matutino,(N)Noturno,(V)Vespertino.");
                    t = entrada.next().toUpperCase().charAt(0);
                    switch (t) {
                        case 'M': {
                            tmc = tmc + 1;
                            break;
                        }
                        case 'N': {
                            tnc = tnc + 1;
                            break;
                        }
                        case 'V': {
                            ttc = ttc + 1;
                            break;
                        }
                        default: {
                            break;
                        }
                    }
                    break;
                }
                default: {
                    System.out.println("Coloque uma opção valida.");
                    break;
                }
            }
        }

        if ((ua > ub) && (ua > uc)) {
            System.out.println("O elevador mais utilizado é o A.");
            if ((tma > tna) && (tma > tta)) {
                System.out.println("E o periodo é o matutino.");
            }
            if ((tna > tta) && (tna > tma)) {
                System.out.println("E o periodo é o noturno.");
            }
            if ((tta > tna) && (tta > tma)) {
                System.out.println("E o periodo é o vespertino.");
            }
        }
        if ((ub > uc) && (ub > ua)) {
            System.out.println("O elevador mais utilizado é o B.");
            if ((tmb > tnb) && (tmb > ttb)) {
                System.out.println("E o periodo é o matutino.");
            }
            if ((tnb > tmb) && (tnb > ttb)) {
                System.out.println("E o periodo é o noturno.");
            }
            if ((ttb > tnb) && (ttb > tmb)) {
                System.out.println("E o periodo é o vespertino.");
            }
        }
        if ((uc > ub) && (uc > ua)) {
            System.out.println("O elevador mais utilizado é o C.");
            if ((tmc > tnc) && (tmc > ttc)) {
                System.out.println("E o periodo é o matutino.");
            }
            if ((tnc > tmc) && (tnc > ttc)) {
                System.out.println("E o periodo é o noturno.");
            }
            if ((ttc > tmc) && (ttc > tnc)) {
                System.out.println("E o periodo é o vespertino.");
            }
        }

        tmt = tma + tmb + tmc;
        tnt = tna + tnb + tnc;
        ttt = tta + ttb + ttc;
        if ((tmt > tnt) && (tmt > ttt)) {
            System.out.println("E o periodo é o matutino.");
        }
        if ((tnt > tmt) && (tnt > ttt)) {
            System.out.println("E o periodo é o noturno.");
        }
        if ((ttt > tmt) && (ttt > tnt)) {
            System.out.println("E o periodo é o vespertino.");
        }

        if ((ua > ub) && (ua > uc)) {
            System.out.println("O elevador mais utilizado é o A.");
            if ((tma > tna) && (tma > tta)) {
                tma = ((tma * 100) / (tma + tna + tta));
                System.out.println("A porcentagem do elevador mais usado é " + tma + ".");
            }
            if ((tna > tta) && (tna > tma)) {
                tna = ((tna * 100) / (tma + tna + tta));
                System.out.println("A porcentagem do elevador mais usado é " + tna + ".");
            }
            if ((tta > tna) && (tta > tma)) {
                tta = ((tta * 100) / (tma + tna + tta));
                System.out.println("A porcentagem do elevador mais usado é " + tta + ".");
            }
        }
        if ((ub > uc) && (ub > ua)) {
            System.out.println("O elevador mais utilizado é o B.");
            if ((tmb > tnb) && (tmb > ttb)) {
                tmb = ((tmb * 100) / (tmb + tnb + ttb));
                System.out.println("A porcentagem do elevador mais usado é " + tmb + ".");
            }
            if ((tnb > tmb) && (tnb > ttb)) {
                tnb = ((tnb * 100) / (tmb + tnb + ttb));
                System.out.println("A porcentagem do elevador mais usado é " + tnb + ".");
            }
            if ((ttb > tnb) && (ttb > tmb)) {
                ttb = ((ttb * 100) / (tmb + tnb + ttb));
                System.out.println("A porcentagem do elevador mais usado é " + ttb + ".");
            }
        }
        if ((uc > ub) && (uc > ua)) {
            System.out.println("O elevador mais utilizado é o C.");
            if ((tmc > tnc) && (tmc > ttc)) {
                tmc = ((tmc * 100) / (tmc + tnc + ttc));
                System.out.println("A porcentagem do elevador mais usado é " + tmc + ".");
            }
            if ((tnc > tmc) && (tnc > ttc)) {
                tnc = ((tnc * 100) / (tmc + tnc + ttc));
                System.out.println("A porcentagem do elevador mais usado é " + tnc + ".");
            }
            if ((ttc > tmc) && (ttc > tnc)) {
                ttc = ((ttc * 100) / (tmc + tnc + ttc));
                System.out.println("A porcentagem do elevador mais usado é " + ttc + ".");
            }
        }

        if ((ua < ub) && (ua < uc)) {
            System.out.println("O elevador menos utilizado é o A.");
            if ((tma < tna) && (tma < tta)) {
                tma = ((tma * 100) / (tma + tna + tta));
                System.out.println("A porcentagem do elevador menos usado é " + tma + ".");
            }
            if ((tna < tta) && (tna < tma)) {
                tna = ((tna * 100) / (tma + tna + tta));
                System.out.println("A porcentagem do elevador menos usado é " + tna + ".");
            }
            if ((tta < tna) && (tta < tma)) {
                tta = ((tta * 100) / (tma + tna + tta));
                System.out.println("A porcentagem do elevador menos usado é " + tta + ".");
            }
        }
        if ((ub < uc) && (ub < ua)) {
            System.out.println("O elevador menos utilizado é o B.");
            if ((tmb < tnb) && (tmb < ttb)) {
                tmb = ((tmb * 100) / (tmb + tnb + ttb));
                System.out.println("A porcentagem do elevador menos usado é " + tmb + ".");
            }
            if ((tnb < tmb) && (tnb < ttb)) {
                tnb = ((tnb * 100) / (tmb + tnb + ttb));
                System.out.println("A porcentagem do elevador menos usado é " + tnb + ".");
            }
            if ((ttb < tnb) && (ttb < tmb)) {
                ttb = ((ttb * 100) / (tmb + tnb + ttb));
                System.out.println("A porcentagem do elevador menos usado é " + ttb + ".");
            }
        }
        if ((uc < ub) && (uc < ua)) {
            System.out.println("O elevador menos utilizado é o C.");
            if ((tmc < tnc) && (tmc < ttc)) {
                tmc = ((tmc * 100) / (tmc + tnc + ttc));
                System.out.println("A porcentagem do elevador menos usado é " + tmc + ".");
            }
            if ((tnc < tmc) && (tnc < ttc)) {
                tnc = ((tnc * 100) / (tmc + tnc + ttc));
                System.out.println("A porcentagem do elevador menos usado é " + tnc + ".");
            }
            if ((ttc < tmc) && (ttc < tnc)) {
                ttc = ((ttc * 100) / (tmc + tnc + ttc));
                System.out.println("A porcentagem do elevador menos usado é " + ttc + ".");
            }
        }

        if ((ua < ub) && (ua > uc)) {
            System.out.println("O elevador de média utilidade é o A.");
            if ((tma < tna) && (tma > tta)) {
                tma = ((tma * 100) / (tma + tna + tta));
                System.out.println("A porcentagem do elevador média usado é " + tma + ".");
            }
            if ((tna < tta) && (tna > tma)) {
                tna = ((tna * 100) / (tma + tna + tta));
                System.out.println("A porcentagem do elevador média usado é " + tna + ".");
            }
            if ((tta < tna) && (tta > tma)) {
                tta = ((tta * 100) / (tma + tna + tta));
                System.out.println("A porcentagem do elevador média usado é " + tta + ".");
            }
        }
        if ((ub < uc) && (ub > ua)) {
            System.out.println("O elevador média utilidade é o B.");
            if ((tmb < tnb) && (tmb > ttb)) {
                tmb = ((tmb * 100) / (tmb + tnb + ttb));
                System.out.println("A porcentagem do elevador média usado é " + tmb + ".");
            }
            if ((tnb < tmb) && (tnb > ttb)) {
                tnb = ((tnb * 100) / (tmb + tnb + ttb));
                System.out.println("A porcentagem do elevador média usado é " + tnb + ".");
            }
            if ((ttb < tnb) && (ttb > tmb)) {
                ttb = ((ttb * 100) / (tmb + tnb + ttb));
                System.out.println("A porcentagem do elevador média usado é " + ttb + ".");
            }
        }
        if ((uc < ub) && (uc > ua)) {
            System.out.println("O elevador média utilidade é o C.");
            if ((tmc < tnc) && (tmc > ttc)) {
                tmc = ((tmc * 100) / (tmc + tnc + ttc));
                System.out.println("A porcentagem do elevador média usado é " + tmc + ".");
            }
            if ((tnc < tmc) && (tnc > ttc)) {
                tnc = ((tnc * 100) / (tmc + tnc + ttc));
                System.out.println("A porcentagem do elevador média usado é " + tnc + ".");
            }
            if ((ttc < tmc) && (ttc > tnc)) {
                ttc = ((ttc * 100) / (tmc + tnc + ttc));
                System.out.println("A porcentagem do elevador média usado é " + ttc + ".");
            }
        }
    }
}
