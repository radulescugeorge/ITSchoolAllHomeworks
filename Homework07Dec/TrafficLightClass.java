/**
 * Implement an enum TrafficLight with a method next() that transitions between RED, YELLOW, and GREEN.
 */

public class TrafficLightClass {

    public enum TrafficLight {
        RED {
            @Override
            public TrafficLight next() {
                return GREEN;
            }
        },
        GREEN {
            @Override
            public TrafficLight next() {
                return YELLOW;
            }
        },
        YELLOW {
            @Override
            public TrafficLight next() {
                return RED;
            }
        };

        public abstract TrafficLight next();
    }

}
