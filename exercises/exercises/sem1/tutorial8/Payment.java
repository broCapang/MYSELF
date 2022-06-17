package exercises.sem1.tutorial8;

public class Payment {
    private double amount;
    private String chequeNumber;
    private String cardName;
    private String cardType, expiration_date,validation_code;


    public Payment(double cash) {
        this.amount = cash;
    }

    public Payment(double chequeAmount, String chequeNumber) {
        this.amount = chequeAmount;
        this.chequeNumber = chequeNumber;
    }

    public Payment(double cardAmount, String cardName, String cardType, String expiration_date, String validation_code) {
        this.amount = cardAmount;
        this.cardName = cardName;
        this.cardType = cardType;
        this.expiration_date = expiration_date;
        this.validation_code = validation_code;
    }

}
