package statemachine.trafficlight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrafficLightTest {

    @Test
    public void testNext() {

        assertEquals(TrafficLight.TRAFFIC_LIGHT_STATE_RED, TrafficLight.TRAFFIC_LIGHT_STATE_YELLOW.next());
        assertEquals(TrafficLight.TRAFFIC_LIGHT_STATE_REDYELLOW, TrafficLight.TRAFFIC_LIGHT_STATE_RED.next());
        assertEquals(TrafficLight.TRAFFIC_LIGHT_STATE_GREEN, TrafficLight.TRAFFIC_LIGHT_STATE_REDYELLOW.next());
        assertEquals(TrafficLight.TRAFFIC_LIGHT_STATE_YELLOW, TrafficLight.TRAFFIC_LIGHT_STATE_GREEN.next());
    }

}