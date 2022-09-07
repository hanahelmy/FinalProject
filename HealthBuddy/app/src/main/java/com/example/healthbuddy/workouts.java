package com.example.healthbuddy;

public class workouts {
    private String exename;
    private String exetype;
    private int exepic;

    public String getExename() {
        return exename;
    }

    public void setExename(String exename) {
        this.exename = exename;
    }

    public String getType() {
        return exetype;
    }

    public void setType(String type) {
        this.exetype = type;
    }

    public int getExepic() {
        return exepic;
    }

    public void setExepic(int exepic) {
        this.exepic = exepic;
    }

    public workouts(String exename, String type, int lunges) {
        this.exename = exename;
        this.exetype = type;
    }
}
