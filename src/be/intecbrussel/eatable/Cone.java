package be.intecbrussel.eatable;

public class Cone implements Eatable {
    //array met verchillende flavors
    private Flavors[] balls;

    //---------------------------------------------------------------------------

    //consrtuctor
    public Cone(){

    }
    //getting a error when try to put a enum as parameter
    public Cone(Flavors[] balls){
        this.balls = balls;

    }
    //--------------------------------------------------------------------------
    //methode eat
    @Override
    public void eat(){

        Cone.Flavors flavor = null;
        String text = null;
        switch(flavor){
            case CHOCO: text= "CHOCO"; break;
            case BANAAN: text= "BANAAN"; break;
            case STRAWBERRY: text= "STRAWBERRY"; break;
            case VANILLA: text= "VANILLA"; break;
            case LEMON: text= "LEMON"; break;
            case STRACIATELLA: text= "STRACIATELLA"; break;
            case MOKKA: text= "MOKKA"; break;
            case PISTACHE: text= "PISTACHE"; break;

        }
        System.out.println(text);

    }

    //geneste enums gaan gebruiken voor flavors
    public enum Flavors{
        CHOCO,
        BANAAN,
        STRAWBERRY,
        VANILLA,
        LEMON,
        STRACIATELLA,
        MOKKA,
        PISTACHE;
/*
        Cone GetType(Cone Flavors){
            return Flavors;
        }
        */

    }



}

