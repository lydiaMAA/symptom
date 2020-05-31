package com.example.symptome;

public class Questions {

    public String mesquestion[] = {
           " Quel est votre âge ?"
            ," Quelle a été votre température la plus élevée ces dernières 48 heures ?"
            ,"Quels sont les éléments de cette liste qui correspondent à votre situation? "
        ,"Êtes-vous dans l'impossibilité de vous alimenter ou boire DEPUIS 24 HEURES OU PLUS ?"
            ,"Dans les dernières 24 heures, avez-vous noté un manque de souffle INHABITUEL lorsque vous parlez ou faites un petit effort ?"

    };

    private  String meschoix[][]={
            {"Moins de 15 ans"," Entre 15 et 48 ans","Entre 50 et 64 ans","60 ans ou plus"},
            {"39 degré C","Entre 38 et 39 degré C","Température baisse,moins de 35 degré C","J'en ai pas eu de fiévre"},
            {"Etes vous diabétique"," Avez-vous eu un cancer dans les trois dernieres année!","Avez-vous une maladie réspératoire","Avez-vous une maladie chronique au foie"},
            {"oui mais uniquement boire","oui les deux","oui impossibilité d'alimenter","non pas dutout"},
            {"oui"," non","yes","no"}

    };
    private String mesCorrection[]={"60 ans ou plus","Entre 38 et 39 degré C","Avez-vous eu un cancer dans les trois dernieres année!","oui les deux","yes"};

    public String getquestion(int q){
        String question=mesquestion[q];
        return  question;
    }
    public String getchoix1(int q){
        String choix=meschoix[q][3];
        return  choix;
    }
    public String getchoix2(int q){
        String choix=meschoix[q][1];
        return  choix;
    }
    public String getchoix3(int q){
        String choix=meschoix[q][1];
        return  choix;
    }
    public String getchoix4(int q){
        String choix=meschoix[q][1];
        return  choix;
    }

    public String getcorrectAnswer(int q){
        String answer=mesCorrection[q];
        return  answer;
    }










}
