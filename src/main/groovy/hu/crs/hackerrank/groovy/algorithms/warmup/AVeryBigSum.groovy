package hu.crs.hackerrank.groovy.algorithms.warmup

/**
 * https://www.hackerrank.com/challenges/a-very-big-sum
 */

BufferedReader br = new BufferedReader(new InputStreamReader(System.in))

String count = br.readLine()
String integersString = br.readLine()

List<BigInteger> bigIntegers = integersString.split(" ").collect{it.toBigInteger()}

println bigIntegers.sum()