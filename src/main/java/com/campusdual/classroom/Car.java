package com.campusdual.classroom;

public class Car {

    public final int MAX_SPEED = 200;
    public final int MAX_ANGLE = 45;



    int tachometer = 0; // Tacómetro inicial en 0
    int speedometer = 0; // Velocímetro inicial en 0
    int wheelsAngle = 0; // Ángulo de las ruedas inicial en 0
    boolean isOn = false; // Estado del coche apagado
    String gear = "N"; // Marcha inicial en neutral




    public boolean isTachometerGreaterThanZero() {
        return tachometer > 0;
    }


    public boolean isTachometerEqualToZero() {
        return tachometer == 0;
    }


    public void start() {
        if (!isOn) {
            isOn = true;
            tachometer = 700;
        }
    }


    public void stop() {
        if (speedometer == 0) {
            isOn = false;
            tachometer = 0;
        }
    }


    public void accelerate() {
        if (isOn && speedometer < MAX_SPEED) {
            speedometer += 10;
            if (speedometer > MAX_SPEED) {
                speedometer = MAX_SPEED;
            }
        }
    }


    public void brake() {
        if (speedometer > 0) {
            speedometer -= 10;
            if (speedometer < 0) {
                speedometer = 0;
            }
        }
    }


    public void turnAngleOfWheels(int angle) {
        int newAngle = wheelsAngle + angle;
        if (newAngle > MAX_ANGLE) {
            wheelsAngle = MAX_ANGLE;
        } else if (newAngle < -MAX_ANGLE) {
            wheelsAngle = -MAX_ANGLE;
        } else {
            wheelsAngle = newAngle;
        }
    }


    public void setReverse(boolean reverse) {
        if (reverse && speedometer == 0) {
            gear = "R";
        } else if (!reverse) {
            gear = "N";
        }
    }
}
