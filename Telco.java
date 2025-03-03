public class Telco implements TelcoSubscription{
    private String telcoName;
    private double promoPrice;
    private int dataAllowance;
    private boolean unliCallText;

    public Telco (String telcoName, double promoPrice, int dataAllowance, boolean unliCallText){
        this.telcoName =  telcoName;
        this.promoPrice = promoPrice;
        this.dataAllowance = dataAllowance;
        this.unliCallText = unliCallText;
    }
    @Override
    private String accept (UsagePromo promo, double price){
        this.promoPrice = promoPrice;
        return promo.showAllowance(telcoName, price);

    }

    @Override
    private String accept (UnliCallsTextOffer unliPackage, boolean unlCallText){
        this.telcoName = telcoName;
        return unliPackage.showUnliCallsTextOffer(telcoName, unlCallText);

    }


}