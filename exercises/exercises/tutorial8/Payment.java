package exercises.tutorial8;

public class Payment {
    private int cash;
    private int chequeAmount;
    private String chequeNumber;
    private int cardAmount;
    private String cardName;
    private String cardType, expiration_date,validation_code;


    public Payment(int cash) {
        this.cash = cash;
    }

    public Payment(int chequeAmount, String chequeNumber) {
        this.chequeAmount = chequeAmount;
        this.chequeNumber = chequeNumber;
    }

    public Payment(int cash, int cardAmount, String cardName, String cardType, String expiration_date, String validation_code) {
        this.cash = cash;
        this.cardAmount = cardAmount;
        this.cardName = cardName;
        this.cardType = cardType;
        this.expiration_date = expiration_date;
        this.validation_code = validation_code;
    }

}
