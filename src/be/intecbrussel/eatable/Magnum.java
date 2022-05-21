package be.intecbrussel.eatable;

public class Magnum implements Eatable{
    //variabele instellen
    private Magnumtype type;





    //-------------------------------------------------------
    //constructor

    public Magnum(){

    }
    public Magnum(Magnumtype type){
        this.type = type;

    }
    //---------------------------------------------------
    @Override
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
    //-----------------------------------------------------------------

    public Magnumtype getType() {
        return type;
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
