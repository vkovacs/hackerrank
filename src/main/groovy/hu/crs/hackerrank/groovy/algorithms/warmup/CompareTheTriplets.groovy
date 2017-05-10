package hu.crs.hackerrank.groovy.algorithms.warmup

/**
 * https://www.hackerrank.com/challenges/compare-the-triplets
 */

BufferedReader br = new BufferedReader(new InputStreamReader(System.in))

String aliceTripletString = br.readLine()
String bobTripletString = br.readLine()

List<Integer> aliceTriplet = aliceTripletString.split(" ").collect {it.toInteger()}
List<Integer> bobTriplet = bobTripletString.split(" ").collect {it.toInteger()}

assert aliceTriplet.size() == bobTriplet.size()

def aliceResult = 0
def bobResult = 0
for (int i = 0; i < aliceTriplet.size(); i++) {
    if (aliceTriplet.get(i) > bobTriplet.get(i)) {
        aliceResult++
    } else if (aliceTriplet.get(i) < bobTriplet.get(i)) {
        bobResult++
    }
}
println "$aliceResult $bobResult"