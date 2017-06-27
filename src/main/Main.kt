import wiringPi.*
import kotlinx.cinterop.*

val LED = 0

fun main(args: Array<String>) {

    wiringPiSetup()
    pinMode(LED, OUTPUT)

    while (true) {
        digitalWrite(LED, HIGH)
        delay(500)
        digitalWrite(LED, LOW)
        delay(500)
    }
}
