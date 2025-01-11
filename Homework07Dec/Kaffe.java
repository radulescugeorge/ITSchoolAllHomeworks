public class Kaffe {

    public enum CoffeSize{
        SMALL(50, 15, "Small"),
        MEDIUM(100, 20, "Medium"),
        LARGE(150,25, "Large");

        private final int volume;
        private final int price;
        private final String description;

        CoffeSize(int volume, int price, String description) {
            this.volume = volume;
            this.price = price;
            this.description = description;
        }

        public int getVolume() {
            return volume;
        }

        public int getPrice() {
            return price;
        }

        public String getDescription() {
            return description;
        }
    }

}
