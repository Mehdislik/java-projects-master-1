package fr.uvsq.cprog.collex.dessin;

import java.util.InputMismatchException;

public class ExAction implements Command{



    private String Action;
    private String Form;
    Dessin2D Draw=null;

    public ExAction(String form, String action) {
        this.Form = form;
        this.Action = action;
        this.Draw =new Dessin2D();

    }
    public String getForm() {
        return Form;
    }

    public void setForm(String form) {
        Form = form;
    }
    public String getAction() {
        return Action;
    }

    public void setAction(String action) {
        Action = action;
    }
    @Override
    public void execute() {


        if(this.Action.equals("Creer")) {
            if(this.Form.equals("Cercle")) {

                    Draw.creer_Circle();

            }
            else if(this.Form.equals("Rectangle")) {
                   Draw.Creer_Rectangle();

            }
            else if(this.Form.equals("Triangle")) {

                    Draw.creer_Triangle();

            }
            else {
                System.out.println("La forme n'est pas reconnue.");
                throw new InputMismatchException();
            }
        }

        else if(this.Action.equals("Supprimer")) {

            Draw.supprimer_forme();
        }
        else if(this.Action.equals("Deplacer")){
            Draw.deplacer_forme();

        }
        else if (this.Action.equals("Afficher")){
            Draw.Afficher_forme();

    }
}

}


















