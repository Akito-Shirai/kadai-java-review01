
public class Review01 {
    // 可変とするため、定数で定義
    public static final int BASE_PRICE = 1500;
    public static final double TAX_RATE = 10.0; // 税率10%

    public static void main(String[] args) {
        int taxAmount = calcTax(BASE_PRICE, TAX_RATE);
        int priceIncTax = BASE_PRICE + taxAmount;

        System.out.println(BASE_PRICE + "円の商品の税込価格は" + priceIncTax + "円（消費税は" + taxAmount + "円）です。");
    }

    public static int calcTax(int price, double taxRate) {
        return (int) Math.floor(price * taxRate / 100.0);   //小数点切り捨て
    }

}
