package hu.crs.hackerrank.groovy.algorithms.warmup

/**
 * https://www.hackerrank.com/challenges/diagonal-difference
 */

BufferedReader br = new BufferedReader(new InputStreamReader(System.in))
int count = Integer.parseInt(br.readLine())
List<String> lines = new ArrayList<>()

count.times {lines << br.readLine()}

int primalDiagonalSum = 0
int secondaryDiagonalSum = 0
for (int i = 0; i < count; i++) {
    primalDiagonalSum += lines.get(i).split(" ")[i].toInteger()
    secondaryDiagonalSum += lines.get(i).split(" ")[count - 1 - i].toInteger()
}

println Math.abs(primalDiagonalSum - secondaryDiagonalSum)