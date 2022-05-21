package behaviours;

import java.math.BigDecimal;

public interface ISell {

    BigDecimal getBuyingPrice();

    BigDecimal getSellingPrice();

    BigDecimal calculateMarkup();

}
