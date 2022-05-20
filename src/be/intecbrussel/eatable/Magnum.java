package be.intecbrussel.eatable;

public class Magnum extends Eatable{
    //variabele instellen
    private Magnum type;

    public void setType(Magnum type) {
        this.type = type;
    }

    public Magnum getType() {
        return type;
    }

    //-------------------------------------------------------
    //constructor

    public Magnum(){

    }
    public Magnum(Magnum type){

    }
    //---------------------------------------------------

    public void eat(){

        Magnumtype type = null;
        String text = null;
        switch(type){
            case MILKCHOCOLATE: text= "MILKCHOCOLATE"; break;
            case WHITECHOCOLATE: text= "WHITECHOCOLATE"; break;
            case BLACKCHOCOLATE: text= "BLACKCHOCOLATE"; break;
            case ALPINENUTS: text= "ALPINENUTS"; break;
            case ROMANTICSTRAWBERRIES: text= "ROMANTICSTRAWBERRIES"; break;

        }
        System.out.println(text);
    }



    //----------------------------------------------------------------
    //putting enum as a deep class
    public enum Magnumtype{
        MILKCHOCOLATE,
        WHITECHOCOLATE,
        BLACKCHOCOLATE,
        ALPINENUTS,
        ROMANTICSTRAWBERRIES;

        Magnum GetType(Magnum type){
            return type;
        }
    }


}
