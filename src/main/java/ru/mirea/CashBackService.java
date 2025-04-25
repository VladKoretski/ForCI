package ru.mirea;

public class CashBackService {

        float PERCENT_SUBSCRIBED = 0.1f;
        float PERCENT_UNSUBSCRIBED = 0.05f;
        final public int MAX_BONUS = 1000;

        public int cashBackCalculation(int purchaseAmount, boolean ifSubscribed) {
        int bonus;

        if (ifSubscribed) {
            bonus = (int) (purchaseAmount * PERCENT_SUBSCRIBED);
        } else {
            bonus = (int) (purchaseAmount * PERCENT_UNSUBSCRIBED);
        }

        if (bonus > MAX_BONUS) {
            bonus = MAX_BONUS;
        }
        return bonus;
    }
}
