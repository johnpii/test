public enum VremenaGoda {
    spring(10), autumn(15), summer(25)
            {
                @Override
                public String getDescription() {
                    return "Тёплое время года";
                }
            }, winter(-10);
    public String favorite = "summer";
    double srTemperature;
    VremenaGoda(double srTemperature)
    {
        this.srTemperature = srTemperature;
    }
    VremenaGoda()
    {

    }
    public String getDescription()
    {
        return "Холодное время года";
    }
    public void myFavorite()
    {
        System.out.println("Лето — одно из четырёх времён года, между весной и осенью.");
    }
}
