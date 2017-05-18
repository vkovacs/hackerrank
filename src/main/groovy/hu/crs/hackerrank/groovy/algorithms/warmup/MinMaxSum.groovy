package hu.crs.hackerrank.groovy.algorithms.warmup

/**
 * https://www.hackerrank.com/challenges/mini-max-sum
 */

BufferedReader br = new BufferedReader(new InputStreamReader(System.in))
List<BigInteger> numbers = br.readLine().split(" ").collect {it.toBigInteger()}.sort()

def sum = numbers.sum()
def minSum = sum - numbers[4]
def maxSum = sum - numbers[0]

println "$minSum $maxSum"