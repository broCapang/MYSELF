package exercises.sem2.Tutor.T1;

public class Telephone {
    private String areaCode, number;
    static private int numberOfTelObj=0;

    Telephone(String areaCode, String number){
        this.areaCode = areaCode;
        this.number = number;
        numberOfTelObj++;
    }

    public static int getNumberOfTelObj() {
        return numberOfTelObj;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public String getNumber() {
        return number;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String makeFullNumber(){
        String fullNum = areaCode + "-" + number;
        return fullNum;
    }
}
