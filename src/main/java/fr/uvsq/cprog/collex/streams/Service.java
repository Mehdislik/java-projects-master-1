package fr.uvsq.cprog.collex.streams;
/**
 * @author :debbah Mehdi Sofiane
 * defintion   de l'enumeration de service
 *
 *
 */
public enum Service {
    FINANCE("FINANCE","26, rue du Château"),
    MARKETING("MARKETING"," 99 ,rue du Faubourg National"),
    COMMERCIAL("COMMERCIAL","40, avenue de l'Amandier"),
    INDUSTRIEL("INDUSTRIEL","14 ,Place du Jeu de Paume"),
    DIRECTION_ACHAT("DIRECTION_ACHAT","43,avenue de l'Amandier"),
    RESSOURCE_HUMAINE("RESSOURCE_HUMAINE","42 ,avenue de l'Amandier");


    final String nom_service;
    final String adresse_serv;

    Service(String n, String adr) {
        nom_service = n;
        adresse_serv = adr;
    }

    public String getAdresse() {
        return adresse_serv;
    }

    public String getNom() {
        return nom_service;
    }

    public String getService() {
        return getNom() + " " + getAdresse();
    }

}
