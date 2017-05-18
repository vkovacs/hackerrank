package hu.crs.hackerrank.groovy.algorithms.warmup

/**
 * https://www.hackerrank.com/challenges/time-conversion
 */

BufferedReader br = new BufferedReader(new InputStreamReader(System.in))
List<String> timeStringList = br.readLine().split(":")

int hour = timeStringList.get(0).toInteger()
int minutes = timeStringList.get(1).toInteger()
int seconds = timeStringList.get(2).substring(0,2).toInteger()
String amPm = timeStringList.get(2).substring(2)

if (amPm == "AM") {
    if (hour == 12) {
        hour = 0
    }
} else {
    if (hour != 12) {
        hour += 12
    }
}

println "${hour.toString().padLeft(2, "0")}:${minutes.toString().padLeft(2, "0")}:${seconds.toString().padLeft(2, "0")}"
