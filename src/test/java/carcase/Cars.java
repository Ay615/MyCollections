package carcase;

public class Cars implements  Comparable<Cars>{
    private int year;
    private String make;
    private String model;
    private String license_plate_number;

    public Cars(int year, String make, String model, String license_plate_number) {
        this.year = year;
        this.make = make;
        this.model = model;
        this.license_plate_number = license_plate_number;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getLicense_plate_number() {
        return license_plate_number;
    }

    public void setLicense_plate_number(String license_plate_number) {
        this.license_plate_number = license_plate_number;
    }
    @Override
    public String toString() {
        return
                year +" "+ make +" "+  model+" " + license_plate_number ;
    }


    @Override
    public int compareTo(Cars cars) {
        if(year==cars.year)
        return 0;
        else if(year>cars.year)
            return 1;
        else
            return -1;
    }
}
