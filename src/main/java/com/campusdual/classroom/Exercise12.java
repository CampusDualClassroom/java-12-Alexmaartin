package com.campusdual.classroom;

public class Exercise12 {
    public static void main(String[] args) {

        Car myCar = new Car();


        System.out.println("Tacómetro es cero: " + myCar.isTachometerEqualToZero());


        myCar.start();
        System.out.println("Coche encendido, tacómetro > 0: " + myCar.isTachometerGreaterThanZero());


        myCar.start();
        System.out.println("Intento de encendido mientras está encendido: " + (myCar.tachometer > 0));


        myCar.stop();
        System.out.println("Coche apagado, tacómetro es cero: " + myCar.isTachometerEqualToZero());


        myCar.start();
        myCar.accelerate();
        System.out.println("Velocidad después de acelerar: " + myCar.speedometer);


        myCar.stop();
        System.out.println("Intento de apagar en movimiento, tacómetro > 0: " + (myCar.tachometer > 0));


        for (int i = 0; i < 30; i++) {
            myCar.accelerate();
        }
        System.out.println("Velocidad máxima alcanzada: " + myCar.speedometer);


        for (int i = 0; i < 30; i++) {
            myCar.brake();
        }
        System.out.println("Velocidad después de frenar hasta detenerse: " + myCar.speedometer);


        myCar.turnAngleOfWheels(20);
        System.out.println("Ángulo de las ruedas tras girar 20 grados: " + myCar.wheelsAngle);


        myCar.turnAngleOfWheels(50);
        System.out.println("Ángulo de las ruedas tras intentar girar 50 grados: " + myCar.wheelsAngle);


        myCar.brake(); // Asegurarse de que la velocidad sea cero
        myCar.setReverse(true);
        System.out.println("Marcha trasera activada (R): " + myCar.gear);


        myCar.start();
        myCar.accelerate();
        myCar.setReverse(true);
        System.out.println("Intento de marcha atrás en movimiento, marcha actual: " + myCar.gear);
    }
}
