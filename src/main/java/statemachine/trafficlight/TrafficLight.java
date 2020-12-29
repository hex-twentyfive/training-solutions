package statemachine.trafficlight;

public enum TrafficLight {

    TRAFFIC_LIGHT_STATE_RED {
        TrafficLight next() {
            return TrafficLight.TRAFFIC_LIGHT_STATE_REDYELLOW;
        }
    },
    TRAFFIC_LIGHT_STATE_REDYELLOW {
        TrafficLight next() {
            return TrafficLight.TRAFFIC_LIGHT_STATE_GREEN;
        }
    },
    TRAFFIC_LIGHT_STATE_GREEN {
        TrafficLight next() {
            return TrafficLight.TRAFFIC_LIGHT_STATE_YELLOW;
        }
    },
    TRAFFIC_LIGHT_STATE_YELLOW {
        TrafficLight next() {
            return TrafficLight.TRAFFIC_LIGHT_STATE_RED;
        }
    };

    abstract TrafficLight next();

}
