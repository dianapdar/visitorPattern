import java.util.*;
public class TelcoAllowance implements UsagePromo{
    private static Map<String,Double> allowanceMap = new HashMap<>();

    static{        
        allowanceMap.put ("Smart", 500.00);
        allowanceMap.put ("Globe", 450.00);
        allowanceMap.put ("Ditto", 400.00);

    }
    @Override
    public String showAllowance (String telcoName, double money){
        return allowanceMap.get(telcoName) * money;
    }

}
