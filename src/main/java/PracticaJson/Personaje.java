package PracticaJson;

import java.util.ArrayList;

public class Personaje {
    /// Atributos
    private int id;
    private String name;
    private double height;
    private double mass;
    private String gender;
    private String homeworld;
    private String wiki;
    private String image;
    private int born;
    private String bornLocation;
    private int died;
    private String diedLocation;
    private String species;
    private String hairColor;
    private String eyeColor;
    private String skinColor;
    private String cybernetics;
    private ArrayList<String> affiliations;
    private ArrayList<String> masters;
    private ArrayList<String> apprenctices;
    private ArrayList<String> formerAffiliations;

    private int dataCreated;
    private int dataDestroyed;
    private ArrayList <String> destroyedLocation;
    private String creator;
    private String manufacturer;
    private String model;
    private String clas;



    private String sensorColor;
    private ArrayList <String> platingColor;
    private String equipment;

    /// Constructores

    public Personaje(int id, String name, double height, double mass, String gender, String homeworld, String wiki, String image, int born, String bornLocation, int died, String diedLocation, String species, String hairColor, String eyeColor, String skinColor, String cybernetics, ArrayList<String> affiliations, ArrayList<String> masters, ArrayList<String> apprenctices, ArrayList<String> formerAffiliations, int dataCreated, ArrayList<String> destroyedLocation, int dataDestroyed, String creator, String manufacturer, String model, String clas, String sensorColor, ArrayList<String> platingColor, String equipment) {
        this.id = id;
        this.name = name;
        this.height = height;
        this.mass = mass;
        this.gender = gender;
        this.homeworld = homeworld;
        this.wiki = wiki;
        this.image = image;
        this.born = born;
        this.bornLocation = bornLocation;
        this.died = died;
        this.diedLocation = diedLocation;
        this.species = species;
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
        this.skinColor = skinColor;
        this.cybernetics = cybernetics;
        this.affiliations = affiliations;
        this.masters = masters;
        this.apprenctices = apprenctices;
        this.formerAffiliations = formerAffiliations;
        this.dataCreated = dataCreated;
        this.destroyedLocation = destroyedLocation;
        this.dataDestroyed = dataDestroyed;
        this.creator = creator;
        this.manufacturer = manufacturer;
        this.model = model;
        this.clas = clas;
        this.sensorColor = sensorColor;
        this.platingColor = platingColor;
        this.equipment = equipment;
    }
    public Personaje (){
    }

    /// getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHomeworld() {
        return homeworld;
    }

    public void setHomeworld(String homeworld) {
        this.homeworld = homeworld;
    }

    public String getWiki() {
        return wiki;
    }

    public void setWiki(String wiki) {
        this.wiki = wiki;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getBorn() {
        return born;
    }

    public void setBorn(int born) {
        this.born = born;
    }

    public String getBornLocation() {
        return bornLocation;
    }

    public void setBornLocation(String bornLocation) {
        this.bornLocation = bornLocation;
    }

    public int getDied() {
        return died;
    }

    public void setDied(int died) {
        this.died = died;
    }

    public String getDiedLocation() {
        return diedLocation;
    }

    public void setDiedLocation(String diedLocation) {
        this.diedLocation = diedLocation;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getSkinColor() {
        return skinColor;
    }

    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }

    public String getCybernetics() {
        return cybernetics;
    }

    public void setCybernetics(String cybernetics) {
        this.cybernetics = cybernetics;
    }

    public ArrayList<String> getAffiliations() {
        return affiliations;
    }

    public void setAffiliations(ArrayList<String> affiliations) {
        this.affiliations = affiliations;
    }

    public ArrayList<String> getMasters() {
        return masters;
    }

    public void setMasters(ArrayList<String> masters) {
        this.masters = masters;
    }

    public ArrayList<String> getApprenctices() {
        return apprenctices;
    }

    public void setApprenctices(ArrayList<String> apprenctices) {
        this.apprenctices = apprenctices;
    }

    public ArrayList<String> getFormerAffiliations() {
        return formerAffiliations;
    }

    public void setFormerAffiliations(ArrayList<String> formerAffiliations) {
        this.formerAffiliations = formerAffiliations;
    }

    public int getDataCreated() {
        return dataCreated;
    }

    public void setDataCreated(int dataCreated) {
        this.dataCreated = dataCreated;
    }

    public int getDataDestroyed() {
        return dataDestroyed;
    }

    public void setDataDestroyed(int dataDestroyed) {
        this.dataDestroyed = dataDestroyed;
    }

    public ArrayList<String> getDestroyedLocation() {
        return destroyedLocation;
    }

    public void setDestroyedLocation(ArrayList<String> destroyedLocation) {
        this.destroyedLocation = destroyedLocation;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getClas() {
        return clas;
    }

    public void setClas(String clas) {
        this.clas = clas;
    }

    public String getSensorColor() {
        return sensorColor;
    }

    public void setSensorColor(String sensorColor) {
        this.sensorColor = sensorColor;
    }

    public ArrayList<String> getPlatingColor() {
        return platingColor;
    }

    public void setPlatingColor(ArrayList<String> platingColor) {
        this.platingColor = platingColor;
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

}
