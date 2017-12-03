# GPIO on Raspberry Pi with Kotlin native

Sample project using gpio rasp pi with kotlin native using Wiring pi.

## Initial project setup

Copy (or rename) the file `gradle.properties.sample` to `gradle.properties`
and update the values according to your requirements.

## Build the project using docker

Since cross compiling to Raspberry Pi can only be made on a linux
environment a docker container is used to perform the build.

To start the build process use the command `./gradlew buildWithDocker`.

You will se a warning that the target is not enabled on the current host.
This message is produced before the docker container has been started
and can be ignored.

## Deploying the artifact to a Raspberry Pi

In order to copy and execute the generated artifact on a Raspberry Pi
make sure to be able to open a ssh connection using your key and
execute `./gradlew deploy`.