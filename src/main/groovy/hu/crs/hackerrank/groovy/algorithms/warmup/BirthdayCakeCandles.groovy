package hu.crs.hackerrank.groovy.algorithms.warmup
/**
 * https://www.hackerrank.com/challenges/birthday-cake-candles
 */

BufferedReader br = new BufferedReader(new InputStreamReader(System.in))
def candleCount = br.readLine()
List<BigInteger> candleHeights = br.readLine().split(" ").collect {it.toBigInteger()}

BigInteger max = candleHeights.max()
println candleHeights.findAll {it == max}.size()
